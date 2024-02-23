import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {
    private String nome = "Ian";
    private String login = "ian@gmail.com";
    private String senha = "123";

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Metodos

    public boolean validarLogin(String loginDigitado, String senhaDigitada) {
        return loginDigitado.equals(login) && senhaDigitada.equals(senha);
    }

    public void login() {
            String loginDigitado = JOptionPane.showInputDialog("Digite o login: ");
            String senhaDigitada = JOptionPane.showInputDialog("Digite a senha: ");

            if (validarLogin(loginDigitado, senhaDigitada)) {
                JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                // Aqui você pode colocar o código para passar para a próxima tela
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tente novamente.");
                return;
            }
    }

    public boolean validarSenha() {
        return true;
    }

    public String cadastrarProfessor() {
        return "";
    }

    public String alterarCadProf() {
        return "";
    }

    public String cadastrarDisciplina() {
        return "";
    }

    public String alterarCadDisc() {
        return "";
    }

    public String cadastrarTurma() {
        return "";
    }

    public String alterarCadTurma() {
        return "";
    }

}
