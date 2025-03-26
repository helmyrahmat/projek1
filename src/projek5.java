/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class projek5 {
    public static void main(String[] args) {
        String data [][]= {
            { "ABDUL", "085646668991", "Kediri"},
            { "KUSNO", "085646668992","Trenggalek"},
            { "PONIRAN", "085646668999", "Bojonegoro"}
        
    };
        System.out.print("Nama\t");
        System.out.print("  Alamat\t");
        System.out.print("\tTelepon\t");
        System.out.println("");
        String nama = "";
        
        for ( int a = 0; a < data.length; a++){
            System.out.print(String.format("%-10s", data[a][0]));
            System.out.print(String.format("%-15s", data[a][2]));
            System.out.print(String.format("%-10s", data[a][1]));
            System.out.println("");
            
            
        }
    }
    
}
