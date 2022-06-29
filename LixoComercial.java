package coletadelixo;

public class LixoComercial extends ReciclaveisNaoPerigosos{
    public int tipo;
    protected double quantidadeComercial;
    public char destinoComercial;

    public LixoComercial(int tipo, double quantidadeComercial, char destinoComercial, double quantidade, double dataColeta, char destino, String local, int data, String veiculoTipo, String veiculoPlaca, double veiculoCapacidade, double quantidadeColetada, double soma) {
        super(quantidade, dataColeta, destino, local, data, veiculoTipo, veiculoPlaca, veiculoCapacidade, quantidadeColetada, soma);
        this.tipo = tipo;
        this.quantidadeComercial = quantidadeComercial;
        this.destinoComercial = destinoComercial;
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

    public double getQuantidadeComercial() {
        return quantidadeComercial;
    }

    public void setQuantidadeComercial(double quantidadeComercial) {
        this.quantidadeComercial = quantidadeComercial;
    }

    public char getDestinoComercial() {
        return destinoComercial;
    }

    public void setDestinoComercial(char destinoComercial) {
        this.destinoComercial = destinoComercial;
    }
    
    
}
