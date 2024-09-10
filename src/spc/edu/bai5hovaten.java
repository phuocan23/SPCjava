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
public class bai5hovaten {
    public static void main(String[] args) {
        System.out.println("chuong trinh QUAN LY SINH VIEN");
        Scanner sc = new Scanner (System.in);
        System.out.println("nhap ho va ten");
        //String hoten = sc.next();
        String hoten = sc.nextLine();
        System.out.println("nhap nam sinh cua ban:");
        int namsinh = sc.nextInt();
        System.out.println("chao ban" + hoten);
        System.out.println("Tuoi cua ban la " + (2024-namsinh));
    }
}
