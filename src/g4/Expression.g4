grammar Expression;

expression	:	expression ( AND | LT | ADD | SUB | MUL ) expression
            |	expression LBRACK expression RBRACK
            |	expression DOT LENGTH
            |	expression DOT identifier LPAREN ( expression ( COMMA expression )* )? RPAREN
            |	Integer
            |	TRUE
            |	FALSE
            |	identifier
            |	THIS
            |	NEW INT LBRACK expression RBRACK
            |	NEW identifier LPAREN RPAREN
            |	BANG expression
            |	LPAREN expression RPAREN;
            