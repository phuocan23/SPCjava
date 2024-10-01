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
public class baikiemtra {
    public static void main(String[] args) {
        System.out.println("bai kiem tra đề 2");
        Scanner sc = new Scanner(System.in); 
        double r ,s ,v;
        System.out.println("nhap ban kinh hinh cau la: ");
        r = sc.nextDouble();
        System.out.println("nhap dien tich hinh cau la: ");
        s = sc.nextDouble();
        s = 4*Math.PI*(r*r); 
        System.out.print("nhap the tich hinh cau la: ");
        v = 4/3*Math.PI*(r * r * r); 
    }  
}


    public class baikiemtra {
        public static void main(String[] args) {
            System.out.println("10 số đầu tiên của dãy số fibonacci: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if (n < 0) 
        return -1;
        else if (n == 0 || n == 1)
        return n;
         else {
            for (int i = 2; i < n ; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            
        } 
    }
    return fn;
    }
}
   
   