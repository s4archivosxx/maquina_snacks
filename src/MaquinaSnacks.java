import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        var salir = false;

        // Para leer datos de la consola
        var consola = new Scanner(System.in);

        // Creamos la lista de productos tipo snack
        List<Snack> productos = new ArrayList<>();

        System.out.println("*** Maquina de Snacks ***");
        SnackManager.mostrarSnacks(); // Mostrar el inventario
        while (!salir){
            try {
                var opcion = mostrarMenu(consola);
                // salir = ejecutarOpciones(opcion, consola, productos);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            finally {
                System.out.println(); // Imprime un salto de linea con cada interaccion
            }
        }
    }

    private static int mostrarMenu(Scanner consola){
        // La triple comilla es para agregar un bloque de texto
        System.out.print("""
                Menu: 
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar nuevo snack
                4. Salir
                Elige una opcion: \s""");

        // Leemos y retornamos la opcion seleccionada por el usuario
        return Integer.parseInt(consola.nextLine());
    }

    private static void ejecutarOpciones(){

    }

    private static void comprarSnacks(){

    }

    private static void mostrarTicket(){

    }

    private  static void agregarSnack(){

    }
}
