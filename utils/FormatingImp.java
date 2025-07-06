package utils;

public class FormatingImp implements Formating {
    @Override
    public float twoDigits(float number){
        return (float) (Math.round(number*100) / 100.0);
    }

    @Override
    public float oneDigit(float number){
        return (float) (Math.round(number*10) / 10.0);
    }
}