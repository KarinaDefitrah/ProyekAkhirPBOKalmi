/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utility;

/**
 *
 * @author ruffi
 */


/**

Interface CategoryBMIUtil adalah sebuah antarmuka yang menyediakan utilitas

untuk kategori Indeks Massa Tubuh (BMI).
*/

/**
Metode untuk mengembalikan kategori BMI berdasarkan nilai BMI yang diberikan.
@param bmi Nilai Indeks Massa Tubuh (BMI) yang akan dikategorikan.
@return Kategori BMI yang sesuai dengan nilai BMI:

*/
public interface CategoryBMIUtil {
    
    static String categoryBMI(double bmi) {
        String category = "";
        if (bmi < 18.5){
            category = "Kekurangan Berat Badan";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            category = "Berat Badan Normal";
        } else if (bmi >= 23.0 && bmi <= 25.0) {
            category = "Kelebihan Berat Badan";
        } else if (bmi > 25.0) {
            category = "Obesitas";
        }
        return category;
    }
}
