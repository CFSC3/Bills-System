
package model.bean;

public class CadastroUsuario {
    
    private String nome;
    private String email;
    private String cpf;
    private String senha;
    private String confirmarSenha;

    public CadastroUsuario(String nome, String email, String cpf, String senha, String confirmarSenha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
       this.confirmarSenha = confirmarSenha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }
    
}
