package ie.atu.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {

    @GetMapping("calculate")
    public String Calculate(@RequestParam String operation, @RequestParam int num1, @RequestParam int num2) {
        int num3 = 0;
        if (operation.equals("add")) {
            num3 = num1 + num2;
        }

        else if (operation.equals("Subtract")) {
            num3 = num1 - num2;
        }

        else if (operation.equals("multiply")) {
            num3 = num1 * num2;
        }

        else if (operation.equals("divide")) {
            num3 = num1 / num2;
        }
    return "Operation: " + operation + " Total: " + num3;
    }
}
