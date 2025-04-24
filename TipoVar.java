public class TipoVar {
    public static void main(String[] args) {

        System.out.println("***Uso de var en Java***");

        // Sin el uso de var 
        String nombre1 = "Salva" ;
        System.out.println("Nombre1-- " + nombre1);
        //con var 
        var nombre2 = "Chava" ;
        System.out.println("Nombre2--" + nombre2);
        
        //Definir otras variables usando 

        var edad = 20; // Se ingresa un tipo de valor de int 
        System.out.println("edad =" + edad);
        var sueldo = 205.00; // se infiere un tipo float 
        var esCasado = false ; // se infiere un tipo boolean
        esCasado = true;
        // Es casado = "No" podemos asignar un tipo de destino 

        // se debe definir cu valor 
        // var precio; esto lanza un erro, que tenemos asignr un valor 
        // precio = 10;

        //se debe poder inferir el tipo de dato 

        // var apellido = null: no se puede inferir el tipo de datos 




    }
}