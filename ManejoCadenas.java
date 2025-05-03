public class ManejoCadenas {
    public static void main(String[] args){
        // Temas de Cadena 
        var cadena1 = "Hola Mundo";
        System.out.println("Cadena1 = " + cadena1);
        
        // Sudcadena 
        var  subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);

        var  subcadena2 = cadena1.substring(5);
        System.out.println("subcadena2 = " + subcadena2);
        

    }
}