package escuelita;

class Producto implements Comparable<Producto> {
    String nombre;
    int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto otro) {
        return Integer.compare(this.precio, otro.precio);
    }

    @Override
    public String toString() {
        return nombre;
    }
}

public class EjEscuelita {

    public static void main(String[] args) {
        menu();
        
        Producto[][] productos = {
            {new Producto("Coca-Cola", 18), new Producto("Shampoo Sedal", 19)},
            {new Producto("Coca-Cola Zero", 20), new Producto("Frutillas", 64)}
        };

        encontrarExtremos(productos);
    }

    private static void encontrarExtremos(Producto[][] productos) {
        Producto productoMasBarato = productos[0][0];
        Producto productoMasCaro = productos[0][0];

        for (Producto[] fila : productos) {
            for (Producto producto : fila) {
                if (producto.compareTo(productoMasBarato) < 0) {
                    productoMasBarato = producto;
                }
                if (producto.compareTo(productoMasCaro) > 0) {
                    productoMasCaro = producto;
                }
            }
        }

        System.out.println("Producto más caro: " + productoMasCaro);
        System.out.println("Producto más barato: " + productoMasBarato);
    }
    
     private static void menu() {
        System.out.println("Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20");
        System.out.println("Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18");
        System.out.println("Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19");
        System.out.println("Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo");
        System.out.println("===========================================================");
    }    
}
