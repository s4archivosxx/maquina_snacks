import java.util.ArrayList;
import java.util.List;

public class SnackManager {
    private static final List<Snack> snacks;

    // Bloque static inicializador
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 1.5));
        snacks.add(new Snack("Soda", 3.5));
        snacks.add(new Snack("Galleta Morocha", 4.9));
    }

    public static List<Snack> getSnacks() {
        return snacks;
    }

    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        var inventarioSnacks = "";
        for(var snack: snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);
    }
}
