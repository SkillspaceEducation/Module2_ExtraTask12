import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] mas = new int[10];
        int numPlus = 0;
        int numMinus = 0;
        int j = 0;
        int k = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(-100, 100);
        }
        System.out.println("Исходный массив " + Arrays.toString(mas));

        for (int el : mas) {
            if (el >= 0) { // Определяем количество положительных элементов
                numPlus++;
            } else {        // Определяем количество отрицательных элементов
                numMinus++;
            }
        }

        int[] masPlus = new int[numPlus];
        int[] masMinus = new int[numMinus];

        for (int value : mas) {
            if (value >= 0) {
                masPlus[j] = value;
                j++;
            } else {
                masMinus[k] = value;
                k++;
            }
        }
        System.out.println("Массив с положительными элементами " + Arrays.toString(masPlus));
        System.out.println("Массив с отрицательными элементами " + Arrays.toString(masMinus));
    }
}