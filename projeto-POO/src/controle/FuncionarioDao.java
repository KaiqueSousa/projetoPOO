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
    public boolean deletar(Funcionario obj) {
       return funcionario.remove(obj);
             
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
    public List<Funcionario> listar() { 
        for(int i = 0; i< funcionario.size(); i++){
            funcionario.toString();  
       }
       return funcionario;
    }
    
}
