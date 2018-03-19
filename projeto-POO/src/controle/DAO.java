/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;


import modelos.Funcionario;

/**
 *
 * @author Caique e Kaique
 */
interface DAO <T> {
     public boolean criar (T obj);
     public boolean deletar(Funcionario fun);
     public Object buscar(int valor);
     public void  listar(); 
    
}
