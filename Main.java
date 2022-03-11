/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cylinder.and.cuboid;

import java.util.Scanner;
import cylinder.and.cuboid.*;
/**
 *
 * @author achmadmutawazin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int menu,choice;
    double panjang, lebar, tinggi, jari;
    do{
    System.out.println("==========");
    System.out.println("Menu Utama");
    System.out.println("----------");
    System.out.println("1. Hitung Balok\n2. Hitung Tabung\n0. Exit");
    Scanner sc = new Scanner(System.in);
    System.out.print("Pilih :");
    menu = sc.nextInt();
    switch(menu){
        case 1 :
            System.out.print("Input Panjang :");
            panjang = sc.nextDouble();
            System.out.print("Input Lebar :");
            lebar = sc.nextDouble();
            System.out.print("Input Tinggi :");
            tinggi = sc.nextDouble();
            PersegiPanjang hasil = new PersegiPanjang(panjang, lebar);
            hasil.Luas();
            hasil.Keliling();
            Balok hasil2 = new Balok(panjang, lebar, tinggi);
            hasil2.Volume();
            hasil2.LuasPermukaan();break;
        case 2 : 
            System.out.print("Input Tinggi :");
            tinggi = sc.nextDouble();
            System.out.print("Input Jari-jari :");
            jari = sc.nextDouble();
            Lingkaran hasil3 = new Lingkaran (jari);
            hasil3.Luas();
            hasil3.Keliling();
            Tabung hasil4 = new Tabung (jari, tinggi);
            hasil4.Volume();
            hasil4.LuasPermukaan();break;
        case 0 :System.exit(0);break; 
        default : System.out.println("operation dose not exist. Please enter the options correctly!");   
    }
    System.out.print("Ulangi ? (Ya : 1 || Tidak : 0) : ");
    choice = sc.nextInt();
    }while(choice == 1);}}