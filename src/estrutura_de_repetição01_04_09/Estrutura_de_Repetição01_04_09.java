/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_de_repetição01_04_09;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Estrutura_de_Repetição01_04_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * for ([inicialização]; [condição]; [atualização] [comando]
         *
         * for para esse caso (int i = o; i < 5; i++)
         */

        Scanner leitor = new Scanner(System.in);
        int tabuada;
        
        System.out.print("Qual tabuada deseja saber:");
        tabuada = leitor.nextInt();
        
        for (int num = 1; num <= 10; num++) {
            System.out.println(num * tabuada);
        

        }
        leitor.close();
    } 
}
