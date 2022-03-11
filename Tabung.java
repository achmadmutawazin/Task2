/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cylinder.and.cuboid;

/**
 *
 * @author achmadmutawazin
 */
public class Tabung implements MenghitungRuang{
    double jari, volume, luaspermukaan, tinggi;
    public Tabung(double jari,double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    
    public void Volume(){
    volume = phi*jari*jari*tinggi;
    System.out.println("Volume Tabung = " + volume);}
    
    public void LuasPermukaan (){
    luaspermukaan = 2*phi*jari*(jari+tinggi);
    System.out.println("Luas Permukaan Tabung = " + luaspermukaan);}
    }
