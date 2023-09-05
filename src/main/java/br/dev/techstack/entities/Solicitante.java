package br.dev.techstack.entities;

public class Solicitante {
    private String nome;
    private String cpf;
    private String email;

    public Solicitante(String nome, String cpf, String email){
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
            this.cpf = cpf;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
                "nome: '" + getNome() + '\'' +
                ", cpf: '" + getCpf() + '\'' +
                ", email: '" + getEmail() + '\'' +
                '}';
    }
}
