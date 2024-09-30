parser grammar BythonParser;

program
    : (classDecl | functionDecl | statement)* EOF
    ;

classDecl
    : CLASS ID (LPAR identifierList? RPAR)? LBRACE classMember* RBRACE
    ;

classMember
    : methodDecl
    | simpleAssignment SEMI
    ;

functionDecl
    : DEF ID LPAR identifierList? RPAR block
    ;

methodDecl
    : DEF ID LPAR methodParamList? RPAR block
    ;

identifierList
    : ID (COMMA ID)*
    ;

methodParamList
    : (ID | SELF) (COMMA ID)*
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
    | importStatement
    | tryExceptStatement
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
    : ID ASSIGN expression
    ;

implicitAssignment
    : (ID | objectProperty) (PLUS_ASSIGN | MINUS_ASSIGN | STAR_ASSIGN | SLASH_ASSIGN) expression
    ;

compoundAssignment: objectProperty ASSIGN expression;

methodCall
    : (callableExpression DOT)? ID LPAR argumentList? RPAR (DOT methodCall)?
    ;

ifStatement
    : IF (LPAR valueExpression RPAR | valueExpression) block (ELSE block)?
    ;

whileStatement
    : WHILE LPAR valueExpression RPAR block
    ;

forStatement
    : FOR ID IN (expression | ID) block
    ;

returnStatement
    : RETURN expression? SEMI
    ;

importStatement
    : IMPORT moduleName (AS aliasName)? SEMI
    | FROM moduleName IMPORT (ID | LPAR ID (COMMA ID)* RPAR | STAR) (AS aliasName)? SEMI
    ;

tryExceptStatement
    : TRY block
      (EXCEPT (exceptionList (AS ID)?)? block)*
      (FINALLY block)?
    ;

exceptionList
    : ID (UNION ID)*
    ;

moduleName: DOT? ID (DOT ID)*;
aliasName: ID;

expression
    : valueExpression
    | assignment
    ;

valueExpression
    : valueExpression (STAR | SLASH) valueExpression
    | valueExpression (PLUS | MINUS) valueExpression
    | valueExpression (EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | LESS | GREATER) valueExpression
    | valueExpression NOT IS valueExpression
    | valueExpression IS valueExpression
    | valueExpression NOT IN valueExpression
    | valueExpression IN valueExpression
    | NOT valueExpression
    | valueExpression AND valueExpression
    | valueExpression OR valueExpression
    | LPAR valueExpression RPAR
    | NUMBER_LITERAL
    | callableExpression
    | methodCall
    | lambdaExpression
    ;

lambdaExpression
    : LAMBDA (LPAR identifierList? RPAR | identifierList)? (COLON expression | block)
    ;

callableExpression
    : objectProperty
    | ID
    | CallableLiteral
    | collection
    ;

collection
    : listLiteral
    | tupleLiteral
    | dictLiteral
    | setLiteral
    ;

listLiteral
    : LBRACK (expression (COMMA expression)*)? RBRACK
    ;

tupleLiteral
    : LPAR (expression (COMMA expression)*)? RPAR
    ;

dictLiteral
    : LBRACK (expression COLON expression (COMMA expression COLON expression)*)? RBRACK
    ;

setLiteral
    : LBRACK (expression (COMMA expression)*) RBRACK
    ;

objectProperty
    : (ID | SELF) DOT ID
    ;

argumentList
    : expression (COMMA expression)*
    ;
