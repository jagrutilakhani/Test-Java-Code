package src;

public class Calculator {
    private double firstNumber;
    private  double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionalresult(){
        return firstNumber + secondNumber;
    }
    public  double getSubtraction(){
        return firstNumber - secondNumber;
    }
    public double getMultiplication(){
        return firstNumber * secondNumber;
    }
    public double getDvisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        return firstNumber / secondNumber;
    }
}
