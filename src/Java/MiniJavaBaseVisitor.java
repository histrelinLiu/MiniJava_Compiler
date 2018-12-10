// Generated from ./g4/MiniJava.g4 by ANTLR 4.7.1
import java.lang.reflect.Type;
import java.util.List;
import java.lang.System;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;


/**
 * This class provides an empty implementation of {@link MiniJavaVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class MiniJavaBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements MiniJavaVisitor<T> {

	private Type getType(MiniJavaParser.TypeContext t){
		if (t instanceof MiniJavaParser.LintContext) return int.class;
		else if (t instanceof MiniJavaParser.LintarrayContext) return int[].class;
		else if (t instanceof MiniJavaParser.LboolContext) return boolean.class;
		else if (t instanceof MiniJavaParser.LclassContext) return myClasses.getClass();
		System.err.println("ERROR: Can't get Type :" + t.toString());
		return null;

	}
	private class MyVar{
		public Type myType;
		public String name;
		public int addr;
		public int length;
		public MyClass obj, c;

		public MyVar(){
			addr = varsTop++;
		}
		public MyVar(MiniJavaParser.VarDeclarationContext cxt){
			myType = getType(cxt.type());
			name = cxt.IDENTIFIER().getText();
			addr = varsTop++;
		}
		public MyVar(MiniJavaParser.TypeContext t, MiniJavaParser.IdentifierContext id){
			myType = getType(t);
			name = id.toString();
			addr = varsTop++;
		}
		public MyVar(int length){
			addr = varsTop;
			varsTop += length;
		}
		public MyVar(String id){
			c = findClass(id);
			obj = new MyClass(c);
		}
	};

	// ClassDeclaration	::=	"class" Identifier ( "extends" Identifier )? "{" ( VarDeclaration )* ( MethodDeclaration )* "}"
	private class MyClass{
		public MyClass extendsClass;
		public String className;
		public List<MyMethod> methods;
		public List<MyVar> vars;

		public MyClass(MiniJavaParser.ClassDeclarationContext cxt){
			className = cxt.identifier(0).toString();
			if (cxt.identifier().size() == 2) extendsClass = findClass(cxt.identifier(1).toString());

			for (MiniJavaParser.MethodDeclarationContext var : cxt.methodDeclaration()) {
				methods.add(new MyMethod(var, this));
			}
		}
		public MyClass(MyClass c){
			methods = c.methods;
			className = c.className;
			extendsClass = c.extendsClass;
		}
	};

	//MethodDeclaration	::=	"public" Type Identifier "(" ( Type Identifier ( "," Type Identifier )* )? ")" "{" ( VarDeclaration )* ( Statement )* "return" Expression ";" "}"
	private class MyMethod{
		public MyVar obj;
		public Type returnType;
		public String methodName;
		public List<MyVar> vars;
		public List<MiniJavaParser.StatementContext> statement;
		public MiniJavaParser.ExpressionContext returnValue;

		public MyMethod(MiniJavaParser.MethodDeclarationContext cxt, MyClass c){
			returnType = getType(cxt.type(0));
			methodName = cxt.identifier(0).toString();
			
			// param
			for(int i = 1; i<cxt.type().size(); i++)
				vars.add(new MyVar(cxt.type(i), cxt.identifier(i)));
			// var
			for (MiniJavaParser.VarDeclarationContext var : cxt.varDeclaration()) 
				vars.add(new MyVar(var));
			for (MiniJavaParser.StatementContext var : cxt.statement()) {
				statement.add(var);
			}
			returnValue = cxt.expression();				
		}
		
		public MyVar call(){
			for (MiniJavaParser.StatementContext var : statement) {
				executeStatement(this.obj, this, var);
			}
			return executeExpression(this.obj, this, returnValue);
		}
	};

	public int[] vars = new int[10000];
	public int varsTop = 0;
	public List<MyClass> myClasses;
	public List<MyClass> myObjects;

	public MyVar findvar(MyVar o, MyMethod m, String varname){
		if (m!=null)
		for (MyVar var : m.vars) {
			if (var.name.equals(varname)) return var;
		}
		if (o!=null)
		for (MyVar var : o.obj.vars) {
			if (var.name.equals(varname)) return var;
		}
		System.err.println("ERROR: Can't find variable :" + varname);
		System.exit(-1);
		return null;
	}

	public MyClass findClass(String id){
		for (MyClass var : myClasses) {
			if (id.equals(var.className))
				return var;
		}
		System.err.println("ERROR: no class found. "+id);
		return null;
	}	
	
	public MyMethod findMethod(MyClass cla, String id){
		for (MyMethod var : cla.methods) {
			if (id.equals(var.methodName))
				return var;
		}
		if (cla.extendsClass!=null) return findMethod(cla.extendsClass, id);
		System.err.println("ERROR: no method found."+cla.className+"."+id);
		return null;
	}
	public MyVar executeExpression(MyVar obj, MyMethod m, MiniJavaParser.ExpressionContext s){		
		MyVar ret = new MyVar();
		
		if (s instanceof MiniJavaParser.LoperatorContext) {
			MyVar v1 = executeExpression(obj, m, ((MiniJavaParser.LoperatorContext)s).expression(0));
			MyVar v2 = executeExpression(obj, m, ((MiniJavaParser.LoperatorContext)s).expression(1));
			if      (((MiniJavaParser.LoperatorContext)s).op.getType() == MiniJavaParser.ADD) vars[ret.addr]+=vars[v2.addr];
			else if (((MiniJavaParser.LoperatorContext)s).op.getType() == MiniJavaParser.SUB) vars[ret.addr]-=vars[v2.addr];
			else if (((MiniJavaParser.LoperatorContext)s).op.getType() == MiniJavaParser.MUL) vars[ret.addr]*=vars[v2.addr];
			else if (((MiniJavaParser.LoperatorContext)s).op.getType() == MiniJavaParser.AND) vars[ret.addr]= (vars[v1.addr]==0?false:true) && (vars[v2.addr]==0?false:true)? 1 : 0;
			else if (((MiniJavaParser.LoperatorContext)s).op.getType() == MiniJavaParser.LT)  vars[ret.addr]= vars[v1.addr] < vars[v2.addr] ? 1 : 0;
		}
		else if (s instanceof MiniJavaParser.LarrayContext) {
			MyVar v1 = executeExpression(obj, m, ((MiniJavaParser.LarrayContext)s).expression(0));
			MyVar v2 = executeExpression(obj, m, ((MiniJavaParser.LarrayContext)s).expression(1));
			ret.addr = v1.addr + vars[v2.addr];
			varsTop--;
		}
		else if (s instanceof MiniJavaParser.LlengthContext) {
			MyVar v1 = executeExpression(obj, m, ((MiniJavaParser.LlengthContext)s).expression());
			vars[ret.addr] = v1.length;
		}
		else if (s instanceof MiniJavaParser.LmethodContext) {
			MyVar object = executeExpression(obj, m, ((MiniJavaParser.LmethodContext)s).expression(0));
			MyMethod method = findMethod(object.c, ((MiniJavaParser.LmethodContext)s).identifier().toString());
			MyMethod method1 = method;
			method1.obj = object;
			for(int i = 1; i< ((MiniJavaParser.LmethodContext)s).expression().size(); i++){
				method1.vars.add(executeExpression(obj, m, ((MiniJavaParser.LmethodContext)s).expression(i)));
			}
			ret = method1.call();
		}
		else if (s instanceof MiniJavaParser.LintegerContext) {
			vars[ret.addr] = Integer.parseInt(((MiniJavaParser.LintegerContext)s).toString());
			System.out.print("int value ");
			System.out.println(vars[ret.addr]);
		}
		else if (s instanceof MiniJavaParser.LtrueContext) {
			vars[ret.addr] = 1;
		}
		else if (s instanceof MiniJavaParser.LfalseContext) {
			vars[ret.addr] = 0;
		}
		else if (s instanceof MiniJavaParser.LidentifierContext) {
			ret = findvar(obj, m, ((MiniJavaParser.LidentifierContext)s).identifier().toString());
		}
		else if (s instanceof MiniJavaParser.LnewarrayContext) {
			MyVar v1 = executeExpression(obj, m, ((MiniJavaParser.LnewarrayContext)s).expression());
			ret = new MyVar(vars[v1.addr]);
		}
		else if (s instanceof MiniJavaParser.LnewobjectContext) {
			ret = new MyVar((String)(((MiniJavaParser.LnewobjectContext)s).identifier().toString()));
		}
		else if (s instanceof MiniJavaParser.LbangContext) {
			MyVar v1 = executeExpression(obj, m, ((MiniJavaParser.LbangContext)s).expression());
			vars[ret.addr] = ((vars[v1.addr]==0)?true:false)?1:0;
		}
		else if (s instanceof MiniJavaParser.LsubexpressionContext) {
			MyVar v1 = executeExpression(obj, m, ((MiniJavaParser.LsubexpressionContext)s).expression());
			vars[ret.addr] = vars[v1.addr];
		}
		else if (s instanceof MiniJavaParser.LthisContext) {
			ret = obj;
		}
		return ret;
	}
	public int executeStatement(MyVar obj, MyMethod m, MiniJavaParser.StatementContext s){
		if (s instanceof MiniJavaParser.LsubstatementContext) {
			for (MiniJavaParser.StatementContext var : ((MiniJavaParser.LsubstatementContext)s).statement()) {
				executeStatement(obj, m, var);
			}
		}
		else if (s instanceof MiniJavaParser.LifContext) {
			if (vars[executeExpression(obj, m, ((MiniJavaParser.LifContext)s).expression()).addr] != 0) 
				executeStatement(obj, m, ((MiniJavaParser.LifContext)s).statement(0));
			else 
				executeStatement(obj, m, ((MiniJavaParser.LifContext)s).statement(1));
		}
		else if (s instanceof MiniJavaParser.LwhileContext) {
			while(vars[executeExpression(obj, m, ((MiniJavaParser.LwhileContext)s).expression()).addr] != 0){
				executeStatement(obj, m, ((MiniJavaParser.LwhileContext)s).statement());
			}
		}
		else if (s instanceof MiniJavaParser.LprintContext) {
			System.out.println(vars[executeExpression(obj, m, ((MiniJavaParser.LprintContext)s).expression()).addr]);
		}
		else if (s instanceof MiniJavaParser.LassignContext) {
			MyVar v = findvar(obj, m, ((MiniJavaParser.LassignContext)s).identifier().toString());
			vars[v.addr] = vars[executeExpression(obj, m, ((MiniJavaParser.LassignContext)s).expression()).addr];
		}
		else if (s instanceof MiniJavaParser.LarrayassignContext) {
			MyVar v = findvar(obj, m, ((MiniJavaParser.LarrayassignContext)s).identifier().toString());
			vars[v.addr + vars[executeExpression(obj, m, ((MiniJavaParser.LarrayassignContext)s).expression(0)).addr]]
				  = vars[executeExpression(obj, m, ((MiniJavaParser.LarrayassignContext)s).expression(1)).addr];
		}
		else {
			System.err.println("ERROR: Statement type error, none statement be executed."); 
			return 1;
		}
		return 0;
	}

	public MiniJavaParser.GoalContext root;
	public MyClass mainclass;
	public List<MyVar> localVars; 
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGoal(MiniJavaParser.GoalContext ctx) {
		for (MiniJavaParser.ClassDeclarationContext var : ctx.classDeclaration()) {
			visitClassDeclaration(var);
		}
		return visitMainClass(ctx.mainClass());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMainClass(MiniJavaParser.MainClassContext ctx) { 

		// MainClass	::=	"class" Identifier "{" "public" "static" "void" "main" "(" "String" "[" "]" Identifier ")" "{" Statement "}" "}"
		executeStatement(null, null, ctx.statement());
		return visitChildren(ctx);
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) { 
		myClasses.add(new MyClass(ctx));
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLintarray(MiniJavaParser.LintarrayContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLbool(MiniJavaParser.LboolContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLint(MiniJavaParser.LintContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLclass(MiniJavaParser.LclassContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLsubstatement(MiniJavaParser.LsubstatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLif(MiniJavaParser.LifContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLwhile(MiniJavaParser.LwhileContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLprint(MiniJavaParser.LprintContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLassign(MiniJavaParser.LassignContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLarrayassign(MiniJavaParser.LarrayassignContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLsubexpression(MiniJavaParser.LsubexpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLnewarray(MiniJavaParser.LnewarrayContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLnewobject(MiniJavaParser.LnewobjectContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLoperator(MiniJavaParser.LoperatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLfalse(MiniJavaParser.LfalseContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLthis(MiniJavaParser.LthisContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLarray(MiniJavaParser.LarrayContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLmethod(MiniJavaParser.LmethodContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLlength(MiniJavaParser.LlengthContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLidentifier(MiniJavaParser.LidentifierContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLbang(MiniJavaParser.LbangContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLinteger(MiniJavaParser.LintegerContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLtrue(MiniJavaParser.LtrueContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIdentifier(MiniJavaParser.IdentifierContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInteger(MiniJavaParser.IntegerContext ctx) { return visitChildren(ctx); }
}