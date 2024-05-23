import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SequencedSet;

public class EjemploSwitch {
 public static  void main(String[]args){
     Scanner cmd = new Scanner(System.in);
     double numUno =0, numDos=0, resultado;
     int opcion = 1;


    while(opcion != 0){
        try{
            System.out.println("Seleccione una operacion 1: Sumar, 2: Restar, 3: Multiplicar, 4: Dividir");
            opcion = cmd.nextInt();

            if(opcion < 1 || opcion > 4){
                throw new InputMismatchException();
            }



            System.out.println("Digite el primer numero");
            numUno  = cmd.nextDouble();
            System.out.println("Digite el segundo numero");
            numDos  = cmd.nextDouble();
        }catch(InputMismatchException error){
            System.out.println("Elige una opcion valida bastardo, te equivocaste, son numeros");
            cmd.nextLine(); // Limpia el buffer del scanner
        }



        switch(opcion) {
            case 1:
                resultado = numUno+numDos;
                System.out.println("EL resultado de la suma es "+resultado);
                break;
            case 2:
                resultado = numUno-numDos;
                System.out.println("EL resultado de la resta es "+resultado);
                break;
            case 3:
                resultado = numUno*numDos;
                System.out.println("EL resultado de la multipliacacion es "+resultado);
                break;
            case 4:
                resultado = numUno/numDos;
                System.out.println("EL resultado de la division es "+resultado);
                break;

        }

        if(opcion == 0) {
            break; // Sale del bucle si la opción es 0
        }
    }
}
}
