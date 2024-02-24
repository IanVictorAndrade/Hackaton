import javax.swing.JOptionPane;
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
    private String disciplinasEscolhidas;
    private String disciplinaDominio;
    private String turnoPreferido;
    private String afinidadeTurma;

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
                return professor; // encontrou um professor com o login e senha correspondentes
                // Caso as credencias estiverem corretas, o professor terá acesso ao menu do
                // professor
            }
        }
        return null; // nenhum professor encontrado com o login e senha correspondentes
    }

    public static void menuProfessor() {
        boolean sair = false;
        while (!sair) {
            String[] opcoesMenu = { "Escolher disciplinas", "Gerenciar preferências", "Listar disciplinas escolhidas",
                    "Sair" };
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção: ", "Menu", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, opcoesMenu, opcoesMenu[0]);

            switch (escolha) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Opção 'Escolher disciplinas' selecionada.");
                    // Chamar metodo escolherDisciplinas()
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Opção 'Gerenciar preferências' selecionada.");
                    // Chamar metodo gerenciarPreferencias()
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Opção 'Listar disciplinas escolhidas' selecionada.");
                    // Chamar metodo listarDiscEscolhidas()
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    sair = true; // Altera a variável para sair do loop
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.");
                    break;
            }
        }
    }

    public void escolherDisciplinas(ArrayList<Disciplina> disciplinas) {
        boolean sair = false;

        while (!sair) {
            String[] opcoes = {"Alterar disciplina de domínio", "Alterar turno preferido", "Alterar afinidade com a turma"};
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
                    String[] disciplinasCadastradas = Disciplina.getNomesDisciplinas(disciplinas);
                    if (disciplinasCadastradas.length > 0) {
                    String disciplinaSelecionada = (String) JOptionPane.showInputDialog(
                            null,
                            "Selecione a disciplina de domínio:",
                            "Alterar Disciplina de Domínio",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            disciplinasCadastradas,
                            disciplinasCadastradas[0]);
                } else {
                JOptionPane.showMessageDialog(null, "Nenhuma disciplina cadastrada.");
                    }
                    break;
            }
        }
    }

    public static String gerenciarPreferencias() {
        return "";
    }

    public static String listarDiscEscolhidas() {
        return "";
    }

}