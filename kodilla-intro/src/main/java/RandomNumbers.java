import java.util.Random;
import java.util.stream.IntStream;
public class RandomNumbers {

    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            System.out.println("Liczby z zakresu 0-30" + "    "+randomBetween(0, 30) + " Najwieksza" + "Najmniejsza" );

        }
    }

    static int randomBetween(int start, int end) {

        Random random = new Random();   //tutaj zwracane sa liczby  od 0 do 30//
        int a1 = random.nextInt(end - start + 1);
        int a2 = a1 + start;
        return a1;

    }


}




