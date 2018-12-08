grammar ClassDeclaration;

ClassDeclaration: CLASS Identifier LPAREN EXTENDS Identifier RPAREN? LBRACE LPAREN VarDeclaration RPAREN* LPAREN MethodDeclaration RPAREN* RBRACE;