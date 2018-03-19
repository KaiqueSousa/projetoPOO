package controle;

import modelos.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao implements DAO <Funcionario>{
    
  
    public List<Funcionario> funcionario = new ArrayList<>(); 
    
    /**
     * Método utilizado para salvar um novo funcionario na lista.
     * @param obj É um objeto do Tipo Funcionario que contém o Funcionario que será adicionado a lista.
     * @return true Se o salvo com sucesso, false Se não foi possivel salvar o Funcionario. 
     */
    
    @Override
    public boolean criar(Funcionario obj) {
       for(Funcionario fun: funcionario){
            if(fun.getCpf().equals(obj.getCpf())){
                return false;
            }
            
        }
       return funcionario.add(obj); 
        
    }

    /**
     * Método utilizado para remover um determinado Funcionario da lista.
     * @param fun É um objeto do Tipo Fincionario que contém o Funcionario que será removido da lista.
     * @return true Se removido com Sucesso, false Se não foi possivel remover o Funcionario.
     */
    @Override
    public boolean deletar(Funcionario fun){
         for(int i = 0; i < funcionario.size(); i++ ){
             if(funcionario.get(i).getCpf().equals(fun.getCpf())){
                 funcionario.remove(funcionario.get(i));
             }
         }
         return false;
    }

    /**
     * Método utilizado para buscar um determinado Funcionario na lista.
     * @param cod É uma variavel do Tipo Inteiro que contém o código do Funcionario do qual
     * será retornado suas informações.
     * @return fun Do Tipo Funcionario Preenchidas com as informações Associadas ao código informado.
     */
    @Override
    public Object buscar(int cod) { 
        for(Funcionario fun: funcionario){
            if(fun.getCodigo()== cod){
                return fun;
            }   
        }
        return null;
    }

    /**
     * Método utilizado para listagem, ao ser chamado imprime a lista de todos os 
     * Funcionarios salvos.
     */
    @Override
    public void listar() { 
        for(Funcionario fun: funcionario){
            
            System.out.println(fun.toString());
       }
  
    }

    
    
}
