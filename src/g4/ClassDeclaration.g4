grammar ClassDeclaration;

classDeclaration: CLASS identifier (EXTENDS identifier)? LBRACE ( varDeclaration )* ( methodDeclaration )* RBRACE;
