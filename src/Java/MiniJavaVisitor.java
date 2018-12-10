// Generated from ./g4/MiniJava.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lintarray}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLintarray(MiniJavaParser.LintarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lbool}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbool(MiniJavaParser.LboolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lint}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLint(MiniJavaParser.LintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lclass}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLclass(MiniJavaParser.LclassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lsubstatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLsubstatement(MiniJavaParser.LsubstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lif}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLif(MiniJavaParser.LifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lwhile}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLwhile(MiniJavaParser.LwhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lprint}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLprint(MiniJavaParser.LprintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lassign}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLassign(MiniJavaParser.LassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Larrayassign}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLarrayassign(MiniJavaParser.LarrayassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lsubexpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLsubexpression(MiniJavaParser.LsubexpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lnewarray}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLnewarray(MiniJavaParser.LnewarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lnewobject}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLnewobject(MiniJavaParser.LnewobjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Loperator}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoperator(MiniJavaParser.LoperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lfalse}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLfalse(MiniJavaParser.LfalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lthis}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLthis(MiniJavaParser.LthisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Larray}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLarray(MiniJavaParser.LarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lmethod}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLmethod(MiniJavaParser.LmethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Llength}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlength(MiniJavaParser.LlengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lsubinteger}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLsubinteger(MiniJavaParser.LsubintegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lidentifier}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLidentifier(MiniJavaParser.LidentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lbang}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbang(MiniJavaParser.LbangContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Linteger}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinteger(MiniJavaParser.LintegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ltrue}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtrue(MiniJavaParser.LtrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MiniJavaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(MiniJavaParser.IntegerContext ctx);
}