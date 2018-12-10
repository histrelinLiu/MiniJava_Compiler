grammar Expression;

expression	:	expression op=( AND | LT | ADD | SUB | MUL ) expression                         #Loperator
            |	expression LBRACK expression RBRACK                                             #Larray
            |	expression DOT LENGTH                                                           #Llength
            |	expression DOT identifier LPAREN ( expression ( COMMA expression )* )? RPAREN   #Lmethod
            |   SUB Integer                                                                     #Lsubinteger
            |	Integer                                                                         #Linteger
            |	TRUE                                                                            #Ltrue
            |	FALSE                                                                           #Lfalse
            |	identifier                                                                      #Lidentifier
            |	THIS                                                                            #Lthis
            |	NEW INT LBRACK expression RBRACK                                                #Lnewarray
            |	NEW identifier LPAREN RPAREN                                                    #Lnewobject
            |	BANG expression                                                                 #Lbang
            |	LPAREN expression RPAREN                                                        #Lsubexpression
            ;
