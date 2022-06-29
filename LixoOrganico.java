package coletadelixo;

public class LixoOrganico extends Coleta{
    public double quantidadeTotal;
    public double dataColeta;
    public char destino;

    public LixoOrganico(double quantidadeTotal, double dataColeta, char destino, String local, int data, String veiculoTipo, String veiculoPlaca, double veiculoCapacidade, double quantidadeColetada, double soma) {
        super(local, data, veiculoTipo, veiculoPlaca, veiculoCapacidade, quantidadeColetada, soma);
        this.quantidadeTotal = quantidadeTotal;
        this.dataColeta = dataColeta;
        this.destino = destino;
    }
    
    public void informarDados(){
        
    }
    
    public void compostagem(){
        
    }
    
    public double somaAcumulada(){
        return 0;
    }

    public double getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(double quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public double getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(double dataColeta) {
        this.dataColeta = dataColeta;
    }

    public char getDestino() {
        return destino;
    }

    public void setDestino(char destino) {
        this.destino = destino;
    }
    
    
}