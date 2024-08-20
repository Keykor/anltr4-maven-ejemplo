parser grammar PJscriptParser;
options { tokenVocab=PJscriptLexer; output=AST; }

program
    : (classDecl | methodDecl | statement)* EOF
    ;

classDecl
    : CLASS Identifier (EXTENDS Identifier)? LBRACE classMember* RBRACE
    ;

classMember
    : methodDecl
    | variableDecl SEMI
    ;

methodDecl
    : DEF Identifier LPAR parameterList? RPAR block
    ;

variableDecl
    : Identifier (ASSIGN expression)?
    ;

parameterList
    : Identifier (COMMA Identifier)*
    ;

block
    : LBRACE statement* RBRACE
    ;

statement
    : block
    | expression SEMI
    | ifStatement
    | whileStatement
    | forStatement
    | returnStatement
    ;

assignment
    : (Identifier | objectProperty) ASSIGN expression
    ;

methodCall
    : (callableExpression DOT)? Identifier LPAR argumentList? RPAR (DOT methodCall)?
    ;

ifStatement
    : IF LPAR valueExpression RPAR block (ELSE block)?
    ;

whileStatement
    : WHILE LPAR valueExpression RPAR block
    ;

forStatement
    : FOR LPAR variableDecl SEMI valueExpression SEMI assignment RPAR block
    ;

returnStatement
    : RETURN expression? SEMI
    ;

expression
    : valueExpression
    | assignment
    | objectInstantation
    ;

valueExpression
    : valueExpression (STAR | SLASH ) valueExpression
    | valueExpression (PLUS | MINUS ) valueExpression
    | valueExpression (EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | LESS | GREATER ) valueExpression
    | NOT valueExpression
    | valueExpression AND valueExpression
    | valueExpression OR valueExpression
    | LPAR valueExpression RPAR
    | NumberLiteral
    | callableExpression
    | methodCall
    ;

callableExpression
    : objectProperty
    | Identifier
    | CallableLiteral   
    ;

objectInstantation
    : NEW Identifier LPAR argumentList? RPAR
    ;

objectProperty
    : (Identifier | THIS) DOT Identifier
    ;

argumentList
    : expression (COMMA expression)*
    ;

