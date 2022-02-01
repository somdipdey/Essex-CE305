// Generated from C:/Users/somdi/IdeaProjects/Math/src\csv.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link csvParser}.
 */
public interface csvListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link csvParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(csvParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link csvParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(csvParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link csvParser#elems}.
	 * @param ctx the parse tree
	 */
	void enterElems(csvParser.ElemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link csvParser#elems}.
	 * @param ctx the parse tree
	 */
	void exitElems(csvParser.ElemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link csvParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(csvParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link csvParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(csvParser.ElemContext ctx);
}