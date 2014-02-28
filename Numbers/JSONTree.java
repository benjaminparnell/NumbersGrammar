package numbers;

public class JSONTree extends NumbersBaseListener {

  private int indentLevel;

  public JSONTree() {
    this.indentLevel = 0;
  }

  @Override
  public void enterExpression(NumbersParser.ExpressionContext ctx) {
    System.out.println(indents() + "\"expression\" : {");
    indentLevel++;
  }

  @Override public void exitExpression(NumbersParser.ExpressionContext ctx) {
    System.out.println(indents() + "\"operation\" : \"" + ctx.OP().getText() + "\"");
    indentLevel--;
    System.out.println(indents() + "}");
  }

  @Override
  public void enterSum(NumbersParser.SumContext ctx) {
    System.out.println(indents() + "\"sum\" : {");
    indentLevel++;
  }

  @Override
  public void exitSum(NumbersParser.SumContext ctx) {
    System.out.println(indents() + "\"operation\" : \"" + ctx.OP().getText() + "\"");
    indentLevel--;
    System.out.println(indents() + "}");
  }

  @Override
  public void enterValue(NumbersParser.ValueContext ctx) {
    System.out.println(indents() + "\"value\" : " + ctx.NUMBER().getText());
  }

  @Override
  public void exitValue(NumbersParser.ValueContext ctx) {

  }

  private String indents() {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < indentLevel; i++) { sb.append("\t"); }
    return sb.toString();
  }
}