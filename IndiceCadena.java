public class IndiceCadena {
    public static void main(String[] args) {
        // Manejo de Idice de Cadena 
        var cadena1 = "Hola mundo";

        // Recuperar  el mprimer caracter 
        var PrimeraCaracter = cadena1.charAt(0); // Recuerar el caracter H
        System.out.println("Mi primer Caracter = " + PrimeraCaracter);
        // Recuperar  el ultimo acarcter (en la posicion 9)
        var UltimoCaracter = cadena1.charAt(9);
        System.out.println("Ultimo Caracter = " + UltimoCaracter);
        // imprimer la cadena (6)
        var SextaCadena = cadena1.charAt(5);
        System.out.println("Sexta Caracter = " + SextaCadena);

    }
}