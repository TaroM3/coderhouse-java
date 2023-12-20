import java.util.Scanner;

public class NumeroFlotanteMelillo {
    public static void main(String[] args) {

        //se declara e inicializa variable que se va a utilizar para el do while
        boolean isFloat = false;

        //se ejecuta al menos una vez lo que esta dentro del bloque do while. Si no se ingresa un numero continuara ejecutandose.
        do{
            //Imprime el texto contenido por consola para indicar al usuario que debe ingresar un numero y da un salto de linea
            System.out.println("Enter a number:");
            //se instancia un objeto scanner para que el usuario ingrese un valor de un tipo no especifico por teclado
            Scanner scanner = new Scanner(System.in);
            //el if evalua si el valor ingresado es posible parsearlo a float si es verdadero ingresa en el bloque del if sino pasa al bloque del else
            if(scanner.hasNextFloat()){
                isFloat = true;
                //la variable number es declarada e inicializada con el valor parseado a float ingresado por el usuario
                float number = scanner.nextFloat();
                //imprime el numero original por el usuario y da un salto de linea con el \n
                System.out.printf("The original number is: %f\n", number);
                //la variable integerPart es declarada e inicializada con el valor parseado en integer de number
                int integerPart = (int) number;
                //la variable decimalPart es declarada e inicializada con el resultado del resto de dividir number por 1
                float decimalPart = number % 1;
                //imprime
                System.out.printf("Integer part: %d\nDecimal part: %f\n", integerPart, decimalPart);
                //se cierra la instancia de scanner
                scanner.close();
            }else {
                //informa al usuario que no ha ingresado un numero
                System.out.println("It's not a number.");
            }
        }while(!isFloat);
    }
}
