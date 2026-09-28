//codigo de maid

public class Main {

    public static void main(String[] args) {

        gestorDelTallerDeBicicletas gestor =
                new gestorDelTallerDeBicicletas();

        // Bicicletas eléctrica n1

        BicicletasElectricas bicE01 = new BicicletasElectricas(
                "BIC-E01", "2023", "22.5 kg", 60,
                false, true, "GAR-001"
        );
        // Bicicletas eléctrica n2

        BicicletasElectricas bicE02 = new BicicletasElectricas(
                "BIC-E02", "2022", "24.0 kg",
                45, true, false,
                "GAR-002"
        );

        // Bicicletas de montaña n1

        BicicletasMontaña bicM01 = new BicicletasMontaña(
                "BIC-M01", "2021",
                "13.5 kg", 2
        );

        // Bicicletas de montaña n2

        BicicletasMontaña bicM02 = new BicicletasMontaña(
                "BIC-M02", "2020",
                "12.0 kg", 1
        );

        // Registros

        gestor.registrarBicicleta(bicE01);
        System.out.println("BIC-E01 (BicicletaElectrica) registrada correctamente.");

        gestor.registrarBicicleta(bicE02);
        System.out.println("BIC-E02 (BicicletaElectrica) registrada correctamente.");

        gestor.registrarBicicleta(bicM01);
        System.out.println("BIC-M01 (BicicletaMontaña) registrada correctamente.");

        gestor.registrarBicicleta(bicM02);
        System.out.println("BIC-M02 (BicicletaMontaña) registrada correctamente.");

        System.out.println();
        System.out.println("=== BUSQUEDA POR CODIGO: \"BIC-E01\" ===");

        System.out.println(
                "Tipo: Bicicleta Eléctrica | " +
                        "Código: " + bicE01.getCodigoDeBicicleta() +
                        " | Año: " + bicE01.getAñoDeFabricación() +
                        " | Peso: " + bicE01.getPeso() +
                        " | Autonomía: " + bicE01.getAutonomiaKilometros() + " km" +
                        " | Batería certificada: " +
                        (bicE01.isBateriaCertificada() ? "Sí" : "No") +
                        " | Garantía extendida: " +
                        (bicE01.ConGarantiaExtendida() ? "Sí" : "No") +
                        " | Costo mantención: $" +
                        bicE01.calcularCostoMantencion()
        );

        //son solo espacios para conseguir formato parecido a requerimiento en la terminal

        System.out.println();
        System.out.println();

        //listado y detalle de las bicicletas registradas

        System.out.println("=== LISTADO DE BICICLETAS ===");

        System.out.println("Código: " + bicE01.getCodigoDeBicicleta()
                + " | Año: " + bicE01.getAñoDeFabricación());

        System.out.println("Código: " + bicE02.getCodigoDeBicicleta()
                + " | Año: " + bicE02.getAñoDeFabricación());

        System.out.println("Código: " + bicM01.getCodigoDeBicicleta()
                + " | Año: " + bicM01.getAñoDeFabricación());

        System.out.println("Código: " + bicM02.getCodigoDeBicicleta()
                + " | Año: " + bicM02.getAñoDeFabricación());
    }

}