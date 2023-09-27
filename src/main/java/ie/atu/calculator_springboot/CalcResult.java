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

}
