/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai12.agiang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai12AGiang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n!=0)
        {
            int a = input.nextInt();
            int sum=0;
            while(a!=0)
            {
                sum+=a%10;
                a/=10;
            }
            if(sum%10==0)
            
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
            n--;
        }
    }
    
}
