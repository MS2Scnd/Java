/*
 # Algoritmik

 Start
 awal = 1
 ketika awala <= 5
 awal ditambahkan 1, lalu
 tampilkan "UBP Karawang"
 ketika awal sudah tepat dari 5
 keluar dari loop lalu tampilkan "Keluar dari Loop"
 Selesai.

 */


public class WhileLoop {
    public static void main(String[] args) {
        int awal = 1;
        while (awal <= 5){
            System.out.println("UBP Karawang " + awal);
            awal++;
        }
        System.out.println("Keluar dari Loop");
    }
}
