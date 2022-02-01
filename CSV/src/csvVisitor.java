// Generated from C:/Users/somdi/IdeaProjects/Math/src\csv.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link csvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface csvVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link csvParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(csvParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link csvParser#elems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElems(csvParser.ElemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link csvParser#elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem(csvParser.ElemContext ctx);
}