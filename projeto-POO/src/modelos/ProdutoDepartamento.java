
package modelos;

import java.util.Arrays;


public class ProdutoDepartamento {
    
    private int quant;
    private Produto[] produtos;

    public ProdutoDepartamento(int quant, Produto[] produtos) {
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
        hash = 23 * hash + this.quant;
        hash = 23 * hash + Arrays.deepHashCode(this.produtos);
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
        final ProdutoDepartamento other = (ProdutoDepartamento) obj;
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
        return "ProdutoDepartamento{" + "quant=" + quant + ", produtos=" + produtos + '}';
    }

    
}