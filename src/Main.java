import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();

        int opcion;
        do {
            System.out.println("1. Añadir tarea");
            System.out.println("2. Listar tareas");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la descripción:");
                    String desc = sc.nextLine();
                    gestor.añadirTarea(desc);
                    break;

            }
        } while (opcion != 0);
    }
}