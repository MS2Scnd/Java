/*
# Algoritmik
mulai
untuk a sama dengan 1
kemudian a ditambahkan lagi dengan variable a
bila a masih kurang dari sama dengan 5
tampilkan "Algoritma" tambahkan variable a
selesai
 */

//-----------------------------------------------//

// mulai
public class ForLoop {
    public static void main(String[] args) {

        System.out.println("Mulai");

// untuk a sama dengan 1
// bila a masih kurang dari samadengan 5 -> (<= 5), a naik 1 -> (a++)
       for(int a = 1; a <= 5; a++){

// tampilkan "Algoritma" dengan ditambahkan variable a
           System.out.println("Algoritma " + a);
       }

// selesai
        System.out.println("Selesai");
    }
}
