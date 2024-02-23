import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Professor {
    private String nome;
    private int matricula;
    private String especializacao;
    private int cHoraria;
    private String login;
    private String senha;
    private String disciplinasEscolhidas;
    private String disciplinaDominio;
    private String turnoPreferido;
    private String afinidadeTurma;

    // Metodo construtor

    public Professor(String nome, int matricula, String especializacao, int cHoraria, String login, String senha,
            String disciplinasEscolhidas, String disciplinaDominio, String turnoPreferido, String afinidadeTurma) {
        this.nome = nome;
        this.matricula = matricula;
        this.especializacao = especializacao;
        this.cHoraria = cHoraria;
        this.login = login;
        this.senha = senha;
        this.disciplinasEscolhidas = disciplinasEscolhidas;
        this.disciplinaDominio = disciplinaDominio;
        this.turnoPreferido = turnoPreferido;
        this.afinidadeTurma = afinidadeTurma;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public int getcHoraria() {
        return cHoraria;
    }

    public void setcHoraria(int cHoraria) {
        this.cHoraria = cHoraria;
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

    public String getDisciplinasEscolhidas() {
        return disciplinasEscolhidas;
    }

    public void setDisciplinasEscolhidas(String disciplinasEscolhidas) {
        this.disciplinasEscolhidas = disciplinasEscolhidas;
    }

    public String getDisciplinaDominio() {
        return disciplinaDominio;
    }

    public void setDisciplinaDominio(String disciplinaDominio) {
        this.disciplinaDominio = disciplinaDominio;
    }

    public String getTurnoPreferido() {
        return turnoPreferido;
    }

    public void setTurnoPreferido(String turnoPreferido) {
        this.turnoPreferido = turnoPreferido;
    }

    public String getAfinidadeTurma() {
        return afinidadeTurma;
    }

    public void setAfinidadeTurma(String afinidadeTurma) {
        this.afinidadeTurma = afinidadeTurma;
    }

    // Metodos

    public static void loginComoProfessor(ArrayList<Professor> professores) {
        String login = JOptionPane.showInputDialog("Digite seu código de matrícula: ");
        String senha = JOptionPane.showInputDialog("Digite sua senha: ");

        //Verificação se o login vai ser correspondente
        boolean logado = false;
        for (Professor professor : professores) {
            if (professor.getLogin().equals(login) && professor.getSenha().equals(senha)) {
                logado = true;
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
                break;
            }
        }
            if (!logado) {
                JOptionPane.showMessageDialog(null, "Credenciais inválidas.");
            }
    }

    public static boolean coordenador() {
        return true;
    }

    public static String escolherDisciplina() {
        return "";
    }

    public static String gerenciarPreferencias() {
        return "";
    }

    public static String listarDiscEscolhidas() {
        return "";
    }

}