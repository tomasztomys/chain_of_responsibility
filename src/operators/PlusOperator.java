package operators;

import result.Result;

/**
 * Created by inf117182 on 05.05.2017.
 */
public class PlusOperator extends Operator {
    @Override
    public void calculate(Result result) {
        if(result.getOperator().equals("+")) {
            result.setResult(result.getFirst() + result.getSecond());
        }

        this.getNextOperator().calculate(result);
    }
}
