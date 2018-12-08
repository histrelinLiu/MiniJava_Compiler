grammar Expr;
import Operators, BasicTypes; //导入之前定义的符号 和 数据类型

// 加入`#`，叫Annotation, 生成的Listener和visitor会有相应的方法来触发这个事件。
// 我认为这个应该叫 触发器注解。
// 注意，这个注解要么一个都不写，要么整条规则每一个模式都要写。
expr: SUB NUMBER                #NegativeNumber
    | expr POW expr             #Pow
    | expr (MUL|DIV|MOD) expr   #Mul_Div_Mod
    | expr (ADD|SUB) expr       #Add_Sub
    | ID                        #Identifier
    | NUMBER                    #Number
    | '(' expr ')'              #Parentheses
    ;