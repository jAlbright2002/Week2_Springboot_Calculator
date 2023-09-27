package ie.atu.calculator_springboot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


//Created a class to store important variables that we wanted to return
public class CalcResult {

    private String operation;
    private int total;


    //holds the variables and allows us to return two different values in the same object
    public CalcResult(String operation, int total) {

        this.operation = operation;
        this.total = total;
    }

    CalcResult add(int num1, int num2) {
        operation = "add";
        total = num1 + num2;
        //returns object holding value set in this method
        return new CalcResult(operation, total);
    }

    CalcResult subtract(int num1, int num2) {
        operation = "subtract";
        total = num1 - num2;
        return new CalcResult(operation, total);
    }

    CalcResult multiply(int num1, int num2) {
        operation = "multiply";
        total = num1 * num2;
        return new CalcResult(operation, total);
    }

    CalcResult divide(int num1, int num2) {
        operation = "divide";
        total = num1 / num2;
        return new CalcResult(operation, total);
    }


}
