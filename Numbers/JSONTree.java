package numbers;

public class JSONTree extends NumbersBaseListener {

  private int indentLevel;

  public JSONTree() {
    this.indentLevel = 0;
  }

  @Override
  public void enterAdd(NumbersParser.AddContext ctx) {
    System.out.println(indents() + "\"Add\" : {");
    indentLevel++;
  }

  @Override
  public void exitAdd(NumbersParser.AddContext ctx) {
    // System.out.println(indents() + "\"op\" : \"+\"");
    indentLevel--;
    System.out.println(indents() + "}");
  }

  @Override
  public void enterSub(NumbersParser.SubContext ctx) {
    System.out.println(indents() + "\"Sub\" : {");
    indentLevel++;
  }

  @Override
  public void exitSub(NumbersParser.SubContext ctx) {
    // System.out.println(indents() + "\"op\" : \"-\"");
    indentLevel--;
    System.out.println(indents() + "}");
  }
    @Override
  public void enterDiv(NumbersParser.DivContext ctx) {
    System.out.println(indents() + "\"Div\" : {");
    indentLevel++;
  }

  @Override
  public void exitDiv(NumbersParser.DivContext ctx) {
    // System.out.println(indents() + "\"op\" : \"/\"");
    indentLevel--;
    System.out.println(indents() + "}");
  }
    @Override
  public void enterMul(NumbersParser.MulContext ctx) {
    System.out.println(indents() + "\"Mul\" : {");
    indentLevel++;
  }

  @Override
  public void exitMul(NumbersParser.MulContext ctx) {
    // System.out.println(indents() + "\"op\" : \"*\"");
    indentLevel--;
    System.out.println(indents() + "}");
  }

  @Override
  public void enterMod(NumbersParser.ModContext ctx) {
    System.out.println(indents() + "\"Mod\" : {");
    indentLevel++;
  }

  @Override
  public void exitMod(NumbersParser.ModContext ctx) {
    // System.out.println(indents() + "\"op\" : \"%\"");
    indentLevel--;
    System.out.println(indents() + "}");
  }

  @Override
  public void enterNum(NumbersParser.NumContext ctx) {
    System.out.println(indents() + "\"Num\" : " + ctx.NUMBER().getText() + ",");
  }

  private String indents() {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < indentLevel; i++) { sb.append("\t"); }
    return sb.toString();
  }
}