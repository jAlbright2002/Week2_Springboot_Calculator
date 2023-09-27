package ie.atu.calculator_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    //made the method of type object to return an instance of CalcResult class
    @GetMapping("/calculate")
    public Object calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {

        //create new instance of CalcResult
        CalcResult calcResult = new CalcResult("", 0);

        switch (operation)  {

            case "add":
                return calcResult.add(num1, num2);

            case "subtract":
                return calcResult.subtract(num1, num2);

            case "multiply":
                return calcResult.multiply(num1, num2);

            case "divide":
                return calcResult.divide(num1, num2);

        }

        return 0;

    }


}
