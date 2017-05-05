import operators.Operator;
import operators.PlusOperator;
import operators.ResultOperator;
import operators.SubtractOperator;
import result.Result;

/**
 * Created by inf117182 on 05.05.2017.
 */
public class Program {

    public static Operator getChain() {
        PlusOperator plusOperator = new PlusOperator();
        SubtractOperator subtractOperator = new SubtractOperator();
        ResultOperator resultOperator = new ResultOperator();

        plusOperator.setNextOperator(subtractOperator);
        subtractOperator.setNextOperator(resultOperator);

        return plusOperator;
    }

    public static void main(String [] args) {
        Result result = new Result("22-55");

        getChain().calculate(result);
    }
}
