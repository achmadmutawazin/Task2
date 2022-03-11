/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cylinder.and.cuboid;

/**
 *
 * @author achmadmutawazin
 */
public class PersegiPanjang implements MenghitungBidang {
private double panjang, lebar, tinggi, luas, keliling;
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void Luas(){
    luas = panjang*lebar;
    System.out.println("Luas Persegi Panjang = " + luas);
    }
    
    public void Keliling(){
    keliling = (2*panjang)+(2*lebar);
    System.out.println("Keliling Persegi Panjang = " + keliling);
    }}
    

