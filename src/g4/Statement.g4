grammer Statement;

Statement	:	LBRACE ( Statement )* RBRACE
            |	IF LPAREN Expression RPAREN Statement ELSE Statement
            |	WHILE LPAREN Expression RPAREN Statement
            |	SOP LPAREN Expression RPAREN SEMI
            |	Identifier ASSIGN Expression SEMI
            |	Identifier LBRACK Expression RBRACK ASSIGN Expression SEMI;
