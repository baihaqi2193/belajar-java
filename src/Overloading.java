public class Overloading {
    public static void main(String[] args) {
        // Overloading memungkinkan kita membuat method dengan nama sama dengan hasil yang
        // berbeda-beda dengan syarat jumlah atau tipe data parameter yang berbeda-beda
        sayHello();
        sayHello("Haqi");
        sayHello("Haqi", 2);
    }

    static void sayHello(){
        System.out.println("Hello!");
    }

    static void sayHello(String nama){
        System.out.println("Hello, " + nama);
    }

    static void sayHello(String nama, int n){
        for (var i = 1; i <= n; i++){
            System.out.println("Halo ke-" + i + ":");
            sayHello(nama);
        }
    }
}
