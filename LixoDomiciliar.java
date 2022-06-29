package coletadelixo;

public class LixoDomiciliar extends ReciclaveisNaoPerigosos {
    public int tipo;
    protected double quantidadeDomiciliar;
    public char destinoDomiciliar;

    public LixoDomiciliar(int tipo, double quantidadeDomiciliar, char destinoDomiciliar, double quantidade, double dataColeta, char destino, String local, int data, String veiculoTipo, String veiculoPlaca, double veiculoCapacidade, double quantidadeColetada, double soma) {
        super(quantidade, dataColeta, destino, local, data, veiculoTipo, veiculoPlaca, veiculoCapacidade, quantidadeColetada, soma);
        this.tipo = tipo;
        this.quantidadeDomiciliar = quantidadeDomiciliar;
        this.destinoDomiciliar = destinoDomiciliar;
    }
    
    @Override
    public void quantidadeTotal(){
        
    }
    
    @Override
    public void reciclagem(){
        
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

    public double getQuantidadeDomiciliar() {
        return quantidadeDomiciliar;
    }

    public void setQuantidadeDomiciliar(double quantidadeDomiciliar) {
        this.quantidadeDomiciliar = quantidadeDomiciliar;
    }

    public char getDestinoDomiciliar() {
        return destinoDomiciliar;
    }

    public void setDestinoDomiciliar(char destinoDomiciliar) {
        this.destinoDomiciliar = destinoDomiciliar;
    }
    
    
}
