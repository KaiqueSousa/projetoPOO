
package modelos;

import java.time.LocalDate;
import java.util.Objects;


public class funcionarios {
    
    private String nome;
    private String cpf;
    private LocalDate datanascimento;
    private char sexo;
    private String telefone;

    public funcionarios(String nome, String cpf, LocalDate datanascimento, char sexo, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.sexo = sexo;
        this.telefone = telefone;
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

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.cpf);
        hash = 37 * hash + Objects.hashCode(this.datanascimento);
        hash = 37 * hash + this.sexo;
        hash = 37 * hash + Objects.hashCode(this.telefone);
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
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.datanascimento, other.datanascimento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "funcionarios{" + "nome=" + nome + ", cpf=" + cpf + ", datanascimento=" + datanascimento + ", sexo=" + sexo + ", telefone=" + telefone + '}';
    }
    
    
}
