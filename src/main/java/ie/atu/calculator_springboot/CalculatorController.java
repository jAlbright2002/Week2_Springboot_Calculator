package ie.atu.calculator_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    @GetMapping("/calculate")
    public int calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {

        int total = 0;

        switch (operation) {

            case "add":
                total = num1 + num2;

        }


        return total;
    }


}
