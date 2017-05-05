package operators;

import result.Result;

/**
 * Created by inf117182 on 05.05.2017.
 */
public class ResultOperator extends Operator {

    public void calculate(Result result) {
        if(result.getResult() != 0) {
            System.out.println(result.getResult());
        } else {
            System.out.println("Niepoprawne dane wejściowe");
        }
    }
}
