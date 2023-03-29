/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package haslinano4;
import java.util.Scanner;


/**
 *
 * @author acerGC
 */
public class Haslinano4 {

public class KiloMill {
    public static void main(String[] args) {
        final double KmPerMil = 1.609;
        final int MeterPerKilometer = 1000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mil: ");
        double mil = scanner.nextDouble();

        double Km = mil * KmPerMil;
        double meter = Km * MeterPerKilometer;

        System.out.println(mil + " mil = " + meter + " meter.");
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
