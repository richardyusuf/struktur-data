/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugastugas1;

/**
 *
 * @author Richard
 */
public class Tugastugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka [][] = {{2,4,6,8},{3,9,27,30},{4,16,20,24},{15,25,35,45}};
        
        for (int a = 0; a < angka.length; a++) {
            for (int b = 0; b < angka [a].length; b++){
                System.out.print(angka[a][b]+"\t");
        }
        System.out.println();
    }
}
}   
