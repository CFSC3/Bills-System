
package model.bean;

import java.util.Calendar;


public class Login {
    
    private String cpf;
    private String senha;

    public Login() {
    }

    
    public Login(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public Login(String cpf) {
        this.cpf = cpf;
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
}
