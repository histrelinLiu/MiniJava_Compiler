grammar MethodDeclaration;

MethodDeclaration: PUBLIC Type Identifier LPAREN LPAREN Type Identifier LPAREN COMMA Type Identifier RPAREN* RPAREN? RPAREN LBRACE LPAREN VarDeclaration RPAREN* LPAREN Statement RPAREN* RETURN Expression SEMI RBRACE;