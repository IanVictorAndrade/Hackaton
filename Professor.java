import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Professor {
    private String nome;
    private Long matricula;
    private String especializacao;
    private boolean coordenador;
    private int cHoraria;
    public String login;
    private String senha;
    private String disciplinaDominio;
    private String turnoPreferido;
    private String afinidadeTurma;

    public static ArrayList<String> disciplinasEscolhidas = new ArrayList<>();

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
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



    public boolean isCoordenador() {
        return coordenador;
    }

    public void setCoordenador(boolean coordenador) {
        this.coordenador = coordenador;
    }

    // Metodos

    public static Professor login(ArrayList<Professor> professores, String login, String senha) {
        for (Professor professor : professores) {
            if (professor.getLogin().equals(login) && professor.getSenha().equals(senha)) {
                return professor;
            }
        }
        return null; // nenhum professor encontrado com o login e senha correspondentes
    }

    public static void menuProfessor() {
        boolean sair = false;
        while (!sair) {
            String[] opcoesMenu = { "Escolher disciplinas", "Gerenciar preferências", "Listar disciplinas escolhidas",
                    "Voltar" };
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção: ", "Menu", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, opcoesMenu, opcoesMenu[0]);

            switch (escolha) {
                case 0:
                    // Chamar metodo escolherDisciplinas()
                    Disciplina.escolherDisciplinas(Administrador.disciplinas);
                    break;
                case 1:
                    // Chamar metodo gerenciarPreferencias()
                    gerenciarPreferencias();
                    break;
                case 2:
                    listarDiscEscolhidas();
                    break;
                case 3:
                    sair = true; // Altera a variável para sair do loop
                    break;
            }
        }
    }
    public static void gerenciarPreferencias() {
        Professor professor = new Professor();
        boolean sair = false;

        while (!sair) {
            String[] opcoes = {"Alterar disciplina de domínio", "Alterar turno preferido", "Alterar afinidade com a turma", "Voltar"};
            int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha uma opção para alterar:",
            "Gerenciar Preferências",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE, null,
            opcoes,
            opcoes[0]);

            switch (escolha) {
                case 0:
                    Disciplina.escolherDisciplinaDom(Administrador.disciplinas);
                    break;
                case 1:
                    String[] turnos = {"Matutino", "Vespertino", "Noturno"};
                    String turnoSelecionado = (String) JOptionPane.showInputDialog(
                                null,
                                "Selecione a disciplina de domínio:",
                                "Escolher Disciplina de Domínio",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                turnos,
                                turnos[0]);
                    professor.setTurnoPreferido(turnoSelecionado);
                    break;
                case 2:
                    break;
                case 3:
                    sair = true; // Altera a variável para sair do loop
                    break;
            }
        }
    }

    public static void listarDiscEscolhidas() {
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Disciplinas escolhidas: \n");
        for (String disciplina : disciplinasEscolhidas) {
            mensagem.append(disciplina).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Disciplinas Cadastradas", JOptionPane.INFORMATION_MESSAGE);
    }

}