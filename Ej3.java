
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner key = new Scanner (System.in);
        double horas;
        double costo;
        int mes;
        int año;
        System.out.println("ingrese las horas trabajadas y luego cuanto gana por hora: ");
        horas = key.nextDouble();
        costo = key.nextDouble();
        mes = 20;
        año = mes*12;
        System.out.println("gana " + (horas*costo)*mes + " al mes");
        System.out.println("y por año gana " + (horas*costo)*año);
    }
    }
    

