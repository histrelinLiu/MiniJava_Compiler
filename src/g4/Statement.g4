grammar Statement;

statement:	    LBRACE ( statement )* RBRACE
            |	IF LPAREN expression RPAREN statement ELSE statement
            |	WHILE LPAREN expression RPAREN statement
            |	SOP LPAREN expression RPAREN SEMI
            |	IDENTIFIER ASSIGN expression SEMI
            |	IDENTIFIER LBRACK expression RBRACK ASSIGN expression SEMI;
