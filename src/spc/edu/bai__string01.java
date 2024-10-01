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
public class bai__string01 {
    public static void main(String[] args) {
        System.out.println("bai tap ve string");
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho va ten");
        String hovaten = sc.nextLine();
        System.out.println("ho:" + hovaten.substring(0,7));
        System.out.println("lot:" + hovaten.substring(7,17));
        System.out.println("ten:" + hovaten.substring(18));
        System.out.println("hovaten:" + hovaten);
        
    }
}
