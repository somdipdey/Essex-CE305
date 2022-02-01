import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // write your code here
        CharStream in = CharStreams.fromFileName("./src/test.txt");
        csvLexer lexer = new csvLexer(in);  //create a lexer object
        CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
        csvParser parser = new csvParser(tokens);

        String str = new PrettyVisitor().visit(parser.list());
        System.out.println(str);
    }
}
