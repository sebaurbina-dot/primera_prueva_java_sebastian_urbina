// Herencia de bicileta y implementacion de interfaz

public class BicicletasElectricas extends Bicicleta implements ConGarantiaExtendida {

    // atributos BicicletasElectricas

    private int autonomiaKilometros;
    private boolean bateriaCertificada;
    private boolean GarantiaExtendida;
    private String contratoGarantia;

    // contructores de todos los atributos

    public BicicletasElectricas

            (String codigoDeBicicleta, String añoDeFabricación, String peso,
             int autonomiaKilometros, boolean bateriaCertificada,
             boolean garantíaExtendida, String contratoGarantia) {

        super(String.valueOf(codigoDeBicicleta), añoDeFabricación, peso);
        this.autonomiaKilometros = autonomiaKilometros;
        this.bateriaCertificada = bateriaCertificada;
        GarantiaExtendida = garantíaExtendida;
        this.contratoGarantia = contratoGarantia;
    }


    // geter and seter de todos los atributos

    public int getAutonomiaKilometros() {
        return autonomiaKilometros;
    }

    public void setAutonomiaKilometros(int autonomiaKilometros) {
        this.autonomiaKilometros = autonomiaKilometros;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean isGarantíaExtendida() {
        return GarantiaExtendida;
    }

    public void setGarantíaExtendida(boolean garantíaExtendida) {
        GarantiaExtendida = garantíaExtendida;
    }

    public String getContratoGarantia() {
        return contratoGarantia;
    }

    public void setContratoGarantia(String contratoGarantia) {
        this.contratoGarantia = contratoGarantia;
    }


    //implementando metodo de interfas "consultar garantia extendida"

    @Override
    public boolean ConGarantiaExtendida(){
        return GarantiaExtendida;
    }

    //implementando metodo de interfas "activar garantia extendida"

    @Override
    public  void activarGarantiaExtendida() {
        boolean activarGarantiaExtendida = true;
    }
//calculo costo de mantencion

    @Override
    public double calcularCostoMantencion() {

        double costoMantencion = 45000;

        if (!bateriaCertificada) {
            costoMantencion *= 1.25; //
        }

        return costoMantencion;
    }

    @Override
    public int obtenerMesesGarantiaExtendida() {
        return 6;

    }

    void main() {}

}



