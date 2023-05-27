/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utility;

/**
 *
 * @author ruffi
 */
public interface DetailBMIUtil {
    default String detailBMI(double bmi) {
        String category = CategoryBMIUtil.categoryBMI(bmi);
        String kalimat = "";
        if (category.equalsIgnoreCase("Kekurangan Berat Badan")){
            kalimat = """
                      <html><center>Anda berada dalam kategori kekurangan berat badan<center>
                      <center>Perbanyaklah konsumsi makanan bernutrisi dan padat kalori<center><html>
                      """;
        } else if (category.equalsIgnoreCase("Berat Badan Normal")) {
            kalimat = """
                      <html><center>Anda berada dalam kategori berat badan yang normal<center><b
                      <center>Tetap pertahankan berat badan Anda dan jaga berat badan Anda dengan<center>
                      <center>mengatur keseimbangan antara pola makan dan aktivitas fisik<center><html>
                      """;
        } else if (category.equalsIgnoreCase("Kelebihan Berat Badan")){
            kalimat = """
                      <html><center>Cara terbaik untuk menurunkan berat badan adalah dengan<center>
                      <center>mengatur kalor makanan yang dikonsumsi dan berolahraga.<center>
                      <center>Jika BMI Anda berada dalam kategori ini maka Anda dianjurkan<center>
                      <center>untuk menurunkan berat badan hingga batas normal.<center><html>
                      """;
        } else if (category.equalsIgnoreCase("Obesitas")){
            kalimat = """
                      <html><center>Usahakan untuk menurunkan berat badan dan menerapkan<center>
                      <center>pola hidup sehat dengan menjaga makan dan aktivitas fisik<center>
                      <center>Segera kunjungi dokter untuk dilakukan pemeriksaan kesehatan lanjutan<center>
                      <center>untuk mengetahui risiko yang Anda miliki terkait berat badan Anda<center><html>
                      """;
        }
        return kalimat;
    }
}
