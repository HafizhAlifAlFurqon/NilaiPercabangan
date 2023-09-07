/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
//        System.out.println("Masukkan jumlah pembelanjaan");
//        double totalBelanja = input.nextDouble();
//        double diskon = 0;
//        if(totalBelanja  > 500000){
//            diskon = 0.1 * totalBelanja;
//            
//            totalBelanja -= diskon;
//            System.out.println("Total Belanja :" + totalBelanja);
//            System.out.println("Diskon : " + diskon);
        System.out.println("masukkan nilai: ");
        int nilai = input.nextInt();
        
        if (nilai > 85){
            System.out.println("lulus");
        }else{
            System.out.println("Tidak Lulus");
        }
        
        
    }
    }
    

