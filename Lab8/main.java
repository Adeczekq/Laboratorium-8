import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class blendna extends Exception {
    public blendna(String message) {
        super(message);
    }
}
public class main {


        public static void main(String[] args) {
           // zadanie1();
           zadanie2();
        }

        public static void zadanie1() {
            System.out.println("Podaj liczbe: ");
            Scanner input = new Scanner(System.in);
            double x = 0;
            while (true) {
                try {
                    x = input.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Podaj poprawna liczbe! ");
                    input.next();
                }
            }
            if (x < 0) {
                throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby"
                        + "%.4f nie istnieje", x));
            }
            System.out.println(String.format("Pierwiastek z %.4f = %.4f", x, Math.sqrt(x)));
        }

        public static void zadanie2() {
            try {
                System.out.println("5!= " + silnia(5));
                System.out.println("2!= " + silnia(2));
            } catch (blendna e) {
                System.out.println("erro: " + e.getMessage());
            }
        }

        public static int silnia(int n) throws blendna {
            if (n < 0) {
                throw new blendna("Silnia z liczby ujemnej nie istnieje");
            }
            int wynik = 1;
            for (int i = 1; i <= n; i++) {
                wynik *= i;
            }
            return wynik;
        }
}



