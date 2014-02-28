package numbers;

import java.util.ArrayDeque;

public class Worker extends NumbersBaseListener {

    public ArrayDeque<Integer> memory;

    public Worker() {
      memory = new ArrayDeque();
    }

    @Override
    public void exitMod(NumbersParser.ModContext ctx) {
      int right = memory.pop();
      int left = memory.pop();
      System.out.println("\n\nResult: " + (left % right));
    }

    @Override
    public void exitMul(NumbersParser.MulContext ctx) {
      int right = memory.pop();
      int left = memory.pop();
      System.out.println("\n\nResult: " + (left * right));
    }

    @Override
    public void exitSub(NumbersParser.SubContext ctx) {
      int right = memory.pop();
      int left = memory.pop();
      System.out.println("\n\nResult: " + (left - right));
    }

    @Override
    public void exitAdd(NumbersParser.AddContext ctx) {
      int right = memory.pop();
      int left = memory.pop();
      System.out.println("\n\nResult: " + (left + right));
    }

    @Override
    public void exitDiv(NumbersParser.DivContext ctx) {
      int right = memory.pop();
      int left = memory.pop();
      System.out.println("\n\nResult: " + (left / right));
    }

    @Override
    public void exitNum(NumbersParser.NumContext ctx) {
      memory.push(Integer.valueOf(ctx.NUMBER().getText()));
    }


}