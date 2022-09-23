/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b18.agiang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class B18AGiang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n!=0)
        {
            int a = input.nextInt();
            int count=0;
            for(int i=(int)Math.pow(10, a-1); i<=(int)Math.pow(10, a); i++)
            {
                if(kiemTraSoThuanNghich(i) && tongChuSo(i)%10==0)
                {
                    count++;
                }
            }
            System.out.println(count);
            n--;
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
    
    //KIEM TRA SO THUA NGHICH
    public static boolean kiemTraSoThuanNghich(int a)
    {
        int tmp=0;
        int b = a;
        while(b!=0)
        {
            tmp = tmp*10+b%10;
            b/=10;
        }
        if(tmp==a)
        {
            return true;
        }
        else return false;
    }
    
}
