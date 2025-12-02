public class RetoSeccion3 {
    public static void main(String[] args) {
        String nombreProducto ="Computadora";
        double $precio = 1500.00;
        int _cantidad =25;
        boolean estaDisponible = true;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("$precio = " + $precio);
        System.out.println("_cantidad = " + _cantidad);
        System.out.println("estaDisponible = " + estaDisponible);

        nombreProducto ="COMPUTADORA";
        System.out.println("nombreProducto modificado = " + nombreProducto);
        $precio =1700.00;
        System.out.println("$precio modificado = " + $precio);
        _cantidad = 15;
        System.out.println("_cantidad modificado = " + _cantidad);
        estaDisponible = false;
        System.out.println("estaDisponible modificado = " + estaDisponible);

    }
}
