parser grammar BythonParser;
// options { tokenVocab=BythonLexer; output=AST; }

program
    : (classDecl | functionDecl | statement)* EOF
    ;

classDecl
    : CLASS IDENTIFIER (LPAR identifierList? RPAR)? LBRACE classMember* RBRACE
    ;

classMember
    : methodDecl
    | simpleAssignment SEMI
    ;

functionDecl
    : DEF IDENTIFIER LPAR identifierList? RPAR block
    ;

methodDecl
    : DEF IDENTIFIER LPAR methodParamList? RPAR block
    ;

identifierList
    : IDENTIFIER (COMMA IDENTIFIER)*
    ;

methodParamList
    : (IDENTIFIER | SELF) (COMMA IDENTIFIER)*
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
    | CONTINUE SEMI
    | BREAK SEMI
    | PASS SEMI
    ;

assignment
    : simpleAssignment
    | implicitAssignment
    | compoundAssignment
    ;

simpleAssignment
    : IDENTIFIER ASSIGN expression
    ;

implicitAssignment
    : (IDENTIFIER | objectProperty) (PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | SLASH_ASSIGN) expression
    ;

compoundAssignment: objectProperty ASSIGN expression;

methodCall
    : (callableExpression DOT)? IDENTIFIER LPAR argumentList? RPAR (DOT methodCall)?
    ;

ifStatement
    : IF LPAR valueExpression RPAR block (ELSE block)?
    ;

whileStatement
    : WHILE LPAR valueExpression RPAR block
    ;

forStatement
    : FOR IDENTIFIER IN (expression | IDENTIFIER) block
    ;

returnStatement
    : RETURN expression? SEMI
    ;

expression
    : valueExpression
    | assignment
    ;

valueExpression
    : valueExpression (STAR | SLASH) valueExpression
    | valueExpression (PLUS | MINUS) valueExpression
    | valueExpression (EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | LESS | GREATER) valueExpression
    | NOT valueExpression
    | valueExpression AND valueExpression
    | valueExpression OR valueExpression
    | LPAR valueExpression RPAR
    | NUMBER_LITERAL
    | callableExpression
    | methodCall
    ;

callableExpression
    : objectProperty
    | IDENTIFIER
    | CallableLiteral   
    ;

objectProperty
    : (IDENTIFIER | SELF) DOT IDENTIFIER
    ;

argumentList
    : expression (COMMA expression)*
    ;

