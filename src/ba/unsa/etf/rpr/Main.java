package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i%sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }

    private static int sumaCifara(int x) {
        int zbir = 0;
        String odX = String.valueOf(x);
        String[] brojevi = odX.split("");
//        for(String s : brojevi ) System.out.println(s);
        for(int i=0; i<brojevi.length; i++) {
            zbir = zbir + Integer.parseInt(brojevi[i]);
        }
        return zbir;
    }
}
