public class ReglaNombreVariableSecc3 {
    public static void main(String[] args) {
        /*debe comenzar con una letra simbolo o guion*/
        /*no puede contener espacio ni caracteres especiales*/
        /*no puede ser una palabra reservada*/
        /*se distingue entre mayuscula y minuscula*/
        /*no usar caracteres especiales tildes ñ no puede utilizar*/
        String nombreCompleto ="CRISTHIAN FLORES"; /*CORRECTO*/
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Ivan FLORES"; /*no aplica buenas practicas todo minuscula ó camel case*/
        System.out.println("NombreCompleto = " + NombreCompleto);
        /* String nombre-completo = "Juan"; mala practica el guion medio no va*/
        String nombre_cliente ="Eduardo Flores"; /*aunq no genere error no esta siendo uso de las buenas practcas las variables no se separan con _ se aplica camel case*/
        System.out.println("nombre_cliente = " + nombre_cliente);
        String _apelido ="flores"; /*guion bajo es buena practiva*/
        System.out.println("_apelido = " + _apelido);
        String $apellido= "hurtado"; /*iniciar con dolar es buena practica*/
        System.out.println("$apellido = " + $apellido);





    }
}
