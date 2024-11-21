import java.util.Scanner;

public class App {

    //Elementos necesariospara todas las acciones.
    static Scanner scanner = new Scanner (System.in);
    static String[] planetas = {"Marte", "Jupiter", "Saturno"};
    static double[] distancias = {78.0, 628.0, 1256.0}; 

    static String[] naves = {"Pelican", "Atlantic", "Halcón Milenario"};
    static double[] velocidades = {};

    public static void main(String[] args) throws Exception {
        
        int option;
        mostrarMenu();
        do {
            
         
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

    public static void seleccionarDestino(){

        System.out.println("\n ---Menú Planetas---");
        System.out.println("1. Marte.");
        System.out.println("2. Jupiter.");
        System.out.println("3. Saturno.");
        System.out.println("4. Volver al menú principal.");

        System.out.println("Seleccione el planeta al que desea ir.");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.printf("El planeta seleccionado es " + planetas[0] + " y la distancia a la que se encuentra es: " + distancias[0]);
                break;
            case 2:
                System.out.println("El planeta seleccionado es " + planetas[1] + " y la distancia a la que se encuentra es: " + distancias[1]);
                break;
            case 3:
                System.out.println("El planeta seleccionado es " + planetas[2] + " y la distancia a la que se encuentra es: " + distancias[2]);
                break;

            default: ;
                break;
        }

    }

    public static void seleccionarNave(){

        System.out.println("\n ---Menú Naves---");
        System.out.println("1. Pelican.");
        System.out.println("2. Atlantic.");
        System.out.println("3. Halcón Milenario.");
        System.out.println("4. Volver al menú principal.");

        System.out.println("Seleccione la nave");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.printf("La nave seleccionada es " + naves[0]);
                break;
            case 2:
                System.out.println("La nave seleccionada es " + naves[1]);
                break;
            case 3:
                System.out.println("La nave seleccionada es " + naves[2]);
                break;
            default:
                break;
        }

    }


    public static void calcularRecursos(){

    }


    //Métodos auxiliares
    public static void imprimirPlanetas(){
        
    }

    public static void infoNaves(){

    }

}