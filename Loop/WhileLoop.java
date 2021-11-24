/*
 # Algoritmik

 mulai Loop
 awal = 1
 bila a kurang dari 5
 tampilkan "Algoritma" dengan tambahankan variable a
 bila variable a masih kurang dari 5, variable a ditambahkan lagi dengan variable a
 ketika variable a sudah mencapai targetnya yaitu kurang dari samadengan 5
 tampilkan "Loop Selesai"
 loop selesai
 */

//--------------------------------------------//

// mulai Loop
public class WhileLoop {
    public static void main(String[] args) {

        System.out.println("Mulai Loop");

// awal = 1
        int a = 1;
// bila a kurang dari 5 -> (a <= 5)
        while (a <= 5){

// tampilkan "Algoritma" dengan tambahankan variable a
            System.out.println("Algoritma " + a);

// bila variable a masih kurang dari 5, variable a ditambahkan lagi dengan variable a -> (a++)
            a++;

// ketika variable a sudah mencapai targetnya yaitu kurang dari samadengan 5 ->(<=5)
// tampilkan "Loop Selesai" lalu selesai
        }
        System.out.println("Loop Selesai");
    }
}
