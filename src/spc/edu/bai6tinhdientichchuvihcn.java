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
public class bai6tinhdientichchuvihcn {
    public static void main(String[] args) {
        System.out.println("chuong trinh hinh chu nhat");
        Scanner sc = new Scanner(System.in);
        double cd, cr, cv, dt;
        System.out.println("nhap chieuDai:");
        cd = sc.nextDouble();
        System.out.println("nhap chieuRong:");
        cr = sc.nextDouble();
        cv = 2*(cd+cd);
        dt = cd*cr;
        System.out.println("chuVi:" + cv);
        System.out.println("dienTich:" + dt);
    }
}
