lexer grammar Integer;

Integer : SUB? DIGIT+;
integer : Integer;
