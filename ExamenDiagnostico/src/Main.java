import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros;
        int suma = 0;

        System.out.println("Ingresar varios numeros y dar el total");
        System.out.println("-----------------------------------------------");
        do {
            System.out.println("Ingresa numeros :");
            numeros = sc.nextInt();

            if (numeros != 0){
                suma += numeros;
            }
        }while  (numeros !=0);

        System.out.println("La suma total es : " + suma);

    }
}