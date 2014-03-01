package numbers;

import java.util.ArrayDeque;

public class Worker extends NumbersBaseListener {

    public ArrayDeque<Double> memory;

    public Worker() {
      memory = new ArrayDeque<Double>();
    }

    @Override
    public void exitMod(NumbersParser.ModContext ctx) {
      Double right = memory.pop();
      Double left = memory.pop();
      memory.push(left % right);
    }

    @Override
    public void exitMul(NumbersParser.MulContext ctx) {
      Double right = memory.pop();
      Double left = memory.pop();
      memory.push(left * right);
    }

    @Override
    public void exitSub(NumbersParser.SubContext ctx) {
      Double right = memory.pop();
      Double left = memory.pop();
      memory.push(left - right);
    }

    @Override
    public void exitAdd(NumbersParser.AddContext ctx) {
      Double right = memory.pop();
      Double left = memory.pop();
      memory.push(left + right);
    }

    @Override
    public void exitDiv(NumbersParser.DivContext ctx) {
      Double right = memory.pop();
      Double left = memory.pop();
      memory.push(left / right);
    }

    @Override
    public void exitProgram(NumbersParser.ProgramContext ctx) {
      System.out.println("\n\n" + memory.pop());
    }

    @Override
    public void exitNum(NumbersParser.NumContext ctx) {
      memory.push(Double.valueOf(ctx.NUMBER().getText()));
    }

    @Override
    public void exitDec(NumbersParser.DecContext ctx) {
      memory.push(Double.valueOf(ctx.DECIMAL().getText()));
    }

    @Override
    public void exitRomanNumeral(NumbersParser.RomanNumeralContext ctx) {
      memory.push(RomanNumeral.decode(ctx.ROMANNUMERAL().getText()));
    }
}