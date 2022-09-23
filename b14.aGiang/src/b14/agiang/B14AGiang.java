/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b14.agiang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class B14AGiang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        while(n!=0)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            int count = 0;
            for(int i=a; i<=b; i++)
            {
                if(kiemTraThuanNghich(i) && kiemTraSoNguyenTo(i))
                {
                    count++;
                    System.out.printf("%6d ", i);
                    if(count%10==0)
                    {
                        System.out.println("");
                    }
                }
            }
            n--;
            System.out.printf("\n\n");
        }
        
    }
    
    public static boolean kiemTraSoNguyenTo(int a)
    {
        if(a<2)
        {
            return false;
        }
        else
        {
            for(int i=2; i<=(int)Math.sqrt(a); i++)
            {
                if(a%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    
    public static boolean kiemTraThuanNghich(int a)
    {
        int tmp=0;
        int b = a;
        while(b!=0)
        {
            tmp = tmp*10+b%10;
            b/=10;
        }
        if(a==tmp)
        {
            return true;
        }
        else return false;
    }
}
