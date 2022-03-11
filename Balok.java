/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cylinder.and.cuboid;

/**
 *
 * @author achmadmutawazin
 */
public class Balok implements MenghitungRuang{
double panjang, lebar, volume, luaspermukaan, tinggi;
    public Balok(double panjang,double lebar,double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public void Volume(){
    volume = panjang*lebar*tinggi;
    System.out.println("Volume Persegi Panjang = " + volume);}
    
    public void LuasPermukaan (){
    luaspermukaan = 2*((panjang*lebar)+(panjang*tinggi)+(lebar+tinggi));
    System.out.println("Luas Permukaan Persegi Panjang = " + luaspermukaan);}
    }

