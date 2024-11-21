import java.util.Scanner;

public class App {

    //Elementos necesariospara todas las acciones.
    static Scanner scanner = new Scanner (System.in);
    static String[] planetas = {"Marte", "Jupiter", "Saturno"};
    static double[] distancias = {78.0, 628.0, 1256.0}; 

    static String[] naves = {};
    static double[] velocidades = {};

    public static void main(String[] args) throws Exception {
        
        int option;
        do {
            
            mostrarMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    seleccionarDestino();
                    break;
                case 2:
                    seleccionarNave();
                    break;
                case 3:

                    break;
            
                default:
                    break;
            }

        } while (option != 4);

    }

    public static void mostrarMenu(){

        System.out.println("\n ---Menú Principal---");
        System.out.println("1. Seleccionar un planeta de destino");
        System.out.println("2. Seleccionar una nave espacial.");
        System.out.println("3. Iniciar el vuelo.");
        System.out.println("4. Salir.");

    }

    public static void seleccionarNave(){

    }

    public static void seleccionarDestino(){

    }

    public static void calcularRecursos(){

    }


    //Métodos auxiliares
    public static void imprimirPlanetas(){
        
    }

    public static void infoNaves(){
        
    }

}