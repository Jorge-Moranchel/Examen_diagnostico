import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros;
        int suma = 0;

        do {
            System.out.println("Ingresa los numeros :");
            numeros = sc.nextInt();

            if (numeros != 0){
                System.out.println("Numero ingresado : " + numeros);
                suma += numeros;
            }
        }while  (numeros !=0);

        System.out.println("La suma total es : " + suma);

    }
}