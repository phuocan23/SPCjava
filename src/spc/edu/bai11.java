/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class bai11 {
        public static int nhap()
        {
            Scanner input=new Scanner(System.in);
            boolean check=false;
            int n=0;
            while(!check){
                System.out.print(" ");
                try{
                    n=input.nextInt();
                    check=true;
                }catch(Exception e){
                    System.out.println("Ban phai nhap so! hay nhap lai...");
                    input.nextLine();
                }
            }
            return(n);
        }
        public static int UCLN(int a,int b){
            while(a!=b){
                if(a>b)a=a-b;
                else b=b-a;
            }
            return(a);
        }
        public static void main(String[]args){
            System.out.println("nhap a");
            int a = nhap();
            System.out.println("nhap b");
            int b = nhap();
            System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la:"+UCLN(a,b));
            System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la:"+((a*b)/UCLN(a,b)));
        }
    } 

