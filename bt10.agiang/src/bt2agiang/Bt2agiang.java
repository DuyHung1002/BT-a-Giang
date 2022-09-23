/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt2agiang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bt2agiang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n!=0)
        {
            int a = input.nextInt();
            int countEven =0;
            int countOdd=0;
            while(a!=0)
            {
                if((a%10)%2==0)
                {
                    countEven++;
                }
                else
                {
                    countOdd++;
                }
                a/=10;
            }
            System.out.println(countEven+" "+countOdd);
            n--;
        }
    }
    
}
