public class VarArgs {
    public static void main(String[] args) {
        int[] nilai = {90, 90, 80};
        lulusDecision1("Haqi", nilai);
        lulusDecision2("Eko", 50, 20 , 30 , 40);
    }

    private static void lulusDecision1(String name, int[] nilai){
        var total = 0;
        for (int value :
             nilai) {
            total += value;
        }
        var avg = total / nilai.length;

        if(avg >= 75){
            System.out.println("Selamat! " + name + ", Anda lulus!");
        } else {
            System.out.println("Maaf, anda belum lulus :(");
        }
    }

    private static void lulusDecision2(String name, int... values){
        var total = 0;
        for (int value :
                values) {
            total += value;
        }
        var avg = total / values.length;

        if(avg >= 75){
            System.out.println("Selamat! " + name + " ,Anda lulus!");
        } else {
            System.out.println("Maaf, "+ name +", anda belum lulus :(");
        }
    }
}
