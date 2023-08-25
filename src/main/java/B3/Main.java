package B3;

import java.util.Arrays;

public class Main {

    public static void main (String[] args){
int[] numeros = new int[100];
numeros[67]=15;
numeros[88]=30;
System.out.println(Arrays.stream(numeros).sum());
        System.out.println("_________________________________________");
Arrays.stream(numeros) .forEach(System.out::println);

}
}
