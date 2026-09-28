import java.util.ArrayList;

public class gestorDelTallerDeBicicletas {

    private ArrayList<Bicicleta> bicicleta;

    public gestorDelTallerDeBicicletas() {
        bicicleta = new ArrayList<>();
    }

    public void registrarBicicleta(Bicicleta bicicleta) {
        bicicleta.add(bicicleta);
    }

    public Bicicleta buscarPorCodigo(String codigo) {

        for (Bicicleta bici : bicicleta) {

            if (bici.getCodigoDeBicicleta().equals(codigo)) {
                return bici;
            }
        }

        return null;
    }

    public void listarBicicletas() {

        for (Bicicleta bici : bicicleta) {
            System.out.println(
                    "Código: " + bici.getCodigoDeBicicleta()
                            + " | Año: " + bici.getAñoDeFabricación()
            );
        }
    }
}