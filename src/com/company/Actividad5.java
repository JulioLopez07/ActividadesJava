package com.company;
import java.util.Scanner;
public class Actividad5 {

    public static void main(String[] args){
        float X = 0, Y = 0, suma, resta, multiplicacion, division, modulo;
        Scanner entrada = new Scanner(System.in);

        //Asignar valores
        System.out.print("Ingrese X: ");
        X = entrada.nextFloat();
        System.out.print("Ingrese Y: ");
        Y = entrada.nextFloat();

        //** Operaciones
        suma = X + Y;
        resta = X - Y;
        multiplicacion = X * Y;
        division = X / Y;
        modulo = X % Y;
        //**Resultados
        System.out.println("X = " + X );
        System.out.println("Y = " + Y);
        System.out.println("Suma: " + suma );
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
    }
}
