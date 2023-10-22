package pro.sky.calculatordemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService=calculatorService;
    }
    @GetMapping
    public String helloCalculator(){
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam("num1")int num1,@RequestParam("num2")int num2){
        return calculatorService.plusCalculator(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam("num1")int num1,@RequestParam("num2")int num2) {
        return calculatorService.minusCalculator(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam("num1")int num1,@RequestParam("num2")int num2) {
        return calculatorService.multiplyCalculator(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam("num1")int num1,@RequestParam("num2")int num2) {
        return calculatorService.divideCalculator(num1, num2);
    }

}
