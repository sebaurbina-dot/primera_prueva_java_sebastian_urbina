//Herencia de bicileta y implementacion de interfaz

public class BicicletasMontaña extends Bicicleta implements ConGarantiaExtendida{

    // atributos BicicletasMontaña

    private int cantidadDeSuspencion;

    public BicicletasMontaña(String codigoDeBicicleta, String añoDeFabricación, String peso, int cantidadDeSuspencion) {
        super(codigoDeBicicleta, añoDeFabricación, peso);
        this.cantidadDeSuspencion = cantidadDeSuspencion;
    }

    public int getCantidadDeSuspencion() {
        return cantidadDeSuspencion;
    }

    public void setCantidadDeSuspencion(int cantidadDeSuspencion) {
        this.cantidadDeSuspencion = cantidadDeSuspencion;
    }

    // calculo de costo de mantencion

    @Override
    public boolean ConGarantiaExtendida() {
        return false;
    }

    @Override
    public void activarGarantiaExtendida() {

    }

    @Override
    public double calcularCostoMantencion(){
        double costoMantencion = 30000;
        if (cantidadDeSuspencion > 1) {
            costoMantencion = costoMantencion *= 1.15; // 15% mas por cada suspencion
        }

        return costoMantencion;
    }

    @Override
    public int obtenerMesesGarantiaExtendida() {
        return 0;
    }


}
