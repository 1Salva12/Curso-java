public class Cadenas { 
    public static void main(String[] args) {
        System.out.println("***Manejo de Cadenas en Java***");

        var Cadena1 = "Hola";
        System.out.println("Cadena1" + Cadena1);
        var Cadena2 = new  String("Hola mundo");
        System.out.println("Cadena2" + Cadena2);
        var Cadena3 = Cadena1 + " " + Cadena2; 
        System.out.println("Cadena3 " + Cadena3);

        // Cadena Multiples Lienas (Tex black)

        var cadena4 = """

        ESTE ES UN  TEXTO
        MULTILINEA
        mas 
        lineas 

                
                """;
                System.out.println("Cadena4 " + cadena4);


    }
}