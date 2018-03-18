package app;

import controle.FuncionarioDao;
import controle.LojaDao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelos.Funcionario;
import modelos.Loja;

/**
 *
 * @author caique
 */
public class Menu {
    
    public static void main(String[] args){

        int cont = 4;
        Scanner sc = new Scanner(System.in);
         
         
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

                        fun.setDatanasci(LocalDate.now());
                        
                                              
                        if(dao.criar(fun)==false){
                            System.out.println("");
                            System.out.println("Funcionario já cadastrado!");
                            System.out.println("");
                        }else dao.criar(fun); 
                        
                        
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
                       

                   case 4:
                       dao.listar();                        
                       break;
                       
                       
                   case 0:
            
    }   
}
   
}
}

   
    

