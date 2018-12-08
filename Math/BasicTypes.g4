lexer grammar BasicTypes;

fragment DIGIT: [0-9]; 
//Fragment修饰的方法，到时候在程序里不会生成 DIGIT()。
//而下面的NUMBER没有fragment, 则可以通过 NUMBER() 来访问。

fragment S_QUOTE: '\'';
fragment QUOTE: '"';
fragment ALPHABET: [A-Za-z_];

NUMBER: DIGIT+('.'DIGIT+)? ; //数字类型，包括浮点和整型

// 两种模式，一种是单引号，一种是双引号
STRING: S_QUOTE (~'\'')* S_QUOTE //单引号字符串
    | QUOTE ('\\"'|~'"')* QUOTE //双引号字符串
    ;

ID: ALPHABET+(DIGIT(ALPHABET)*)*;

WS: [ \r\t\n]+ -> skip; // Skip all the white spaces.