package design_pattern.interpreter;

/**
 * @author Yanan Lyu
 * @date 2/25/22 10:56 AM
 * @description 减法表达式类
 */
public class Minus extends AbstractExpression{

    /**
     * + 号左边的表达式和右边的表达式
      */
    private AbstractExpression left;
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        // 将左边表达式的结果和右边表达式的结果进行相减 2-3
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}
