import java.util.Scanner;

// Hola yojan, pongase a trabajar en el proyecto.
//no joda brayan.

public class App {

    //Elementos necesariospara todas las acciones.
    static Scanner scanner = new Scanner (System.in);
    static String[] planetas = {"Marte", "Jupiter", "Saturno"};
    static double[] distancias = {225.0, 628.7, 1275.0}; 

    static String[] naves = {"Pelican", "Atlantic", "Halcón Milenario"};
    static double[] velocidades = {1000.0, 1200.0, 2000.0};
    static int[] capacidadTripulación = {14, 8, 20};

    static String[] eventos = {"Asteroides", "Fallas en el sistema", "desvios"};
    static String[] recursos = {};

    static boolean salir = false;
    public static void main(String[] args) throws Exception {
        
        selectionMenu();

    }

    // Metodo para seleccionar seleccionar una opción del menú.
    private static void selectionMenu() {
        int option = 0;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");

            // Validamos la entrada para evitar errores con entradas no numéricas
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine(); // Limpiamos el búfer
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); // Consumimos la entrada no válida
                continue;
            }

            switch (option) {
                case 1:
                    seleccionarDestino();
                    break;
                case 2:
                    seleccionarNave();
                    break;
                case 3:
                    iniciarVuelo();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

        } while (option != 4);
    }

    // Metodo que tiene el menú principal.
    public static void mostrarMenu(){

        System.out.println("\n ---Menú Principal---");
        System.out.println("1. Seleccionar un planeta de destino");
        System.out.println("2. Seleccionar una nave espacial.");
        System.out.println("3. Iniciar el vuelo.");
        System.out.println("4. Salir.");

    }

    // Metodo que contiene el menú de opciones de los destinos.
    public static void destinoMenu(){

        System.out.println("\n ---Menú Planetas---");
        System.out.println("1. " + planetas[0]);
        System.out.println("2. " + planetas[1]);
        System.out.println("3. " + planetas[2]);
        System.out.println("4. Volver al menú principal.");
        System.out.println("Seleccione el planeta al que desea ir: ");

    }
    
    // Metodo para seleccionar la opción de destino.
    public static void seleccionarDestino(){

        int option = 0;

        do {
            destinoMenu();
            if (scanner.hasNextInt()) {

                option = scanner.nextInt();
                scanner.nextLine(); // Limpiamos el búfer.

            } else {

                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); // Consumimos la entrada no valida.
                continue;
                
            }

            switch (option) {
                case 1:
                    System.out.printf("El planeta seleccionado es " + planetas[0] + " y la distancia a la que se encuentra es: " + distancias[0] + " kilometros");
                    System.out.println("\nPresione ENTER para volver al menú principal.");
                    scanner.nextLine(); // Espera a que el usuario presione ENTER.
                    return; // Volver al menú principal.
                case 2:
                    System.out.println("El planeta seleccionado es " + planetas[1] + " y la distancia a la que se encuentra es: " + distancias[1] + " kilometros");
                    System.out.println("\nPresione ENTER para volver al menú principal.");
                    scanner.nextLine(); // Espera a que el usuario presione ENTER.
                    return; // Volver al menú principal.
                case 3:
                    System.out.println("El planeta seleccionado es " + planetas[2] + " y la distancia a la que se encuentra es: " + distancias[2] + " kilometros");
                    System.out.println("\nPresione ENTER para volver al menú principal.");
                    scanner.nextLine(); // Espera a que el usuario presione ENTER.
                    return; // Volver al menú principal.
                case 4:
                    System.out.println("Volviendo al menú principal.");
                    System.out.println("\nPresione ENTER para volver al menú principal.");
                    scanner.nextLine(); // Espera a que el usuario presione ENTER.
                    return; // Volver al menú principal.
                default: System.out.println("Opción no valida, intente nuevamente.");
                    break;
            }

        } while (true);
        

    }

    // Metodo que contiene el menú de la selección de las naves.
    public static void naveMenu(){
        System.out.println("\n ---Menú Naves---");
        System.out.println("1. " + naves[0]);
        System.out.println("2. " + naves[1]);
        System.out.println("3. " + naves[2]);
        System.out.println("4. Volver al menú principal.");
        System.out.println("Seleccione la nave: ");
    }

    // Metodo que contiene la selección de la nave.
    public static void seleccionarNave(){
        
        int option = 0;
        do {
            naveMenu();
            if (scanner.hasNextInt()){
                option = scanner.nextInt();
                scanner.nextLine(); // Limpiamos el búfer.
            }else {
                System.out.println("Por favor ingrese un número válido.");
                scanner.nextLine(); // Consumimos la entrada que no es valida.
                continue;
            }
    
            switch (option) {
                case 1:
                    System.out.printf("La nave seleccionada es " + naves[0] + " cuenta con una velocidad maxima de " + velocidades[0] + " y puede llevar a " + capacidadTripulación[0] + " numero de personas");
                    System.out.println("Presione ENTER para volver al menú principal.");
                    scanner.nextLine(); // Espera a que el usuario presione ENTER.
                    return; // Volver al menú principal.
                case 2:
                    System.out.println("La nave seleccionada es " + naves[1] + " cuenta con una velocidad maxima de " + velocidades[1] + " y puede llevar a " + capacidadTripulación[1] + " numero de personas");
                    System.out.println("Presione ENTER para volver al menú principal.");
                    scanner.nextLine(); // Espera a que el usuario presione ENTER.
                    return; // Volver al menú principal.
                case 3:
                    System.out.println("La nave seleccionada es " + naves[2] + " cuenta con una velocidad maxima de " + velocidades[2] + " y puede llevar a " + capacidadTripulación[2] + " numero de personas");
                    System.out.println("Presione ENTER para volver al menú principal.");
                    scanner.nextLine(); // Espera a que el usuario presione ENTER.
                    return; // Volver al menú principal.
                case 4:
                    System.out.println("Volviendo al menú principal.");
                    return;
                default: System.out.println("Opción no valida.");
                    break;
            }
        } while (true);
        

    }

    public static void iniciarVuelo(){

    }

    public static void calcularRecursos(){

    }


    //Métodos auxiliares
    public static void imprimirPlanetas(){
        
    }

    public static void infoNaves(){

    }

}