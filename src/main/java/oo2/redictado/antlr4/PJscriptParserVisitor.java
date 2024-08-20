// Generated from PJscriptParser.g4 by ANTLR 4.3
package oo2.redictado.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PJscriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PJscriptParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PJscriptParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpression(@NotNull PJscriptParser.ValueExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull PJscriptParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(@NotNull PJscriptParser.ClassMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(@NotNull PJscriptParser.ClassDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull PJscriptParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull PJscriptParser.ForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull PJscriptParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(@NotNull PJscriptParser.MethodDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull PJscriptParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull PJscriptParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull PJscriptParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull PJscriptParser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull PJscriptParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(@NotNull PJscriptParser.VariableDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull PJscriptParser.ParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperty(@NotNull PJscriptParser.ObjectPropertyContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull PJscriptParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#callableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallableExpression(@NotNull PJscriptParser.CallableExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#objectInstantation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInstantation(@NotNull PJscriptParser.ObjectInstantationContext ctx);

	/**
	 * Visit a parse tree produced by {@link PJscriptParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(@NotNull PJscriptParser.MethodCallContext ctx);
}