public class ComparaciondCadenas {
    public static void main(String[] args) {
        // Comparacion de Cadenas (pool de cadenas)

        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String ("Java");
        
        // Comparacion de Cadenas 
        System.out.println("Cadena1 es igual en referencia a Cadena2:");
        System.out.println(cadena1 == cadena2);
        // Comparamos cadena1 con cadena3 (referencia)
        System.out.println("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        // Comparar contenido usaremos el metodo equals 
        System.out.println("Cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));
        

        

    }
}