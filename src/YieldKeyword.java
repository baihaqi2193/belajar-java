public class YieldKeyword {
    public static void main(String[] args) {
        var nilai = "A";
        String ucapan;

         ucapan = switch (nilai) {
             case "A" :  yield "Anda lulus dengan sangat baik";
             case "B" :  yield "Anda lulus dengan cukup baik";
             case "C" :  yield "Anda lulus";
             case "D" :  yield  "Anda belum lulus";
             default : {
                 yield "Anda mungkin salah jurusan!";
            }
        };

        System.out.println(ucapan);
    }
}
