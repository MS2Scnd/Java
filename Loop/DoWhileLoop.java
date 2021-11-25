/*
# Algoritmik

mulai
tampilkan "Awal Program"
a = 0
kondisi true
lakukan variable a dengan ditambahkan 1
lalu tampilkan "Algoritma" ditambahkan variable a
jika a tepat dari 5
maka kondisi a menjadi false
ketika koindisinya true, maka akan terus berulang
ketika kondisinya false, maka tampilkan "Akhir dari program"
 */

//------------------------------------------//

// mulai
public class DoWhileLoop {
    public static void main(String[] args) {

        System.out.println("Awal program");

// a = 0
        int a = 0;

//kondisi true
        boolean kondisi = true;

// lakukan variable a dengan ditambahkan 1
        do {
            a++;

// lalu tampilkan "Algoritma" dengan ditambahkan variable a
            System.out.println("Algoritma " + a);

// jika a tepat dari 5
            if (a == 5){

// maka kondisi menjadi false
                kondisi = false;
            }

// ketika kondisinya true, maka akan terus berulang
        }while (kondisi);

// ketika kondisinya false, maka tampilkan "Akhir dari program"
        System.out.println("Akhir program");
    }
}
