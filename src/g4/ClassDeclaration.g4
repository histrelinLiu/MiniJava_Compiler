grammar ClassDeclaration;

classDeclaration: CLASS identifier LPAREN EXTENDS identifier RPAREN? LBRACE LPAREN varDeclaration RPAREN* LPAREN methodDeclaration RPAREN* RBRACE;
