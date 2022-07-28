package design_pattern.behavioral.interpreter;

/**
 * @author Yanan Lyu
 * @date 2/25/22 10:52 AM
 * @description 抽象表达式类
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}
