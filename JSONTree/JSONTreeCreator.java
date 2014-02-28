package JSONTree;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import numbers.*;

public class JSONTreeCreator {
  public static void main(String[] args) throws Exception {
    // create a CharStream that reads from standard input
    ANTLRInputStream input = new ANTLRInputStream(System.in);
    // create a lexer that feeds off of input CharStream
    NumbersLexer lexer = new NumbersLexer(input);
    // create a buffer of tokens pulled from the levoxer
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    // create a parser that feeds off the tokens buffer
    NumbersParser parser = new NumbersParser(tokens);
    ParseTree tree = parser.program(); // begin parsing at init rule

    // Create a generic parse tree walker that can trigger callbacks
    ParseTreeWalker walker = new ParseTreeWalker();
    // Walk the tree created during the parse, trigger callbacks
    JSONTree jsontree = new JSONTree();
    System.out.println();
    walker.walk(jsontree, tree);
  }
}