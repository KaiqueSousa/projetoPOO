/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author caique
 */
public class FuncionarioDao <Funcionario> implements DAO <Funcionario>{
    
   
    public List<Funcionario> funcionario = new ArrayList(); 

    @Override
    public void criar(Funcionario obj) {
        
        funcionario.add(obj);
        
    }

    @Override
    public boolean deletar(Funcionario obj) {
        funcionario.remove(obj);
        return true;
        
    }

    @Override
    public Object buscar(int valor) {
       int i; 
        for(i = 0; i< funcionario.size(); i++){
         if(funcionario.get(i).equals(valor))
            funcionario.toString(); 
           
       }
    }

    @Override
    public List<Funcionario> listar() {
        int i; 
        for(i = 0; i< funcionario.size(); i++){
            funcionario.toString();  
       }
       return funcionario;
    }

  
    
    

    
}
