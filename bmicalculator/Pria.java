/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmicalculator;

import utility.CategoryBMIUtil;
import utility.DetailBMIUtil;
import utility.IdealMassUtil;

/**
 *
 * @author ruffi
 */


/**

Kelas Pria merupakan kelas turunan dari kelas General dan mengimplementasikan utilitas DetailBMIUtil.

Kelas ini memiliki atribut indeksMassaPria.
*/
public class Pria extends General implements DetailBMIUtil{
    private double indeksMassaPria = 1.1;
/**

Konstruktor tanpa parameter yang memanggil konstruktor tanpa parameter dari kelas induk.
*/
    public Pria(){
        super();
    }
  /**

Konstruktor dengan parameter tinggi dan berat yang memanggil konstruktor dengan parameter dari kelas induk.
@param tinggi tinggi badan yang akan dijadikan sebagai nilai awal
@param berat berat badan yang akan dijadikan sebagai nilai awal
*/  
    public Pria(int tinggi, int berat) {
        super(tinggi, berat);
    }
/**

Menghitung nilai BMI (Body Mass Index) berdasarkan tinggi dan berat dengan faktor indeksMassaPria.
@param tingi tinggi badan dalam satuan meter
@param berat berat badan dalam satuan kilogram
@return nilai BMI (Body Mass Index) dengan faktor indeksMassaPria
*/
    @Override
    public double calculateBMI(double tingi, double berat) {
        double tampung = super.calculateBMI(tingi, berat);
        return indeksMassaPria * tampung;
    }
    
    public double calculateBMI(double tinggi, double berat, boolean inci, boolean pound) {
        // CHECK APAKAH SATUAN PANJANG CM ATAU INCI
        if (inci){
            tinggi = tinggi * 0.0254;
        } else{
            tinggi = tinggi / 100;
        }
        
        // CHECK APAKAH SATUAN BERAT KG ATAU POUND
        if (pound){
            berat = berat * 0.453592;
        }
        return calculateBMI(tinggi, berat);
    }
    
    @Override
    public double idealMass(double tinggi, boolean inci) {
        double beratBadanIdeal;
        double indeksPria = 0.1;
        if (inci){
            tinggi = tinggi * 0.0254;
        } else{
            tinggi = tinggi / 100;
        }
        beratBadanIdeal = tinggi * tinggi * 20.00;
        return beratBadanIdeal;
    }

}
