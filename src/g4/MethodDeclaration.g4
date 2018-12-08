grammar MethodDeclaration;

methodDeclaration: PUBLIC type identifier LPAREN LPAREN type identifier LPAREN COMMA type identifier RPAREN* RPAREN? RPAREN LBRACE LPAREN varDeclaration RPAREN* LPAREN statement RPAREN* RETURN expression SEMI RBRACE;
