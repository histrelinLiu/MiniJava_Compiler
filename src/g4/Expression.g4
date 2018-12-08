grammar Expression;

expression	:	expression ( AND | LT | ADD | SUB | MUL ) expression
            |	expression LBRACK expression RBRACK
            |	expression DOT LENGTH
            |	expression DOT IDENTIFIER LPAREN ( expression ( COMMA expression )* )? RPAREN
            |	Integer
            |	TRUE
            |	FALSE
            |	IDENTIFIER
            |	THIS
            |	NEW INT LBRACK expression RBRACK
            |	NEW IDENTIFIER LPAREN RPAREN
            |	BANG expression
            |	LPAREN expression RPAREN;
            