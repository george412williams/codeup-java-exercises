package util;

public class Conversion {

    public double tempConversion (double temperature, String unit){
        if (unit.equals("F")){
            return (temperature - 32) * (5.0/9.0);
        } else {
            return (temperature * (9.0/5.0)) + 32;
        }
    }

    public double lengthConversion (double measurement, String unit){
        if (unit.equals("ft")){
            return (measurement * 1.5);
        } else if (unit.equals("m")){
            return (measurement * 0.5);
        } else {
            return measurement;
        }
    }


    public static void main(String[] args) {

    }
}
