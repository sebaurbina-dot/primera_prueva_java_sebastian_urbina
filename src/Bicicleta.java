public class Bicicleta {

    //atributos en comun
    private String  codigoDeBicicleta;
    private String añoDeFabricación;
    private String peso;

// contructor de todos los atributos en comun


    public Bicicleta(String codigoDeBicicleta, String añoDeFabricación, String peso) {
        this.codigoDeBicicleta = codigoDeBicicleta;
        this.añoDeFabricación = añoDeFabricación;
        this.peso = peso;
    }

    public double calcularCostoMantencion() {
        return 0;
    }
// geter and seter de todos los atributos en comun


    public String  getCodigoDeBicicleta() {
        return codigoDeBicicleta;
    }

    public void setCodigoDeBicicleta(String codigoDeBicicleta) {
        this.codigoDeBicicleta = codigoDeBicicleta;
    }

    public String getAñoDeFabricación() {
        return añoDeFabricación;
    }

    public void setAñoDeFabricación(String añoDeFabricación) {
        this.añoDeFabricación = añoDeFabricación;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

//toSting de codigo de bicicleta y año de fabricacion


    @Override
    public String toString() {
        return "Bicicleta{" +
                "codigoDeBicicleta=" + codigoDeBicicleta +
                ", añoDeFabricación='" + añoDeFabricación + '\'' +
                ", peso='" + peso + '\'' +
                '}';
    }

    public void add(Bicicleta bicicleta) {
    }
}