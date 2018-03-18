package controle;

import modelos.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao implements DAO <Funcionario>{
    
  
    public List<Funcionario> funcionario = new ArrayList<>(); 
    
    @Override
    public boolean criar(Funcionario obj) {
       for(Funcionario fun: funcionario){
            if(fun.getCpf().equals(obj.getCpf())){
                return false;
            }
            
        }
       return funcionario.add(obj); 
        
    }

    @Override
    public boolean deletar(Funcionario fun){
         for(int i = 0; i < funcionario.size(); i++ ){
             if(funcionario.get(i).getCpf().equals(fun.getCpf())){
                 funcionario.remove(funcionario.get(i));
             }
         }
         return true;
    }

    @Override
    public Object buscar(int cod) { 
        for(Funcionario fun: funcionario){
            if(fun.getCodigo()== cod){
                return fun;
            }   
        }
        return null;
    }

    @Override
    public void listar() { 
        for(Funcionario fun: funcionario){
            
            System.out.println(fun.toString());
       }
  
    }
    
}
