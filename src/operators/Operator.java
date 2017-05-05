package operators;

import result.Result;

/**
 * Created by inf117182 on 05.05.2017.
 */
public abstract class Operator {
    private Operator nextOperator;

    public void setNextOperator(Operator operator) {
        this.nextOperator = operator;
    }

    public Operator getNextOperator() {
        return this.nextOperator;
    }

    public abstract void calculate(Result result);
}
