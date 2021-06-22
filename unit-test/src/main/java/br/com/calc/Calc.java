package br.com.calc;

import java.util.NoSuchElementException;
import java.util.Objects;

public class Calc implements Calculable{

    public Double sum(Number n1, Number n2) {
        if(Objects.isNull(n1) || Objects.isNull(n2)){
            throw new NoSuchElementException("Invalid number.");
        }
        return n1.doubleValue() + n2.doubleValue();
    }

    public Double subtraction(Number n1, Number n2) {
        return n1.doubleValue() - n2.doubleValue();
    }

    public Double multiplication(Number n1, Number n2) {
        return n1.doubleValue() * n2.doubleValue();
    }

    public Double division(Number n1, Number n2) {
        return n1.doubleValue() / n2.doubleValue();
    }
}
