public class ReservaHoteles { 
    public static void main(String[] args) {

        // Detalles de variable 
        var nombreClientes = "Salva Matias" ;
        var diaEstancia = 7;
        var TarifaDiaria = 1300.00;
        var TienesvistaMar = true ;

        // Mostrar el detalle de a reserva 
        System.out.println("NombreClientes" + nombreClientes);
        System.out.println("Dia de Estancia" + diaEstancia);
        System.out.println("Tarifa diaraia " + TarifaDiaria);
        System.out.println("Tiene vista al mar " + TienesvistaMar);

        // Modificar valores 
        diaEstancia = 5;
        TarifaDiaria = 900.00;
        TienesvistaMar = false;

        // Mostrar el detalle de a reserva 
        System.out.println("Nuevos datos de la reservacion");
        System.out.println("NombreClientes" + nombreClientes);
        System.out.println("Dia de Estancia" + diaEstancia);
        System.out.println("Tarifa diaraia " + TarifaDiaria);
        System.out.println("Tiene vista al mar " + TienesvistaMar);

    }
}