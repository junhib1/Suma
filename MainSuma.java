// Importa la clase Scanner
import java.util.Scanner;

// Clase principal MainSuma
public class MainSuma {
    // Método principal main
    public static void main(String[] args) {
        // Crea una instancia de la clase Suma
        Suma suma1 = new Suma();
        // Declaración de variables
        int a, e;

        // Crea una instancia de Scanner para la entrada de usuario
        Scanner op = new Scanner(System.in);
        // Solicita al usuario que ingrese el primer número
        System.out.print("Ingresa el primer numero: ");
        // Lee el primer número ingresado por el usuario
        a = op.nextInt();
        // Solicita al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo numero: ");
        // Lee el segundo número ingresado por el usuario
        e = op.nextInt();

        // Establece los números ingresados como operandos de la suma
        suma1.setNum1(a);
        suma1.setNum2(e);

        // Muestra el resultado de la suma
        suma1.MostrarResultado();
    }
}