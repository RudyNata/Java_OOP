package org.example.homeWork2;

public class Calcul implements Calculator{
    private double first;
    private double second;
    private String symbol;
    public Calcul (double first, double second, String symbol) {
        this.first = first;
        this.second = second;
        this.symbol = symbol;
    }
    public double getFirst() {
        return first;
    }
    public double getSecond() {
        return second;
    }
    public String getSymbol() {
        return symbol;
    }

    @Override
    public double addition() {
        return first + second;
    }
    @Override
    public double subtraction() {
        return first - second;
    }
    @Override
    public double multiplication() {
        return first * second;
    }
    @Override
    public double division() {
        return first / second;
    }
    @Override
    public String operation(String symbol) {
        switch (symbol) {
            case "+":
                return (String.format("%.2f + %.2f = %.2f", getFirst(), getSecond(), addition()));
            case "-":
                return (String.format("%.2f - %.2f = %.2f", getFirst(), getSecond(), subtraction()));
            case "*":
                return (String.format("%.2f * %.2f = %.2f", getFirst(), getSecond(), multiplication()));
            case "/":
                return (String.format("%.2f / %.2f = %.2f", getFirst(), getSecond(), division()));
            default:
                return null;
        }
    }
}
