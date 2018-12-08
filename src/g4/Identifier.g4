lexer grammar Identifier;

fragment ALPHABET: [A-Za-z_];
fragment DIGIT: [0-9]; 
NUMBER: DIGIT+('.'DIGIT+)? ;

identifier: ALPHABET+(DIGIT(ALPHABET)*)*;