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
public class bai7hinhtron {
    public static void main(String[] args) {
        System.out.println("chuong trinh hinh tron");
        Scanner sc = new Scanner(System.in);
        double r , s , p;
        System.out.println("nhap ban kinh");
        r = sc.nextDouble();
        s = 2*Math.PI*r;
        System.out.println("chu vi =" + s);
        p = r*r*Math.PI;
        System.out.println("dien tich =" + p);
    }
}
