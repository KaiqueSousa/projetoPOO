/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;

/**
 *
 * @author caique
 */
interface DAO <T> {
     public void criar (T obj);
     public boolean deletar(T obj);
     public Object buscar(int valor);
     public List<T>  listar(); 
}
