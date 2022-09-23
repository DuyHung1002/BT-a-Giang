/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai11.agiang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai11AGiang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n!=0)
        {
            int a = input.nextInt();
            int b = a%10;
            int c = 0;
            while(a!=0)
            {
                if(a>=1 && a<=9)
                {
                    c = a;
                    break;
                }
                else a/=10;
            }
            if(b==c)
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
            n--;
        }
    }
    
}
