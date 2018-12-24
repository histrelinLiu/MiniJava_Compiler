grammar Type;

type:   INT LBRACK RBRACK   #Lintarray
    |	BOOLEAN             #Lbool
    |	INT                 #Lint
    |	identifier          #Lclass
    ;