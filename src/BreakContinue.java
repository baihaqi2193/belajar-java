public class BreakContinue {
    public static void main(String[] args) {
        var i = 0;
        while(true) {
            System.out.println("Perulangan ke-" + i);
            i++;
            if(i == 10) {
                break;
            }
        };

        for (int j = 0; j < 100; j++) {
            if(j % 2 == 0){
                continue;
            }
            System.out.println("Bilangan ganjil = " + j);
        }
    }
}
