public class SwitchLambda {
    public static void main(String[] args) {
        var nilai = "A";
        switch (nilai) {
            case "A" -> System.out.println("Anda lulus dengan sangat baik");
            case "B" -> System.out.println("Anda lulus dengan cukup baik");
            case "C" -> System.out.println("Anda lulus");
            case "D" -> System.out.println("Anda belum lulus");
            default -> {
                System.out.println("Anda mungkin salah jurusan!");
            }
        }
    }
}
