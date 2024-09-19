//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void intercambiarNumeros(int num1, int num2){
        int swap;
        System.out.println("----------------------------------------");
        System.out.println("Los numeros son: " + "Numero1 = " + num1 + " y Numero2 = " + num2);
        swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("-----------------INTERCAMBIO-----------------------");
        System.out.println("Ahora Numero1 = " + num1 + " y Numero2 = " + num2 );
        System.out.println("----------------------------------------");

    }


    public static void main(String[] args) {

intercambiarNumeros(5,8);


    }
}