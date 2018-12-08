grammar MethodDeclaration;

methodDeclaration: PUBLIC type identifier LPAREN ( type identifier ( COMMA type identifier )* )? RPAREN LBRACE ( varDeclaration )* ( statement )* RETURN expression SEMI RBRACE;
