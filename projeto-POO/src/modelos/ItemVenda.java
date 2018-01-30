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
public class ItemVenda {
    
    private int quant;
    private Produto[] produtos;

    public ItemVenda(int quant, Produto[] produtos) {
        this.quant = quant;
        this.produtos = produtos;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.quant;
        hash = 97 * hash + Arrays.deepHashCode(this.produtos);
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
        final ItemVenda other = (ItemVenda) obj;
        if (this.quant != other.quant) {
            return false;
        }
        if (!Arrays.deepEquals(this.produtos, other.produtos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemVenda{" + "quant=" + quant + ", produtos=" + produtos + '}';
    }
    
    
    
}
