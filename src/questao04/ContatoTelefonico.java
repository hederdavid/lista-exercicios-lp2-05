package questao04;

import java.util.Objects;

public class ContatoTelefonico {

    public static final int FAMILIAR = 0;
    public static final int PROFISSIONAL = 1;
    public static final int OUTROS = 2;
    private String nome;
    private String sobrenome;
    private String email;
    private int codigoPais;
    private String telefone;
    private int categoria;

    public ContatoTelefonico(String nome, String sobrenome, String email, int codigoPais, String telefone,
                             int categoria) throws IllegalArgumentException {
        if (categoria != FAMILIAR && categoria != PROFISSIONAL && categoria != OUTROS) {
            throw new IllegalArgumentException("Tipo de contato inválido!");
        }

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.codigoPais = codigoPais;
        this.telefone = telefone;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ContatoTelefonico [Nome = " + nome + ", Sobrenome = " + sobrenome + ", Email = " + email + ", CodigoPais = "
                + codigoPais + ", Telefone = " + telefone + ", Categoria = " + categoria + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContatoTelefonico that = (ContatoTelefonico) o;
        return codigoPais == that.codigoPais && Objects.equals(nome, that.nome) && Objects.equals(sobrenome, that.sobrenome)
                && Objects.equals(telefone, that.telefone);
    }
}