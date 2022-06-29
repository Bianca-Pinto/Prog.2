package coletadelixo;

public class ReciclaveisPerigosos extends Coleta {
    public double quantidade;
    public double dataColeta;
    public char destino;

    public ReciclaveisPerigosos(double quantidade, double dataColeta, char destino, String local, int data, String veiculoTipo, String veiculoPlaca, double veiculoCapacidade, double quantidadeColetada, double soma) {
        super(local, data, veiculoTipo, veiculoPlaca, veiculoCapacidade, quantidadeColetada, soma);
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;
        this.destino = destino;
    }
    
    public void informarDados(){
        
    }
    
    public void incineração(){
        
    }
    
    public void reciclagem(){
        
    }
    
    public double somaAcumulada(){
        return 0;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
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
