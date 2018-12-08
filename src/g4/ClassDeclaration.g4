grammar ClassDeclaration;

classDeclaration: CLASS IDENTIFIER LPAREN EXTENDS IDENTIFIER RPAREN? LBRACE LPAREN varDeclaration RPAREN* LPAREN methodDeclaration RPAREN* RBRACE;
