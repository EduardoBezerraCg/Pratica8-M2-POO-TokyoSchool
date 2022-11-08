package CondicioIF;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        try {
            Scanner tcd = new Scanner(System.in);
            System.out.println("Digite um numero ");
            int numero = 0;
            while( numero < 1) {
                numero = tcd.nextInt();

            }

            boolean primo = true;
            for( int i=2; i < numero; i++) {
                if ( numero %i == 0) {
                    primo = false;
                }
            }
            if (primo){
                System.out.println("Numero é Primo");
            } else {
                System.out.println("Náo é primo");
            }

        } catch (Exception e) {
            System.out.println("Falha: " + e.getMessage());
        }
    }

}
