package ie.atu.calculator_springboot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CalcResult {

    private int num1;
    private int num2;

    public int add() {
        return num1+num2;
    }

    public int subtract() { return num1-num2; }

    public int multiply() { return num1*num2; }

    public int divide() {return num1/num2;}

}
