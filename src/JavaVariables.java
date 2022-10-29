public class JavaVariables {
    public static void main(String[] args) {
        String name;
        name = "Muhamad Nur Baihaqi";

        int age = 20;
        String homeAddress = "Jawa Tengah";

        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Alamat: " + homeAddress);

        // Var variable
        // Harus diinisialisasi nilainya
        var variables = "Ini adalah variabel var";
        System.out.println(variables);

        // Final variable
        // Tidak bisa diubah ubah; bisa juga disebut constant
        final double pi = 3.14;

        // pi = 1.2;
        // Error!

    }
}
