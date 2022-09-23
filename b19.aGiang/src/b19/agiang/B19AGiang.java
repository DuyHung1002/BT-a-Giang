/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b19.agiang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class B19AGiang {

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
            int b = input.nextInt();
            for(int i=a; i<=b; i++)
            {
                if(kiemTraSoNguyenTo(tongChuSo(i))
                        && kiemTraTungChuSo(i)
                        && kiemTraSoNguyenTo(i))
                {
                    count++;
                }
            }
            System.out.println(count);
            n--;
        }
    }
    
    //KIEM TRA SO NGUYEN TO
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
    
    //TONG CAC CHU SO
    public static int tongChuSo(int a)
    {
        int sum=0;
        while(a!=0)
        {
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
    
    public static boolean kiemTraTungChuSo(int a)
    {
        while(a!=0)
        {
            if(!kiemTraSoNguyenTo(a%10))
            {
                return false;
            }
            a/=10;
        }
        return true;
    }
}
