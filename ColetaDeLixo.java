package coletadelixo;

import java.util.ArrayList;
import java.util.Scanner;

public class ColetaDeLixo {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
        
        while((opcao < 5)||(opcao == 0)){
            System.out.println("==== CADASTRO DA COLETA DE LIXO ====");
            System.out.println("Selecione uma opção: ");
            
            System.out.println("1 - Logar");
            System.out.println("2 - Alterar Senha");
            System.out.println("3 - Criar Cadastro");
            System.out.println("4 - Excluir Cadastro");
            System.out.println("0 - Retornar ao menu");
            System.out.println("Opção >> ");
            
            switch(opcao){
                case 1:
                    logarSistema();
                    break;
                
                case 2:
                    alterarSenha();
                    break;
                
                case 3:
                    criarCadastro();
                    break;
                    
                case 4:
                    excluirCadastro();
                    break;
                
                default:
                    System.out.println("Opção inválida!");
            }
            
            opcao = entrada.nextInt();
            
        }
    }
        
    }
    
}
