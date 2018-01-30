
package modelos;

import java.util.Arrays;


public class DepartamentoLoja{
    
        private int quant;
        private Departamento [] departamentos; 

    public DepartamentoLoja(int quant, Departamento[] departamentos) {
        this.quant = quant;
        this.departamentos = departamentos;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.quant;
        hash = 17 * hash + Arrays.deepHashCode(this.departamentos);
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
        final DepartamentoLoja other = (DepartamentoLoja) obj;
        if (this.quant != other.quant) {
            return false;
        }
        if (!Arrays.deepEquals(this.departamentos, other.departamentos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DepartamentoLoja{" + "quant=" + quant + ", departamentos=" + departamentos + '}';
    }
    
      
}


