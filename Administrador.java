import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {
    private String nome = "Ian";
    private String login = "ian";
    private String senha = "123";
    private ArrayList<Professor> professoresCadastrados;

    private ArrayList<Disciplina> disciplinas;

    public Administrador() {
        this.professoresCadastrados = new ArrayList<>();
        this.disciplinas = new ArrayList<>(); // Inicialização da lista disciplinas
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

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
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
                menuAdministrador();
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tente novamente.");
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
                cadastrarDisciplina();
                menuAdministrador();
                break;
            case 3: // Listar disciplinas
                listarDisciplinas(disciplinas);
            case 4: // Sair
                JOptionPane.showMessageDialog(null, "Programa encerrado.");
                break;
        }
    }

    public void cadastrarDisciplina() {
        String[] niveis = {"Técnico", "Subsequente", "Graduação"};
        String[] periodos = {"Matutino", "Vespertino", "Noturno"};
        String[] categorias = {"Análise de Sistemas", "Redes", "Hardware", "Teoria"};

        do {
            Disciplina disciplina = new Disciplina();
            disciplina.setNomeDisciplina(JOptionPane.showInputDialog("Digite o nome da disciplina: "));
            disciplina.setNivel((String) JOptionPane.showInputDialog(null, "Selecione o nível da disciplina:",
                    "Nível", JOptionPane.QUESTION_MESSAGE, null, niveis, niveis[0]));
            disciplina.setPeriodo((String) JOptionPane.showInputDialog(null, "Selecione o período da disciplina:",
                    "Período", JOptionPane.QUESTION_MESSAGE, null, periodos, periodos[0]));
            disciplina.setCategoria((String) JOptionPane.showInputDialog(null, "Selecione a categoria da disciplina:",
                    "Categoria", JOptionPane.QUESTION_MESSAGE, null, categorias, categorias[0]));
            disciplina.setCargaHorariaS(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária da disciplina: ")));
            disciplinas.add(disciplina);

            int opcao = JOptionPane
                    .showConfirmDialog(null, "Deseja cadastrar outra disciplina?", "Cadastrar Disciplina",
                            JOptionPane.YES_NO_OPTION);

            if (opcao != JOptionPane.YES_OPTION) {
                break; // Sai do loop se o usuário não desejar cadastrar outra disciplina
            }
        } while (true);
    }


    public void listarDisciplinas(ArrayList<Disciplina> disciplinas) {
        StringBuilder mensagem = new StringBuilder();
        for (Disciplina disciplina : disciplinas) {
            mensagem.append("Nome da disciplina: ")
                    .append(disciplina.getNomeDisciplina())
                    .append("\nCarga horária: ")
                    .append(disciplina.getCargaHorariaS())
                    .append("\nNível: ")
                    .append(disciplina.getNivel())
                    .append("\nPeríodo: ")
                    .append(disciplina.getPeriodo())
                    .append("\nCategoria: ")
                    .append(disciplina.getCategoria())
                    .append("\n\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Disciplinas Cadastradas",
                JOptionPane.INFORMATION_MESSAGE);
        menuAdministrador();
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
