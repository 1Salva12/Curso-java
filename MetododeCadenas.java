public class MetododeCadenas {
    public static void main(String[] args){
        // Metodo de cadena 
        var cadena1 ="Hola Mundo";

        //Obtener el largo de una cadena 
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        // Remplazar caracteres 
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("Nueva Cadena = " + nuevaCadena);

        // convertir a mayusculas 
        var mayusculas = cadena1.toUpperCase();
        System.out.println("Mayusculas = " + mayusculas);

        // convertir a minisculas 
        System.out.println("Miniscula  = " + cadena1.toLowerCase());

        // Eliminar espacios 
        var cadena2 = "Los reyes   ";
        System.out.println("Cadena2 = " + cadena2);
        System.out.println("Cadena2 = " + cadena2.trim());

    }
}