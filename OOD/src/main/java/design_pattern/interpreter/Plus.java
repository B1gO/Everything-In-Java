package design_pattern.interpreter;

/**
 * @author Yanan Lyu
 * @date 2/25/22 10:56 AM
 */
public class Plus extends AbstractExpression{

    /**
     * + 号左边的表达式和右边的表达式
      */
    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        // 将左边表达式的结果和右边表达式的结果进行相加 2+3
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}
