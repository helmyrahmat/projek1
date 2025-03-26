
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class projek3 {
     public static void main(String[] args) {
         int data [][]= {{ 4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        
        for ( int a =0; a< data.length; a++ ) {
            for ( int b =0; b< data[a].length; b++){
                System.out.print(data[a][b]+ " ");
            }
            System.out.print("\n");
        }
        System.out.println("");
        
        //mengubah keJOption
        int searchBaris = Integer.parseInt(JOptionPane.showInputDialog("Masukan baris (0 - 1)"));
        int searchKolom = Integer.parseInt(JOptionPane.showInputDialog("Masukan baris (0 - 7)"));
        
        if (searchBaris >= 0 && searchBaris < data.length && searchKolom >= 0 && searchKolom < data[searchBaris].length){
            
            int newValue = Integer.parseInt(JOptionPane.showInputDialog("Masukan nilai dari : ("+ searchBaris +"," + searchKolom + ")"));
             data[searchBaris][searchKolom]= newValue;
             System.out.println("Nilai dari ( " + searchBaris + "," + searchKolom + ")Telah dirubah");
             
        } else {
            System.out.println("Kolom tidak valid!");
        }
        System.out.println("\nArray setelah dirubah");
        for ( int a =0; a< data.length; a++ ) {
            for ( int b =0; b< data[a].length; b++){
                System.out.print(data[a][b]);
            }
            System.out.println("");
        }
        System.out.println("");
     }
    
}
