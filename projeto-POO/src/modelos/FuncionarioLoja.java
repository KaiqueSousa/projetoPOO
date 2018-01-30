/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Arrays;

/**
 *
 * @author caique
 */
public class FuncionarioLoja {

    private int quant;
    private Funcionario[] funcionariosLoja;

    public FuncionarioLoja(int quant, Funcionario[] funcionariosLoja) {
        this.quant = quant;
        this.funcionariosLoja = funcionariosLoja;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public Funcionario[] getFuncionariosLoja() {
        return funcionariosLoja;
    }

    public void setFuncionariosLoja(Funcionario[] funcionariosLoja) {
        this.funcionariosLoja = funcionariosLoja;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.quant;
        hash = 97 * hash + Arrays.deepHashCode(this.funcionariosLoja);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FuncionarioLoja other = (FuncionarioLoja) obj;
        if (this.quant != other.quant) {
            return false;
        }
        if (!Arrays.deepEquals(this.funcionariosLoja, other.funcionariosLoja)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FuncionarioLoja{" + "quant=" + quant + ", funcionariosLoja=" + funcionariosLoja + '}';
    }

}
