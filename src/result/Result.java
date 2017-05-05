package result;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by inf117182 on 05.05.2017.
 */
public class Result {
    public String calculation;

    public double result;

    private int first;
    private int second;

    private String operator;

    public Result(String calculation) {
        ArrayList<String> part = new ArrayList<>();
        Pattern pattern = Pattern.compile("((\\d*))");
        Matcher matcher = pattern.matcher(calculation);
        while (matcher.find()) {
            part.add( matcher.group() );
        }


        Pattern pattern2 = Pattern.compile("[(\\D*)]");
        Matcher matcher2 = pattern2.matcher(calculation);
        while (matcher2.find()) {
            part.add( matcher2.group() );
        }

        this.setFirst(Integer.parseInt(part.get(0)));
        this.setOperator(part.get(4));
        this.setSecond(Integer.parseInt(part.get(2)));
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String getCalculation() {
        return calculation;
    }

    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
