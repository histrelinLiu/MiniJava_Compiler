lexer grammar Reserved;

// 字符
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';
SEMI:   ';';
COMMA:  ',';
DOT:    '.';

//运算符 : '&&' | '<' | '+' | '-' | '*' | '=' | '!'
AND:    '&&';
LT:     '<';
ADD:    '+';
SUB:    '-';
MUL:    '*';
ASSIGN: '=';
BANG:   '!';

//保留字
CLASS       : 'class';
PUBLIC      : 'public';
STATIC      : 'static';
VOID        : 'void';
MAIN        : 'main';
STRING      : 'String';
EXTENDS     : 'extends';
RETURN      : 'return';
INT         : 'int';
BOOLEAN     : 'boolean';
IF          : 'if';
ELSE        : 'else';
WHILE       : 'while';
SOP         : 'System.out.println';
LENGTH      : 'length';
TRUE        : 'true';
FALSE       : 'false';
THIS        : 'this';
NEW         : 'new';

// whitespace
WS: [ \r\t\n]+ -> skip;














































