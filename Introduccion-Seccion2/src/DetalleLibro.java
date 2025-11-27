public class DetalleLibro {

    public static void main(String[] args) {
        String tituloLibro = "El señor de los anillos"; /*las variables String no crean  direccion de memoria crean objeto*/
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.00;

        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);

        tituloLibro = "El señor de los anillos2"; /*acotando a la explicacion de arriba no es que se sobre escribe el valor nuevo de la variable, se crea un espacion en memoria con el nuevo valor */
        System.out.println(tituloLibro);

    }
}
