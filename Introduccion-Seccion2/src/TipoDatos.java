public class TipoDatos {
    public static void main(String[] args) {
        /*tipo de datos eNTERO*/
        byte tipoByte = 127; /*acepta hasta 127 pasado de eso se reconoce como entero*/
        /*existe una forma de transforma  byte tipoByte = (byte)128; es una perdida de presicion de datos */
        /*atajo para imprimir el valor soutv*/
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort=32000; /* igual tiene limites*/
        System.out.println("tipoShort = " + tipoShort);
        int tipoEntero = 22231230;  /*almacena hasta 32 bits es un valor mas grande*/
        System.out.println("tipoEntero = " + tipoEntero);
        long tipoLong = 2109993833333L; /*almacena hasta 64 bit, lo recomendable es poner un L al final*/
        System.out.println("tipoLong = " + tipoLong);


        /*PUNTO FLOTANTE*/
        float tipoFloat = 3.14F; /*ubicar una F para indicar que es float soporta hasta 32 bit*/
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.122331; /*soporta hasta 64 bit*/
        System.out.println("tipoDouble = " + tipoDouble);



    }
}
