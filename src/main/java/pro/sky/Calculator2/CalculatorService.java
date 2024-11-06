package pro.sky.Calculator2;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Double divide(Integer num1, Integer num2) {
        return (double) (num1 / num2);
    }

    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

}
