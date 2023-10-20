package pro.sky.calculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServ implements CalculatorService {
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plusCalculator(int num1, int num2) {
        int sum = num1 + num2;
        String a = num1 + " + " + num2+" = "+sum;
        return a;
    }
    public String minusCalculator(int num1, int num2){
        int raz = num1 - num2;
        String b = num1 + " - " + num2+" = "+raz;
        return b;
    }
    public String multiplyCalculator(int num1, int num2){
        int multiply = num1 * num2;
        String c = num1 + " * " + num2+" = "+multiply;
        return c;
    }
    public String divideCalculator(int num1, int num2) {
        if(num2==0) {
            return "Делитель не может быть нулем";
        }else {
            int divide = num1 / num2;
            String d = num1 + " / " + num2 + " = " + divide;
            return d;
        }
    }
}
