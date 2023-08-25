package B3;

public class TrabajoenclaseB3 {
    public static void main (String[]args) {

        System.out.println("numeros primos del 1 al 1000 ");

        for (int num = 2; num <= 1000; num++) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(num + "");
            }
        }
    }


}
