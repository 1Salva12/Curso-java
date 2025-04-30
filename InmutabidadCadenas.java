public class InmutabidadCadenas {
    public static void main(String [] args){

        //Inmutacion de Cadenas 
        var Cadena1 = "Hola" ;
        System.out.println("Cadena1" + Cadena1);
        var cadena2 = Cadena1;
        Cadena1 = "adios";
        System.out.print("Cadena 1 modificado =" + Cadena1);
        System.out.println("Cadena 2 = " + cadena2); 
    }
}