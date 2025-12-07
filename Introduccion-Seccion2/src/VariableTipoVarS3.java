public class VariableTipoVarS3 {

    public static void main(String[] args) {
        /*este tipo de variable no trabaja con tipado almacena cualquier tipo siempre y cuando se le agregue la palabra reservada var*/
        /*solo sirve para variables locales, es decir que se definen dentro de un metodo*/
        /*y debe darse valor en la misma clase*/
        /*no pueden tener tipo null*/
        /*si es que le asignas cadena siempre va ser cadena no puede ser otro tipo de dato*/
        var nombre = "Cristhian";
        System.out.println("nombre = " + nombre);
        var edad = 35;
        System.out.println("edad = " + edad);
        var esCasado = true;
        System.out.println("esCasado = " + esCasado);

        /*si se asigna como tipo boleean esa variable debe permanecer como boleean esto en todas las variables es decir si declaramos una variable var como entero si se utiliza posterior esta debe ser entero*/



    }
}
