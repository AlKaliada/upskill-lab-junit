package com.epam.kaliada;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println((double) -1/3);
    }

    public static double[] quadraticEquation(double a, double b, double c){
        if (a == 0){
            throw new IllegalArgumentException("'a' should not be equal to 0");
        }
        double[] result;
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0){
            result = new double[2];
            double firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
            double secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
            result[0] = firstRoot;
            result[1] = secondRoot;
            return result;
        }else if (discriminant == 0){
            result = new double[1];
            result[0] = -b / 2 * a;
            return result;
        }else {
            return new double[0];
        }
    }
}
