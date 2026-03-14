import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private final List<Item> items;

    public CarritoDeCompras() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public void removerItem(Item item) {
        items.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrecio();
        }
        return total;
    }

    public void imprimirDetalle() {
        System.out.println("Detalles del carrito de compras:");
        for (Item item : items) {
            System.out.println(item.getNombre() + " - $" + item.getPrecio());
        }
        System.out.println("Total: €" + calcularTotal());
    }
}
