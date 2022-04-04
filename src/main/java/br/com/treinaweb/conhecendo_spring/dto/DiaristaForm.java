package br.com.treinaweb.conhecendo_spring.dto;

import java.util.Objects;

public class DiaristaForm {
    
    private String nome;
    private String telefone;
    private String cpf;
    

    public DiaristaForm() {
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DiaristaForm)) {
            return false;
        }
        DiaristaForm diaristaForm = (DiaristaForm) o;
        return Objects.equals(nome, diaristaForm.nome) && Objects.equals(telefone, diaristaForm.telefone) && Objects.equals(cpf, diaristaForm.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone, cpf);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", cpf='" + getCpf() + "'" +
            "}";
    }


}