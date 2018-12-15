package first.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int numereRandom[] = {13, 7, 11, 88, 42, 23, 2, 100, 1, 123, 22, 59, 6, 29, 111, 78};
        System.out.println("Numerele pare din array sunt: ");
        for (int i = 0; i < numereRandom.length; i++) {
            if (numereRandom[i] % 2 == 0) {
                System.out.println(numereRandom[i]);
            }
        }
        System.out.println("Numerele impare din array sunt:");
        for (int i = 0; i < numereRandom.length; i++) {
            if (numereRandom[i] % 2 != 0) {
                System.out.println(numereRandom[i]);
            }


        }
    }
}
