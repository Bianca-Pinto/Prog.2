package coletadelixo;

public class LixoRadioativo extends NaoReciclaveisPerigosos{
    public int tipo;
    protected double quantidadeRad;
    protected double dataColetaRad;
    protected char destinoRad;

    public LixoRadioativo(int tipo, double quantidadeRad, double dataColetaRad, char destinoRad, double quantidadeTotal, double dataColeta, char destino, String local, int data, String veiculoTipo, String veiculoPlaca, double veiculoCapacidade, double quantidadeColetada, double soma) {
        super(quantidadeTotal, dataColeta, destino, local, data, veiculoTipo, veiculoPlaca, veiculoCapacidade, quantidadeColetada, soma);
        this.tipo = tipo;
        this.quantidadeRad = quantidadeRad;
        this.dataColetaRad = dataColetaRad;
        this.destinoRad = destinoRad;
    }
    
    public double quantidadeTotal(){
        return 0;
    }
    
    @Override
    public void tratamento(){
        
    }
    
    @Override
    public double somaAcumulada(){
        return 0;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getQuantidadeRad() {
        return quantidadeRad;
    }

    public void setQuantidadeRad(double quantidadeRad) {
        this.quantidadeRad = quantidadeRad;
    }

    public double getDataColetaRad() {
        return dataColetaRad;
    }

    public void setDataColetaRad(double dataColetaRad) {
        this.dataColetaRad = dataColetaRad;
    }

    public char getDestinoRad() {
        return destinoRad;
    }

    public void setDestinoRad(char destinoRad) {
        this.destinoRad = destinoRad;
    }
    
    
}
