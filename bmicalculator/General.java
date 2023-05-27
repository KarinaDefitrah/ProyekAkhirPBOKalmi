/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmicalculator;

import utility.DetailBMIUtil;
import utility.IdealMassUtil;

/**
 *
 * @author ruffi
 */
/**

Kelas abstrak General merupakan kelas yang mengimplementasikan utilitas perhitungan BMI dan berat ideal.

Kelas ini memiliki atribut tinggi, berat, dan BMI.
*/
public abstract class General implements  DetailBMIUtil, IdealMassUtil{
    private double tinggi;
    private double berat;
    private double bmi;

/**

Konstruktor tanpa parameter yang menginisialisasi tinggi, berat, dan BMI dengan nilai 0.
*/
    public General(){
        tinggi = 0;
        berat = 0;
        bmi = 0.0;
    }
/**

Konstruktor dengan parameter tinggi dan berat yang menggunakan konstruktor tanpa parameter untuk menginisialisasi nilai awal.
@param tinggi tinggi badan yang akan dijadikan sebagai nilai awal
@param berat berat badan yang akan dijadikan sebagai nilai awal
* 
*/
    
    public General(int tinggi, int berat) {
        this();
        this.tinggi = tinggi;
        this.berat = berat;
    }
/**

Mengembalikan nilai tinggi badan.
@return tinggi badan
*/
    public double getTinggi() {
        return tinggi;
    }
/**

Mengatur nilai tinggi badan.
@param tinggi tinggi badan yang akan diatur
*/
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
/**

Mengembalikan nilai berat badan.
@return berat badan
*/
    public double getBerat() {
        return berat;
    }
/**

Mengatur nilai berat badan.
@param berat berat badan yang akan diatur
*/
    public void setBerat(double berat) {
        this.berat = berat;
    }
/**

Mengembalikan nilai BMI (Body Mass Index).
@return BMI (Body Mass Index)
*/
    public double getBmi() {
        return bmi;
    }
/**

Mengatur nilai BMI (Body Mass Index).
@param bmi BMI (Body Mass Index) yang akan diatur
*/
    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
/**

Menghitung nilai BMI (Body Mass Index) berdasarkan tinggi dan berat yang diberikan.
@param tinggi tinggi badan dalam satuan meter
@param berat berat badan dalam satuan kilogram
@return nilai BMI (Body Mass Index)
*/
    public double calculateBMI(double tinggi, double berat) {
        return berat / (Math.pow(tinggi, 2));
    } 
    
}
