/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18111167_irvan_maulana_tugassesi02;
import java.util.Scanner;
/**
 *
 * @author Seishuu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ("Tugas Algoritma Menghitung Panjang");
        int Panjang;
        int Lebar;
        int Luas;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("masukkan panjang");
        Panjang = input.nextInt();
        System.out.println("masukkan lebar");
        Lebar = input.nextInt();
        
        Luas = Panjang*Lebar;
        
        System.out.println("Luas=" + Luas);
    }
    
}
