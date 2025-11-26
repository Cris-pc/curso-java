public class Variables_Ejemplo {
    public static void main(String[] args) {
        // variables
        int edad=31;
        double precio = 300.40;
        boolean disponible = true;
        char genero;
        genero= 'f'; /*f --> femenino , m --> masculino*/

        /*acceder a variables*/

        System.out.println(edad);
        System.out.println(precio);
        System.out.println(disponible);
        System.out.println(genero);
        /*sobreescribimos la variable edad y toma un nuevo valor*/
        edad = 35;
        System.out.println(edad);

    }
}
