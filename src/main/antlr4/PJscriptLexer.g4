lexer grammar BythonLexer;

DEF: 'def';

RETURN: 'return';
FOR: 'for';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
ASSIGN : '=';
SEMI: ';';
LPAR: '(' ;
RPAR: ')' ;
LBRACE: '{';
RBRACE: '}';
COMMA: ',';

CLASS: 'class';
SELF: 'self';

DOT: '.';
STAR: '*';
SLASH: '/';
PLUS: '+';
MINUS: '-';

PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
STAR_ASSIGN: '*=';
SLASH_ASSIGN: '/=';

    
CallableLiteral
    : STRING_LITERAL
    | TRUE
    | FALSE
    ;

NUMBER_LITERAL
    : INTEGER_LITERAL
    | DOUBLE_LITERAL
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
IN: 'in';
TRUE: 'True';
FALSE: 'False';
BREAK: 'break';
CONTINUE: 'continue';
PASS: 'pass';

IDENTIFIER
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

INTEGER_LITERAL
    : [0-9]+
    ;

DOUBLE_LITERAL
    : [0-9]+'.'[0-9]+
    ;

STRING_LITERAL
    : '"' .*? '"'
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

COMMENT
    : '//' ~[\r\n]* -> skip
    ;
