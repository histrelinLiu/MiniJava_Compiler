grammer Expression;

Expression	:	Expression ( AND | LT | ADD | SUB | MUL ) Expression
            |	Expression LBRACK Expression RBRACK
            |	Expression DOT LENGTH
            |	Expression DOT Identifier LPAREN ( Expression ( COMMA Expression )* )? RPAREN
            |	Integer
            |	TRUE
            |	FALSE
            |	Identifier
            |	THIS
            |	NEW INT LBRACK Expression RBRACK
            |	NEW Identifier LPAREN RPAREN
            |	BANG Expression
            |	LPAREN Expression RPAREN;
            