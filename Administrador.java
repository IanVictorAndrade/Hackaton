import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {
    private String nome;
    private String login;
    private String senha;

    //Construtor

    public Administrador(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

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

    public static boolean validarLogin() {
        return true;
    }

    public static boolean validarSenha() {
        return true;
    }

    public static String cadastrarProfessor() {
        return "";
    }

    public static String alterarCadProf() {
        return "";
    }

    public static String cadastrarDisciplina() {
        return "";
    }

    public static String alterarCadDisc() {
        return "";
    }

    public static String cadastrarTurma() {
        return "";
    }

    public static String alterarCadTurma() {
        return "";
    }

}
