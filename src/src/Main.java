import java.util.Scanner;

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

    public static void calcularSueldo(){
        double sueldoRepositor = 15890;
        double sueldoCajero = 25630.89;
        double sueldoSupervisores = 35560.20;
        Scanner sc = new Scanner (System.in);


        System.out.println("Que sueldo desea calcular: ");
        System.out.println("1. Repositor");
        System.out.println("2. Cajero");
        System.out.println("3. Supervisor");

       int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                double pagoRepositor = sueldoRepositor + (sueldoRepositor * 0.10);
                System.out.println("EL pago total al repositor debe ser de: " + pagoRepositor);
                break;
            case 2:
                double pagoCajero = sueldoCajero;
                System.out.println("El pago al cajero debe ser de: " + pagoCajero);
                break;
            case 3:
                double pagoSupervisor = sueldoSupervisores - (sueldoSupervisores * 0.11);
                System.out.println("El pago al supervisor debe ser de: " + pagoSupervisor);
                break;
            default:
                System.out.println("La categoria no existe");
        }


    }

    public static void ternario(){
        Scanner sc = new Scanner (System.in);
        double promedio;
        String condicionFinal;

        System.out.println("Ingrese el promedio: ");
        promedio = sc.nextInt();

        condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";
        System.out.println("La condicion final del alumno es: " + condicionFinal);

    }


    public static void main(String[] args) {

    intercambiarNumeros(5,8);
    calcularSueldo();
    ternario();




    }
}