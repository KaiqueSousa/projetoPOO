package app;

import controle.FuncionarioDao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import modelos.Funcionario;
import modelos.Usuario;


/**
 *
 * @author Caique e Kaíque
 */
public class Menu {
    
    public static void main(String[] args){
   
        Scanner sc = new Scanner(System.in);

        
        Usuario user = new Usuario();
        
        user.setLogin("user1");
        user.setSenha("123");
        
        System.out.print("Login: ");
        String login = sc.next();
        
        System.out.print("Senha:");
        String senha = sc.next();
            
        if(user.getLogin().equals("user1") && user.getSenha().equals("123")){
            System.out.println("Logion feito");           
                   
        
        int cont = 4;
         
         
        FuncionarioDao dao = new FuncionarioDao();
    
        while(cont != 0){
            System.out.println("1 - Cadatrar Funcionario;");
            System.out.println("2 - Apagar Funcionario;");
            System.out.println("3 - Buscar Funcionario;");
            System.out.println("4 - Listar Funcionario;");
            System.out.println("0 - Sair;");
          
            System.out.print("Digite o numero da opção dejeda: ");
            cont = sc.nextInt();
            
            System.out.println("--------------------------"); 
            
            switch(cont){
                   case 1:
                        Funcionario fun = new Funcionario();   
                       
                        System.out.print("Digite o nome do funcionario: ");                       
                        fun.setNome(sc.next());                        
                        
                        System.out.print("Digite o CPF: ");
                        fun.setCpf(sc.next());

                        System.out.println("Digite sua data de nascimento: ");
                        
                        String nascimento = sc.next();
                        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                        fun.setDatanasci(nascimento);
                        
                                              
                        if(dao.criar(fun)==false){
                            System.out.println("");
                            System.out.println("Funcionario já cadastrado!");
                            System.out.println("");
                        }else{
                            dao.criar(fun);
                             System.out.println("Funcionario cadastrado!");
                              System.out.println("-------------------------------");
                        } 
                        
                        
                        break;
                   
                   case 2:
                       
                       
                       Funcionario f = new Funcionario();   
                       
                       System.out.print("Digite o CPF: ");
                       f.setCpf(sc.next());
                       
                       dao.deletar(f);
                       
                       break;
                       
                       
                   case 3:
                       System.out.print("Qual o codigo do funcionario: ");
                       int cod = sc.nextInt();
                       if(dao.buscar(cod)==null){
                           System.out.println("Código Invalido!");
                       }else System.out.println(dao.buscar(cod));
                       break;

                   case 4:
                       dao.listar();                        
                       break;
                       
                       
                   case 0:
            
    }   
}
        }else{
            System.out.println("Usuario não cadstrado");
            
        }
 
   
}
}

   
    

