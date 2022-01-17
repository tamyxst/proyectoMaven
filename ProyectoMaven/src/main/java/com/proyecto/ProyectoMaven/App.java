package com.proyecto.ProyectoMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int resultadoSuma=0, resultadoResta=0, resultadoMulti=0, resultadoDiv=0;
        //Suma
        resultadoSuma=suma(3,5);
        System.out.println("El resultado de la suma es: " +resultadoSuma);
        
        resultadoSuma=resta(5,7);
        System.out.println("El resultado de la resta es: " +resultadoSuma);
        
        resultadoSuma=multiplicacion(10,5);
        System.out.println("El resultado de la multiplicaiÃ³n es: " +resultadoSuma);
        
        resultadoSuma=division(10,0);
        System.out.println("El resultado de la divisiÃ³n es: " +resultadoSuma);
    }
    public static int suma(int num1, int num2) {
        return num1 + num2;
        
    }

    public static int resta(int num1, int num2) {
        int resultado = 0;
        resultado = num1 - num2;
        if (resultado < 0) {
            resultado = 0;
        }
        return resultado;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        int resultado = 0;
        try {
            resultado = num1 / num2;
        } catch (ArithmeticException o) {
            System.out.println("\t...No se puede dividir por 0...");
            resultado = 0;
        }
        return resultado;
    }
}
