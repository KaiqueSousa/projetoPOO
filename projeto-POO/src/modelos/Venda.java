/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author caique
 */
public class Venda {
    private String codigo;
    private LocalDate dataVenda;
    private ItemVenda[] itensVenda;
    private Vendedor vendedorVenda; 

    public Venda(String codigo, LocalDate dataVenda, ItemVenda[] itensVenda) {
        this.codigo = codigo;
        this.dataVenda = dataVenda;
        this.itensVenda = itensVenda;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public ItemVenda[] getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ItemVenda[] itensVenda) {
        this.itensVenda = itensVenda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.codigo);
        hash = 11 * hash + Objects.hashCode(this.dataVenda);
        hash = 11 * hash + Arrays.deepHashCode(this.itensVenda);
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
        final Venda other = (Venda) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.dataVenda, other.dataVenda)) {
            return false;
        }
        if (!Arrays.deepEquals(this.itensVenda, other.itensVenda)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venda{" + "codigo=" + codigo + ", dataVenda=" + dataVenda + ", itensVenda=" + itensVenda + '}';
    }
    
    
    
   
}
