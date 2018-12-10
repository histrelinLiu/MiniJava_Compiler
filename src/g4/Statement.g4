grammar Statement;

statement:	    LBRACE ( statement )* RBRACE                                #Lsubstatement
            |	IF LPAREN expression RPAREN statement ELSE statement        #Lif
            |	WHILE LPAREN expression RPAREN statement                    #Lwhile
            |	SOP LPAREN expression RPAREN SEMI                           #Lprint
            |	identifier ASSIGN expression SEMI                           #Lassign
            |	identifier LBRACK expression RBRACK ASSIGN expression SEMI  #Larrayassign
            ;
