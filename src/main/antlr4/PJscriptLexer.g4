lexer grammar PJscriptLexer;

NEW : 'new';
DEF: 'def';

RETURN : 'return';
FOR: 'for';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
ASSIGN : '=';
SEMI : ';';
LPAR : '(' ;
RPAR : ')' ;
LBRACE: '{';
RBRACE: '}';
COMMA: ',';

CLASS: 'class';
THIS: 'this';
EXTENDS: 'extends';

DOT: '.';
STAR: '*';
SLASH: '/';
PLUS: '+';
MINUS: '-';
    
CallableLiteral
    : StringLiteral
    | TRUE
    | FALSE
    ;

NumberLiteral
    : IntegerLiteral
    | DoubleLiteral
    ;    
    
EQUAL: '==';
NOTEQUAL: '!=';
LESS: '<';
GREATER: '>';
LESSEQUAL: '<=';
GREATEREQUAL: '>=';
AND: 'and';
OR: 'or';
NOT : 'not';
TRUE: 'True';
FALSE: 'False';

Identifier
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

IntegerLiteral
    : [0-9]+
    ;

DoubleLiteral
    : [0-9]+'.'[0-9]+
    ;

StringLiteral
    : '"' .*? '"'
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

COMMENT
    : '//' ~[\r\n]* -> skip
    ;
