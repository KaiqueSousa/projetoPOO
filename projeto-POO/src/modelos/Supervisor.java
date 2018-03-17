
package modelos;

import java.time.LocalDate;


public class Supervisor extends Funcionario{
    
    private float salario;

    public Supervisor(float salario, String nome, String cpf, LocalDate datanasci, String codigoLoja) {
        super(nome, cpf, datanasci);
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
        hash = 37 * hash + Float.floatToIntBits(this.salario);
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
        final Supervisor other = (Supervisor) obj;
        if (Float.floatToIntBits(this.salario) != Float.floatToIntBits(other.salario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "supervisores{" + "salario=" + salario + '}';
    }
    
    
}
