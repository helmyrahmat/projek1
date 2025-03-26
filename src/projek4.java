/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class projek4 {
    public static void main(String[] args) {
         int data [][]= {{ 4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
         double total_1 = 0;
         double total_2 = 0;
         double total_3 = 0;
         
         // menjumlahkan
         for ( int a =0; a< data.length; a++ ) {
            for ( int b =0; b< data[a].length; b++){
                System.out.print(data[a][b] + " ");
            }
            System.out.print("\n");
         }
         System.out.println("\nArry Baris ke-1 : ");
         for ( int a = 0; a < data[0].length; a++) {
             if ( a % 2 !=0 ){
             System.out.print(data[0][a]);
             if (a == ( data[0].length - 1 )){
                 System.out.print(" = ");
             } else {
                 System.out.print(" + ");
             }
             total_1 += data[0][a];
         }
         }
         System.out.println(total_1);
         
         System.out.println("Arry Baris ke-2 : ");
         for ( int b = 0; b < data[0].length; b++) {
             if ( b % 2 !=0 ){
             System.out.print(data[1][b]);
             if (b == ( data[0].length - 1 )){
                 System.out.print(" = ");
             } else {
                 System.out.print(" + ");
             }
             total_2 += data[0][b];
         }
         }
         System.out.println(total_2);
         
         total_3 = total_1 + total_2;
         System.out.println("\nBaris 1 + Baris 2 = " + total_3);
    }
    
}
