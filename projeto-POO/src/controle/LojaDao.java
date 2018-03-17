
package controle;

import java.util.ArrayList;
import java.util.List;
import modelos.Loja;

/**
 *
 * @author kaique
 */
public class LojaDao implements DAO<Loja>{
    
    private List<Loja> loja = new ArrayList();

    @Override
    public boolean criar(Loja obj) {
       return loja.add(obj);
    }

    @Override
    public boolean deletar(Loja obj) {
       return loja.remove(obj);
    }

    @Override
    public Object buscar(int valor) {
       for(int i = 0; i< loja.size(); i++){
         if(loja.get(i).equals(valor))
            loja.toString(); 
         return loja;
       }
        return null;
    }

    @Override
    public List<Loja> listar() {
         for(int i = 0; i< loja.size(); i++){
            loja.toString();  
       }
       return loja;
    }
    
}
