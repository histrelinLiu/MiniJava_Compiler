// Generated from ./g4/MiniJava.g4 by ANTLR 4.7.1
import java.lang.reflect.Type;
import java.util.ArrayList;
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
		System.err.println("ERROR: Can't get Type "+t.toString());
		return null;

	}
	private class MyVar{
		public Type myType;
		public String name;
		public int addr = -1;
		public int length = 1;
		public MyClass obj;

		public MyVar(){
			addr = varsTop++;
		}
		public MyVar(MiniJavaParser.VarDeclarationContext cxt){
			myType = getType(cxt.type());
			name = cxt.IDENTIFIER().getText();
			addr = varsTop++;
			//System.out.println("Create a var : "+cxt.type().getText()+" "+cxt.IDENTIFIER().getText());
		}
		public MyVar(MiniJavaParser.TypeContext t, MiniJavaParser.IdentifierContext id){
			myType = getType(t);
			name = id.IDENTIFIER().getText();
			addr = varsTop++;
			//System.out.println("Create a var : "+t.getText()+" "+id.getText());
		}
		public MyVar(int length1){
			length = length1;
			addr = varsTop++;			
			varsTop += length1;
			VARS[addr] = addr + 1;
			//System.out.println("Create a array length = " + String.valueOf(length));
		}
		public MyVar(String id){
			obj = new MyClass(findClass(id));
			//System.out.println("Create a var : "+id);
		}
		public MyVar(MyVar var){
			myType = var.myType;
			name = var.name;
			length = var.length;
			if (var.addr == -1){
				obj = var.obj;
			}else
			{
				addr = varsTop;
				varsTop += length;
				for(int i = 0; i < length; i++)
					VARS[addr + i] = VARS[var.addr + i];
			}

		}
	};

	// ClassDeclaration	::=	"class" Identifier ( "extends" Identifier )? "{" ( VarDeclaration )* ( MethodDeclaration )* "}"
	private class MyClass{
		public MyClass fa = this;
		public MyClass extendsClass;
		public String className;
		public List<MyMethod> methods = new ArrayList<>();
		public List<MyVar> vars = new ArrayList<>();

		public MyClass(MiniJavaParser.ClassDeclarationContext cxt){
			//System.out.println("Create MyClass : "+cxt.identifier(0).IDENTIFIER().getText());
			className = cxt.identifier(0).IDENTIFIER().getText();
			if (cxt.identifier().size() == 2) extendsClass = findClass(cxt.identifier(1).IDENTIFIER().getText());
			for (MiniJavaParser.VarDeclarationContext var : cxt.varDeclaration()) {
				vars.add(new MyVar(var));
			}
			for (MiniJavaParser.MethodDeclarationContext var : cxt.methodDeclaration()) {
				methods.add(new MyMethod(var, this));
			}
		}
		public MyClass(MyClass c){
			for (MyMethod var : c.methods) {
				methods.add(var);
			}
			for (MyVar var : c.vars) {
				vars.add(var);
			}
			fa = c;
			className = c.className;
			extendsClass = c.extendsClass;
		}
	};

	//MethodDeclaration	::=	"public" Type Identifier "(" ( Type Identifier ( "," Type Identifier )* )? ")" "{" ( VarDeclaration )* ( Statement )* "return" Expression ";" "}"
	private class MyMethod{
		public MyVar obj;
		public Type returnType;
		public String methodName;
		public List<MyVar> vars = new ArrayList<>();
		public List<MiniJavaParser.StatementContext> statement = new ArrayList<>();
		public MiniJavaParser.ExpressionContext returnValue;
		public int paramNum;

		public MyMethod(MiniJavaParser.MethodDeclarationContext cxt, MyClass c){
			//System.out.println("Create a method : " + cxt.identifier(0).IDENTIFIER().getText());
			returnType = getType(cxt.type(0));
			methodName = cxt.identifier(0).IDENTIFIER().getText();
			
			// param
			paramNum = cxt.type().size() - 1;
			for(int i = 1; i<cxt.type().size(); i++){
				vars.add(new MyVar(cxt.type(i), cxt.identifier(i)));
			}
			// var
			for (MiniJavaParser.VarDeclarationContext var : cxt.varDeclaration()) 
				vars.add(new MyVar(var));
			for (MiniJavaParser.StatementContext var : cxt.statement()) {
				statement.add(var);
			}
			returnValue = cxt.expression();		

		}
		public MyMethod(MyMethod m, MyVar o){
			//System.out.println("Instance a method : " + m.methodName);
			returnType = m.returnType;
			methodName = m.methodName;			
			obj = o;
			for (MyVar var : m.vars) 
				vars.add(new MyVar(var));
			for (MiniJavaParser.StatementContext var : m.statement) {
				statement.add(var);
			}
			returnValue = m.returnValue;				
		}
		
		public MyVar call(){
			for (MiniJavaParser.StatementContext var : statement) {
				for (MyVar param : vars) {
					//System.out.println("params out :" + param.name + " " + String.valueOf(VARS[param.addr]));
				}
				executeStatement(this.obj, this, var);
			}
			return executeExpression(this.obj, this, returnValue);
		}
	};

	public int[] VARS = new int[10000];
	public int varsTop = 0;
	public List<MyClass> myClasses = new ArrayList<>();
	public List<MyClass> myObjects = new ArrayList<>();

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
		//System.out.println("Execute Expression " + s.getText());
		MyVar ret = new MyVar();
		
		if (s instanceof MiniJavaParser.LoperatorContext) {
			MyVar v1 = executeExpression(obj, m, ((MiniJavaParser.LoperatorContext)s).expression(0));
			MyVar v2 = executeExpression(obj, m, ((MiniJavaParser.LoperatorContext)s).expression(1));
			if      (((MiniJavaParser.LoperatorContext)s).op.getType() == MiniJavaParser.ADD) VARS[ret.addr] = VARS[v1.addr] + VARS[v2.addr];
			else if (((MiniJavaParser.LoperatorContext)s).op.getType() == MiniJavaParser.SUB) VARS[ret.addr] = VARS[v1.addr] - VARS[v2.addr];
			else if (((MiniJavaParser.LoperatorContext)s).op.getType() == MiniJavaParser.MUL) VARS[ret.addr] = VARS[v1.addr] * VARS[v2.addr];
			else if (((MiniJavaParser.LoperatorContext)s).op.getType() == MiniJavaParser.AND) VARS[ret.addr]= (VARS[v1.addr]==0?false:true) && (VARS[v2.addr]==0?false:true)? 1 : 0;
			else if (((MiniJavaParser.LoperatorContext)s).op.getType() == MiniJavaParser.LT)  VARS[ret.addr]= VARS[v1.addr] < VARS[v2.addr] ? 1 : 0;
		}
		else if (s instanceof MiniJavaParser.LarrayContext) {
			MyVar v1 = executeExpression(obj, m, ((MiniJavaParser.LarrayContext)s).expression(0));
			MyVar v2 = executeExpression(obj, m, ((MiniJavaParser.LarrayContext)s).expression(1));
			ret.addr = VARS[v1.addr] + VARS[v2.addr];
		}
		else if (s instanceof MiniJavaParser.LlengthContext) {
			MyVar v1 = executeExpression(obj, m, ((MiniJavaParser.LlengthContext)s).expression());
			VARS[ret.addr] = v1.length;
		}
		else if (s instanceof MiniJavaParser.LmethodContext) {
			MyVar var = executeExpression(obj, m, ((MiniJavaParser.LmethodContext)s).expression(0));
			//if (var.addr>0) //System.out.println(VARS[var.addr]);
			MyMethod method = findMethod(var.obj.fa, ((MiniJavaParser.LmethodContext)s).identifier().IDENTIFIER().getText());
			MyMethod method1 = new MyMethod(method, var);
			//System.out.println("method's class " + method1.obj.obj.className);
			for(int i = 1; i< ((MiniJavaParser.LmethodContext)s).expression().size(); i++){
				MyVar param = new MyVar(executeExpression(obj, m, ((MiniJavaParser.LmethodContext)s).expression(i)));
				VARS[method1.vars.get(i-1).addr] = VARS[param.addr];
				method1.vars.get(i-1).obj = param.obj;
			}
			ret = method1.call();
		}
		else if (s instanceof MiniJavaParser.LintegerContext) {
			VARS[ret.addr] = Integer.parseInt(((MiniJavaParser.LintegerContext)s).Integer().getText());
		}
		else if (s instanceof MiniJavaParser.LtrueContext) {
			VARS[ret.addr] = 1;
		}
		else if (s instanceof MiniJavaParser.LfalseContext) {
			VARS[ret.addr] = 0;
		}
		else if (s instanceof MiniJavaParser.LidentifierContext) {
			ret = findvar(obj, m, ((MiniJavaParser.LidentifierContext)s).identifier().IDENTIFIER().getText());
		}
		else if (s instanceof MiniJavaParser.LnewarrayContext) {
			MyVar v1 = executeExpression(obj, m, ((MiniJavaParser.LnewarrayContext)s).expression());
			ret = new MyVar(VARS[v1.addr]);
		}
		else if (s instanceof MiniJavaParser.LnewobjectContext) {
			ret = new MyVar(((MiniJavaParser.LnewobjectContext)s).identifier().IDENTIFIER().getText());
		}
		else if (s instanceof MiniJavaParser.LbangContext) {
			MyVar v1 = executeExpression(obj, m, ((MiniJavaParser.LbangContext)s).expression());
			VARS[ret.addr] = ((VARS[v1.addr]==0)?true:false)?1:0;
		}
		else if (s instanceof MiniJavaParser.LsubexpressionContext) {
			MyVar v1 = executeExpression(obj, m, ((MiniJavaParser.LsubexpressionContext)s).expression());
			VARS[ret.addr] = VARS[v1.addr];
		}
		else if (s instanceof MiniJavaParser.LthisContext) {
			ret = obj;
			//System.out.println("Execute Expression " + s.getText() + ", result = " + ret.obj.className);
		}
		//System.out.println("Execute Expression " + s.getText() + ", result = " + ((ret.addr<10000 && ret.addr>=0)?(String.valueOf(VARS[ret.addr])):ret.obj.className));
		return ret;
	}
	public int executeStatement(MyVar obj, MyMethod m, MiniJavaParser.StatementContext s){
		/*if (obj!=null)
		{
			System.out.print(obj.obj.className + " vars out ");
			for (MyVar var : obj.obj.vars) {
				if (var.addr!=-1) System.out.print(var.name + "=" + VARS[var.addr] + "; ");
				else System.out.print(var.name + "=" + var.obj.fa.className);
			}
		}*/
		//System.out.println(" ");
		//System.out.println("Execute Statement " + s.getText());
		if (s instanceof MiniJavaParser.LsubstatementContext) {
			for (MiniJavaParser.StatementContext var : ((MiniJavaParser.LsubstatementContext)s).statement()) {
				executeStatement(obj, m, var);
			}
		}
		else if (s instanceof MiniJavaParser.LifContext) {
			if (VARS[executeExpression(obj, m, ((MiniJavaParser.LifContext)s).expression()).addr] != 0) 
				executeStatement(obj, m, ((MiniJavaParser.LifContext)s).statement(0));
			else 
				executeStatement(obj, m, ((MiniJavaParser.LifContext)s).statement(1));
		}
		else if (s instanceof MiniJavaParser.LwhileContext) {
			while(VARS[executeExpression(obj, m, ((MiniJavaParser.LwhileContext)s).expression()).addr] != 0){
				executeStatement(obj, m, ((MiniJavaParser.LwhileContext)s).statement());
			}
		}
		else if (s instanceof MiniJavaParser.LprintContext) {
			System.
			out.println(VARS[executeExpression(obj, m, ((MiniJavaParser.LprintContext)s).expression()).addr]);
		}
		else if (s instanceof MiniJavaParser.LassignContext) {
			MyVar v = findvar(obj, m, ((MiniJavaParser.LassignContext)s).identifier().IDENTIFIER().getText());
			if (v.addr == -1)
				v.obj = executeExpression(obj, m, ((MiniJavaParser.LassignContext)s).expression()).obj;
			else 
				VARS[v.addr] = VARS[executeExpression(obj, m, ((MiniJavaParser.LassignContext)s).expression()).addr];
		}
		else if (s instanceof MiniJavaParser.LarrayassignContext) {
			MyVar v = findvar(obj, m, ((MiniJavaParser.LarrayassignContext)s).identifier().IDENTIFIER().getText());
			VARS[VARS[v.addr] + VARS[executeExpression(obj, m, ((MiniJavaParser.LarrayassignContext)s).expression(0)).addr]]
				  = VARS[executeExpression(obj, m, ((MiniJavaParser.LarrayassignContext)s).expression(1)).addr];
		}
		else {
			System.err.println("ERROR: Statement type error, none statement be executed."); 
			return 1;
		}
		return 0;
	}

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