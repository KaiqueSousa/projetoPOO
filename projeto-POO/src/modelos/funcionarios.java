
package modelos;

import java.time.LocalDate;
import java.util.Objects;


public class funcionarios {
    
    private String nome;
    private String cpf;
    private LocalDate datanasci;
    private String codigo;
    public String codigoLoja;

    public funcionarios(String nome, String cpf, LocalDate datanasci, String codigo, String codigoLoja) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanasci = datanasci;
        this.codigo = codigo;
        this.codigoLoja = codigoLoja;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDatanasci() {
        return datanasci;
    }

    public void setDatanasci(LocalDate datanasci) {
        this.datanasci = datanasci;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.cpf);
        hash = 29 * hash + Objects.hashCode(this.datanasci);
        hash = 29 * hash + Objects.hashCode(this.codigo);
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
        final funcionarios other = (funcionarios) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.datanasci, other.datanasci)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "funcionarios{" + "nome=" + nome + ", cpf=" + cpf + ", datanasci=" + datanasci + ", codigo=" + codigo + '}';
    }
    
    
    
}
