
package modelos;


public class Vendedor extends Funcionario{
    
    private float salario;
    private float comissao;
    
    public Vendedor(String nome, String cpf, String datanasci, String codigoLoja) {
        super(nome, cpf, datanasci);
        this.salario = salario;
        this.comissao = comissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Float.floatToIntBits(this.salario);
        hash = 11 * hash + Float.floatToIntBits(this.comissao);
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
        final Vendedor other = (Vendedor) obj;
        if (Float.floatToIntBits(this.salario) != Float.floatToIntBits(other.salario)) {
            return false;
        }
        if (Float.floatToIntBits(this.comissao) != Float.floatToIntBits(other.comissao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vendedores{" + "salario=" + salario + ", comissao=" + comissao + '}';
    }
    
}
