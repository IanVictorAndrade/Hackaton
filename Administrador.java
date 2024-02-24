import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {
    private String nome = "Ian";
    private String login = "ian";
    private String senha = "123";
    private ArrayList<Professor> professoresCadastrados;

    public Administrador() {
        this.professoresCadastrados = new ArrayList<>();
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

    public ArrayList<Professor> getProfessoresCadastrados() {
        return professoresCadastrados;
    }

    public void setProfessoresCadastrados(ArrayList<Professor> professoresCadastrados) {
        this.professoresCadastrados = professoresCadastrados;
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
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tente novamente.");
                return;
            }
    }

    public void menuAdministrador() {
        Disciplina disciplina = new Disciplina();
        String[] opcoes = {"Cadastrar professor", "Listar professores", "Cadastrar disciplina", "Listar disciplinas", "Sair"};
        int opcao = JOptionPane.showOptionDialog(
                null,
                "O que deseja fazer?",
                "Menu do administrador",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        switch (opcao) {
            case 0: // Cadastrar professor
                cadastrarProfessor();
                break;
            case 1: // Listar professores
                listarProfessores();
                break;
            case 2: // Cadastrar disciplina
                disciplina.cadastrarDisciplina();
                break;
            case 3: // Listar disciplinas
                disciplina.listarDisciplinas();
            case 4: // Sair
                JOptionPane.showMessageDialog(null, "Programa encerrado.");
                break;
        }
    }

    public boolean validarSenha() {
        return true;
    }

    public void cadastrarProfessor() {
        String nome = JOptionPane.showInputDialog("Nome:");
        Long matricula = Long.parseLong(JOptionPane.showInputDialog("Matrícula:"));
        String especializacao = JOptionPane.showInputDialog("Especialização:");
        boolean coordenador = Boolean.parseBoolean(JOptionPane.showInputDialog("Coordenador (true/false):"));
        int cHoraria = Integer.parseInt(JOptionPane.showInputDialog("Carga horária:"));
        String login = JOptionPane.showInputDialog("Login:");
        String senha = JOptionPane.showInputDialog("Senha:");
        String disciplinasEscolhidas = JOptionPane.showInputDialog("Disciplinas escolhidas:");
        String disciplinaDominio = JOptionPane.showInputDialog("Disciplina de domínio:");
        String turnoPreferido = JOptionPane.showInputDialog("Turno preferido:");
        String afinidadeTurma = JOptionPane.showInputDialog("Afinidade com a turma:");

        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setMatricula(matricula);
        professor.setEspecializacao(especializacao);
        professor.setCoordenador(coordenador);
        professor.setcHoraria(cHoraria);
        professor.setLogin(login);
        professor.setSenha(senha);
        professor.setDisciplinasEscolhidas(disciplinasEscolhidas);
        professor.setDisciplinaDominio(disciplinaDominio);
        professor.setTurnoPreferido(turnoPreferido);
        professor.setAfinidadeTurma(afinidadeTurma);

        professoresCadastrados.add(professor);
    }

    public ArrayList<Professor> listarProfessores() {
        JOptionPane.showMessageDialog(null, professoresCadastrados);
        return professoresCadastrados;
    }

    public void realizarLogin(String login, String senha) {
        Professor professor = Professor.login(professoresCadastrados, login, senha);
        if (professor != null) {
            JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
            Professor.menuProfessor();
        } else {
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tente novamente.");
        }
    }

    public String alterarCadProf() {
        return "";
    }

//    public String cadastrarDisciplina() {
//        return "";
//    }

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
