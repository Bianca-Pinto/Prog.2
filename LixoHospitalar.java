package coletadelixo;

public class LixoHospitalar extends NaoReciclaveisPerigosos {
    public int tipo;
    protected double quantidadeHosp;
    protected double dataColetaHosp;
    protected char destinoHosp;

    public LixoHospitalar(int tipo, double quantidadeHosp, double dataColetaHosp, char destinoHosp, double quantidadeTotal, double dataColeta, char destino, String local, int data, String veiculoTipo, String veiculoPlaca, double veiculoCapacidade, double quantidadeColetada, double soma) {
        super(quantidadeTotal, dataColeta, destino, local, data, veiculoTipo, veiculoPlaca, veiculoCapacidade, quantidadeColetada, soma);
        this.tipo = tipo;
        this.quantidadeHosp = quantidadeHosp;
        this.dataColetaHosp = dataColetaHosp;
        this.destinoHosp = destinoHosp;
    }
    
    public double quantidadeTotal(){
        return 0;
    }
    
    @Override
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

    public double getQuantidadeHosp() {
        return quantidadeHosp;
    }

    public void setQuantidadeHosp(double quantidadeHosp) {
        this.quantidadeHosp = quantidadeHosp;
    }

    public double getDataColetaHosp() {
        return dataColetaHosp;
    }

    public void setDataColetaHosp(double dataColetaHosp) {
        this.dataColetaHosp = dataColetaHosp;
    }

    public char getDestinoHosp() {
        return destinoHosp;
    }

    public void setDestinoHosp(char destinoHosp) {
        this.destinoHosp = destinoHosp;
    }
    
    
}
