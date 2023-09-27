package ie.atu.calculator_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public int calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {

        CalcResult calcResult = new CalcResult();
        calcResult.setNum1(num1);
        calcResult.setNum2(num2);

        switch (operation)  {

            case "add":
                return calcResult.add();

            case "subtract":
                return calcResult.subtract();

        }

        return 0;

    }


}
