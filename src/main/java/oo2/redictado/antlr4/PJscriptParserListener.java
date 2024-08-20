// Generated from PJscriptParser.g4 by ANTLR 4.3
package oo2.redictado.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PJscriptParser}.
 */
public interface PJscriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PJscriptParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(@NotNull PJscriptParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(@NotNull PJscriptParser.ValueExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull PJscriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull PJscriptParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(@NotNull PJscriptParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(@NotNull PJscriptParser.ClassMemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(@NotNull PJscriptParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(@NotNull PJscriptParser.ClassDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull PJscriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull PJscriptParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull PJscriptParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull PJscriptParser.ForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PJscriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PJscriptParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(@NotNull PJscriptParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(@NotNull PJscriptParser.MethodDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull PJscriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull PJscriptParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull PJscriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull PJscriptParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull PJscriptParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull PJscriptParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull PJscriptParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull PJscriptParser.ArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull PJscriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull PJscriptParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(@NotNull PJscriptParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(@NotNull PJscriptParser.VariableDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull PJscriptParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull PJscriptParser.ParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterObjectProperty(@NotNull PJscriptParser.ObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitObjectProperty(@NotNull PJscriptParser.ObjectPropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PJscriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PJscriptParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#callableExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallableExpression(@NotNull PJscriptParser.CallableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#callableExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallableExpression(@NotNull PJscriptParser.CallableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#objectInstantation}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantation(@NotNull PJscriptParser.ObjectInstantationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#objectInstantation}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantation(@NotNull PJscriptParser.ObjectInstantationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PJscriptParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull PJscriptParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PJscriptParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull PJscriptParser.MethodCallContext ctx);
}