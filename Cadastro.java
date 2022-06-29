package coletadelixo;

import java.util.Scanner;

public class Cadastro {
    private String usuario;
    private String usuarioChecar;
    private int senha;
    private int senhaChecar; // nova variavel
    private int senhaNova;
    private int senhaNova2; // nova variavel
    private int registro;
    public String tipoLixo;
    protected int opcao; // nova variavel, troca private -> protected
    protected boolean login = false; // nova variavel
    private boolean menu; // nova variavel
    private int confirmacao; // nova variavel
    private boolean sair; //nova variável
    
    public Cadastro(String usuario, int senha, int registro, String tipoLixo){
        this.usuario = usuario;
        this.senha = senha;
        this.registro = registro;
        this.tipoLixo = tipoLixo;
        
    }
    Scanner entrada = new Scanner(System.in);
    
    public void criarCadastro(){
            System.out.println("==== CADASTRO DE NOVO USUARIO ====");
            System.out.println("Digite o nome do usuario: ");
            usuario = entrada.next();
            System.out.println("Digite o registro do usuario: ");
            registro = entrada.nextInt();
            System.out.println("Digite uma senha: ");
            senha = entrada.nextInt();
            System.out.println("Cadastro completo!");
    }
    
    public void excluirCadastro(){
        menu = true;
        do{
            System.out.println("==== EXCLUSÃO DE USUARIO ====");
            System.out.println("Digite o nome do usuario: ");
            usuarioChecar = entrada.next();
            
            if(usuarioChecar.equals(this.usuario)){
                System.out.println("Bem-vindo " + this.usuario + "!");
                System.out.println("Digite sua senha: ");
                senhaChecar = entrada.nextInt();
                
                if(senhaChecar == this.senha){
                    System.out.println("Tem certeza que deseja excluir seu cadastro?");
                    confirmacao = entrada.nextInt();
                    
                    if(confirmacao == 1){
                        System.out.println("Usuario excluido!");
                        confirmacao = 0;
                    }
                    if(confirmacao == 0){
                        System.out.println("Retornando ao menu principal...");
                        menu = false;
                    }
                    else{
                        System.out.println("Opção inválida!");
                    }
                }
                else{
                    System.out.println("Senha incorreta!");
                    System.out.println("Retornando ao menu principal...");
                }
            }
            else{
                    System.out.println("Usuario não existe!");
                    System.out.println("Retornando ao menu principal...");
                    menu = false;
                }
            
        }while(menu != false);
    }
    
    public void alterarSenha(){
        menu = true;
        do{
            System.out.println("==== ALTERAR SENHA ====");
            System.out.println("Digite o nome do usuario: ");
            usuarioChecar = entrada.next();
            
            if(usuarioChecar.equals(this.usuario)){
                System.out.println("Bem-vindo " + this.usuario + "!");
                System.out.println("Digite sua senha: ");
                senhaChecar = entrada.nextInt();
                
                if(senhaChecar == this.senha){
                        System.out.println("Digite a senha nova: ");
                        senhaNova = entrada.nextInt();
                    
                        System.out.println("Digite novamente a senha: ");
                        senhaNova2 = entrada.nextInt();
                        
                        if(senhaNova2 == senhaNova){
                            this.senha = senhaNova;
                            System.out.println("Senha alterada!");
                            menu = false;
                        }
                        else{
                            System.out.println("Senha incorreta!");
                        }
                }
                else{
                    System.out.println("Senha incorreta!");
                }
            }
            else{
                System.out.println("Usuario não existe!");
                menu = false;
            }
        }while(menu != false);
    }
    
    public void logarSistema(){
        menu = true;
        do {
            System.out.println("Digite o nome do usuário: ");
            usuario = entrada.next();
        
            if(usuarioChecar.equals(this.usuario)){
                System.out.println("Bem-vindo " + this.usuario + "!");
                System.out.println("Digite sua senha: ");
                senhaChecar = entrada.nextInt();
                
                if(senhaChecar == this.senha){
                    System.out.println("Usuario logado com sucesso!");
                    login = true;
                    menu = false;
                }
                else{
                    System.out.println("Senha incorreta!");
                }
            }
        }while(menu != false);
    }
    
    public void sairSistema(){
        menu = true;
        do{
            if(login = true){
                System.out.println("Deseja sair do sistema?");
                System.out.println("Digite 1 para sim ou 0 para não");
                confirmacao = entrada.nextInt();
        
                if(confirmacao == 1){
                    System.out.println("Deslogando o usuario...");
                    login = false;
                    menu = false;
                }
                if(confirmacao == 0){
                    System.out.println("Retornando ao menu principal...");
                    menu = false;
                }
                else {
                    System.out.println("Opção incorreta!");
                } 
            }
            else{
                System.out.println("É preciso estar logado para realizar essa operação!");
                menu = false;
            }
        }while(menu != false);
    }
    
    private String getUsuario(){
        return this.usuario;
    }
    
    private int getSenha(){
        return this.senha;
    }
    
    private int getRegistro(){
        return this.registro;
    }
    
    public String getTipoLixo(){
        return this.tipoLixo;
    }
    
    private void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    private void setSenha(int senha){
        this.senha = senha;
    }
    
    private void setRegistro(int registro){
        this.registro = registro;
    }
    
    private void setTipoLixo(String tipoLixo){
        this.tipoLixo = tipoLixo;
    }
}
