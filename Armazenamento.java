package coletadelixo;

public class Armazenamento {
    public double totalCapacidade;
    public double totalOcupado;
    public char localArmazenado;
    public double localCapacidade;
    public double localOcupado;
    
    public Armazenamento(double totalCapacidade, double totalOcupado, char localArmazenado, double localCapacidade, double localOcupado){
        this.totalCapacidade = totalCapacidade;
        this.totalOcupado = totalOcupado;
        this.localArmazenado = localArmazenado;
        this.localCapacidade = localCapacidade;
        this.localOcupado = localOcupado;
    }
    
    public void capacidadeArmazenamento(){
        
    }
    
    public void capacidadeLocal(){
        
    }
    
    public void armazenarLixo(){
        
    }
    
    public void tratarLixo(){
        
    }
    
    public double getTotalCapacidade(){
        return this.totalCapacidade;
    }
    
    public double getTotalOcupado(){
        return this.totalOcupado;
    }
    
    public char getLocalArmazenado(){
        return this.localArmazenado;
    }
    
    public double getLocalCapacidade(){
        return this.localCapacidade;
    }
    
    public double getLocalOcupado(){
        return this.localOcupado;
    }
    
    public void setTotalCapacidade(double totalCapacidade){
        this.totalCapacidade = totalCapacidade;
    }
    
    public void setTotalOcupado(double totalOcupado){
        this.totalOcupado = totalOcupado;
    }
    
    public void setLocalArmazenado(char localArmazenado){
        this.localArmazenado = localArmazenado;
    }
    
    public void serLocalCapacidade(double localCapacidade){
        this.localCapacidade = localCapacidade;
    }
    
    public void setLocalOcupado(double localOcupado){
        this.localOcupado = localOcupado;
    }
}
