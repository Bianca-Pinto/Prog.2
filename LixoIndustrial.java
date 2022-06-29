package coletadelixo;

public class LixoIndustrial extends ReciclaveisPerigosos {
    public int tipo;
    protected double quantidadeInd;
    protected double dataColetaInd;
    protected char destinoInd;

    public LixoIndustrial(int tipo, double quantidadeInd, double dataColetaInd, char destinoInd, double quantidade, double dataColeta, char destino, String local, int data, String veiculoTipo, String veiculoPlaca, double veiculoCapacidade, double quantidadeColetada, double soma) {
        super(quantidade, dataColeta, destino, local, data, veiculoTipo, veiculoPlaca, veiculoCapacidade, quantidadeColetada, soma);
        this.tipo = tipo;
        this.quantidadeInd = quantidadeInd;
        this.dataColetaInd = dataColetaInd;
        this.destinoInd = destinoInd;
    }
    
    public void quantidadeTotal(){
        
    }
    
    public void incineracao(){
        
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

    public double getQuantidadeInd() {
        return quantidadeInd;
    }

    public void setQuantidadeInd(double quantidadeInd) {
        this.quantidadeInd = quantidadeInd;
    }

    public double getDataColetaInd() {
        return dataColetaInd;
    }

    public void setDataColetaInd(double dataColetaInd) {
        this.dataColetaInd = dataColetaInd;
    }

    public char getDestinoInd() {
        return destinoInd;
    }

    public void setDestinoInd(char destinoInd) {
        this.destinoInd = destinoInd;
    }
    
    
}
