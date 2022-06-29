package coletadelixo;

public class Coleta {
    public String local;
    public int data;
    public String veiculoTipo;
    public String veiculoPlaca;
    public double veiculoCapacidade;
    public double quantidadeColetada;
    public double soma;

    public Coleta(String local, int data, String veiculoTipo, String veiculoPlaca, double veiculoCapacidade, double quantidadeColetada, double soma) {
        this.local = local;
        this.data = data;
        this.veiculoTipo = veiculoTipo;
        this.veiculoPlaca = veiculoPlaca;
        this.veiculoCapacidade = veiculoCapacidade;
        this.quantidadeColetada = quantidadeColetada;
        this.soma = soma;
    }
    
    public void cadastrarColeta(){
        
    }
    
    public void cadastrarVeiculo(){
        
    }
    
    public void dadosColeta(){
        
    }
    
    public void removerVeiculo(){
        
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getVeiculoTipo() {
        return veiculoTipo;
    }

    public void setVeiculoTipo(String veiculoTipo) {
        this.veiculoTipo = veiculoTipo;
    }

    public String getVeiculoPlaca() {
        return veiculoPlaca;
    }

    public void setVeiculoPlaca(String veiculoPlaca) {
        this.veiculoPlaca = veiculoPlaca;
    }

    public double getVeiculoCapacidade() {
        return veiculoCapacidade;
    }

    public void setVeiculoCapacidade(double veiculoCapacidade) {
        this.veiculoCapacidade = veiculoCapacidade;
    }

    public double getQuantidadeColetada() {
        return quantidadeColetada;
    }

    public void setQuantidadeColetada(double quantidadeColetada) {
        this.quantidadeColetada = quantidadeColetada;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }
       
}
