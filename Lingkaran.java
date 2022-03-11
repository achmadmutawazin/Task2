/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cylinder.and.cuboid;

/**
 *
 * @author achmadmutawazin
 */
public class Lingkaran implements MenghitungBidang {
    private double luas, jari, keliling;
    
    public  Lingkaran(double jari){
    this.jari = jari;}
    
    public void Luas(){
    luas = phi*jari*jari;
    System.out.println("Luas Lingkaran = " + luas);}
    
    public void Keliling (){
    keliling = 2*phi*jari;
    System.out.println("Keliling Lingkaran = " + keliling);}
      
}
