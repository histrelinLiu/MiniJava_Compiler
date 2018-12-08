grammer Statement;

statement:	    LBRACE ( statement )* RBRACE
            |	IF LPAREN expression RPAREN statement ELSE statement
            |	WHILE LPAREN expression RPAREN statement
            |	SOP LPAREN expression RPAREN SEMI
            |	identifier ASSIGN expression SEMI
            |	identifier LBRACK expression RBRACK ASSIGN expression SEMI;
