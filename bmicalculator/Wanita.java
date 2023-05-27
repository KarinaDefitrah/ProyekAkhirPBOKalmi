/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmicalculator;

/**
 *
 * @author ruffi
 */
public class Wanita extends General{
    private double indeksMassaWanita = 0.9;

    public Wanita(){
        super();
    }
    
    public Wanita(int tinggi, int berat) {
        super(tinggi, berat);
    }

    @Override
    public double calculateBMI(double tingi, double berat) {
        double tampung = super.calculateBMI(tingi, berat);
        return indeksMassaWanita * tampung;
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
    public double idealMass(double tinggi, boolean  inci) {
        double beratBadanIdeal;
        double indeksPria = 0.15;
        if (inci){
            tinggi = tinggi * 0.0254;
        } else{
            tinggi = tinggi / 100;
        }
        beratBadanIdeal = tinggi * tinggi * 24.00;
        return beratBadanIdeal;
    }

}
