/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.time.LocalDate;

/**
 *
 * @author caique
 */
public class Repositor extends Funcionario {
    
    private float salario;

    public Repositor(String nome, String cpf, LocalDate datanasci, int codigo, String codigoLoja) {
        super(nome, cpf, datanasci, codigo);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Float.floatToIntBits(this.salario);
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
        final Repositor other = (Repositor) obj;
        if (Float.floatToIntBits(this.salario) != Float.floatToIntBits(other.salario)) {
            return false;
        }
        return true;
    }

    
}
