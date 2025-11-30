/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert1_50422670;
import java.util.Scanner;

/**
 *
 * @author nando
 */
public class Pert1_50422670 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();
        
        if (nilai >= 60) {
            System.out.println("Selamat, Anda LULUS!");   
        } else {
            System.out.println("Maaf, Anda TIDAK LULUS.");
        }
    }
}
