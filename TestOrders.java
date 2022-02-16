import java.util.ArrayList;
public class TestOrders {

    public static void main( String args[] ){
        Articulo articulo1 = new Articulo();
        articulo1.nombre = "moka";
        articulo1.precio = 5.5;

        Articulo articulo2 = new Articulo();
        articulo2.nombre="latte";
        articulo2.precio=5;

        Articulo articulo3 = new Articulo();
        articulo3.nombre= "cafe de goteo";
        articulo3.precio= 3.5;

        Articulo articulo4 = new Articulo();
        articulo4.nombre="capuchino";
        articulo4.precio=6.5;

        Pedido orden1 = new Pedido();
        orden1.nombre="Cinduri";

        Pedido orden2 = new Pedido();
        orden2.nombre="Jimmy";

        Pedido orden3 = new Pedido();
        orden3.nombre="Noah";

        Pedido orden4 = new Pedido();
        orden4.nombre="Sam";

        System.out.println(orden1);
        System.out.println(orden1.total);

        orden2.items.add(articulo1);
        orden2.total += articulo1.precio;

        orden3.items.add(articulo4);
        orden3.total += articulo4.precio;

        orden4.items.add(articulo2);
        orden4.total += articulo2.precio;

        orden1.listo=true;

        orden4.items.add(articulo2);
        orden4.items.add(articulo2);
        orden4.total += articulo2.precio*2;

        orden2.listo=true;

        // observando:

        
        System.out.printf("Nombre: %s\n", orden4.nombre);
        System.out.printf("Total: %s\n", orden4.total);
        System.out.printf("Estado: %s\n", orden4.listo);
        System.out.printf("Pedidos: %s\n", orden4.items);









    }
    
}
