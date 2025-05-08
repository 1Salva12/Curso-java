public class ManejosudCadena { 
    public static void main(String[] args){
         // Temas sub cadenas 

         var cadena1 ="Hola mundo";
         System.out.println("cadena1 = " + cadena1);

         // sud cadena
         var subcadena1 = cadena1.substring(0, 4);
         System.out.println("Sudcadena1" + subcadena1);

         // var sub cadena cadena1,substring
         var subcadena2 = cadena1.substring(5, 10);
         System.out.println("subcadena2 = " + subcadena2);
    }
}