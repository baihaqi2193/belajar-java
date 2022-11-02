public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";
        switch (nilai) {
            case "A":
                System.out.println("Selamat! Anda lulus dengan baik");
                break;
            case "B":
                System.out.println("Selamat! Anda lulus");
                break;
            case "C":
                System.out.println("Anda lulus!");
                break;
            case "D":
                System.out.println("Maaf, anda belum lulus");
                break;
            default:
                System.out.println("Anda salah jurusan!");
                break;
        }
    }
}
