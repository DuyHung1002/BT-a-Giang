/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b16.agiang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class B16AGiang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        while(n!=0)
        {
            int count=0;
            int a = input.nextInt();
            for(int i=(int)Math.pow(10, a-1); i<=(int)Math.pow(10, a); i++)
            {
                if(kiemTraSoNguyenTo(i))
                {
                    if( kiemTraTang(i) || kiemTraGiam(i))
                    {
                        count++;
                     System.out.println(i+"  ");
                    }
                }
                
            }
            System.out.println(count);
            n--;
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
    
    public static boolean kiemTraTang(int a)
    {
        int b=0;
        int c=0;
        while(a/10!=0)
        {
            b=a%10;
            c=(a/10)%10;
            if(b<=c)
            {
                return false;
            }
            a/=10;
        }
        return true;
    }
    
    public static boolean kiemTraGiam(int a)
    {
        int b=0;
        int c=0;
        while(a/10!=0)
        {
            b=a%10;
            c=(a/10)%10;
            if(b>=c)
            {
                return false;
            }
            a/=10;
        }
        return true;
    }
}


