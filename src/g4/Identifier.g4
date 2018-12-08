lexer grammar Identifier;

fragment ALPHABET: [A-Za-z_];
fragment DIGIT: [0-9]; 

IDENTIFIER: ALPHABET+(DIGIT(ALPHABET)*)*;
identifier: IDENTIFIER;