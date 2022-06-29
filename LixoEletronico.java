package coletadelixo;

public class LixoEletronico extends ReciclaveisPerigosos{
    public int tipo;
    protected double quantidadeEletronicos;
    protected double dataColetaEletronicos;
    protected char condicaoReciclagem;
    protected char destinoEletronicos;

    public LixoEletronico(int tipo, double quantidadeEletronicos, double dataColetaEletronicos, char condicaoReciclagem, char destinoEletronicos, double quantidade, double dataColeta, char destino, String local, int data, String veiculoTipo, String veiculoPlaca, double veiculoCapacidade, double quantidadeColetada, double soma) {
        super(quantidade, dataColeta, destino, local, data, veiculoTipo, veiculoPlaca, veiculoCapacidade, quantidadeColetada, soma);
        this.tipo = tipo;
        this.quantidadeEletronicos = quantidadeEletronicos;
        this.dataColetaEletronicos = dataColetaEletronicos;
        this.condicaoReciclagem = condicaoReciclagem;
        this.destinoEletronicos = destinoEletronicos;
    }
    
    public void quantidadeTotal(){
        
    }
    
    public void incineracao(){
        
    }
    
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

    public double getQuantidadeEletronicos() {
        return quantidadeEletronicos;
    }

    public void setQuantidadeEletronicos(double quantidadeEletronicos) {
        this.quantidadeEletronicos = quantidadeEletronicos;
    }

    public double getDataColetaEletronicos() {
        return dataColetaEletronicos;
    }

    public void setDataColetaEletronicos(double dataColetaEletronicos) {
        this.dataColetaEletronicos = dataColetaEletronicos;
    }

    public char getCondicaoReciclagem() {
        return condicaoReciclagem;
    }

    public void setCondicaoReciclagem(char condicaoReciclagem) {
        this.condicaoReciclagem = condicaoReciclagem;
    }

    public char getDestinoEletronicos() {
        return destinoEletronicos;
    }

    public void setDestinoEletronicos(char destinoEletronicos) {
        this.destinoEletronicos = destinoEletronicos;
    }
    
    
}
