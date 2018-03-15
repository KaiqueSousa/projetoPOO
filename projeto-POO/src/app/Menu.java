/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controle.FuncionarioDao;
import java.time.LocalDate;
import java.util.Scanner;
import modelos.Funcionario;

/**
 *
 * @author caique
 */
public class Menu {
    
    public static void main(String[] args){
        
        int cont = 4;
        Scanner sc = new Scanner(System.in);
         
        Funcionario fun = new Funcionario();     
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
                        System.out.print("Digite o nome do funcionario: ");                       
                        fun.setNome(sc.next());
                        
                        System.out.print("Digite o CPF: ");
                        fun.setCpf(sc.next());

                        fun.setCodigo(1);

                        fun.setDatanasci(LocalDate.now());
                        
                        dao.criar(fun); 
                        
                        break;

                   case 2:
                       
                   case 3:
                       System.out.print("Qual o codigo do funcionario: ");
                       int cod = sc.nextInt();
                       
                       dao.buscar(cod);

                   case 4:
                       System.out.println(dao.listar());                        
                       break;
                       
                       
                   case 0:
                    
            } 
    }
    
   
    
}

}
    

