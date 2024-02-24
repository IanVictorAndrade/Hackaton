import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Turma {
    private int IdTurma;
    private String modalidade;
    private String curso;
    private String periodoAno;
    private String turno;
    private Disciplina disciplinasTurma;
    public ArrayList<Turma> turmas = new ArrayList<>();

    // Getters e Setters
    public int getIdTurma() {
        return IdTurma;
    }
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodoAno() {
        return periodoAno;
    }

    public void setPeriodoAno(String periodoAno) {
        this.periodoAno = periodoAno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDisciplina() {
        return disciplinasTurma.getNomeDisciplina();
    }
    public void setDisciplinasTurma(Disciplina disciplinasTurma) {
        this.disciplinasTurma = disciplinasTurma;
    }
    //Metodos


    public static String listarTurmas(ArrayList<Turma> listaTurmas) {
        
        if (listaTurmas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma turma cadastrada.");
        } else {
            for (Turma turma : listaTurmas) {

                JOptionPane.showMessageDialog(null, "ID: " + turma.getIdTurma() +
                        "\nModalidade " + turma.getModalidade() +
                        "\nCurso: " + turma.getCurso() +
                        "\nTurno: " + turma.getTurno());        

            }
        }
        
        return null;
    }

    public void cadastrarTurma(ArrayList<Disciplina> listaDisciplinas, ArrayList<Turma> listaTurmas) {
        String[] modalidades = {"Técnico", "Subsequente", "Graduação"};
        String[] cursos = {"ADS", "Informática", "Manutenção e Suporte"};
        String[] periodos = {"1º", "2º", "3º", "4º", "5º"};
        String[] turnos = {"Diurno", "Noturno"};
    
        do {
            Turma turma = new Turma();

            turma.setModalidade((String) JOptionPane.showInputDialog(null, "Escolha a modalidade:", "Modalidade",
                    JOptionPane.QUESTION_MESSAGE, null, modalidades, modalidades[0]));
    
            turma.setCurso((String) JOptionPane.showInputDialog(null, "Selecione o curso:", "Curso",
                    JOptionPane.QUESTION_MESSAGE, null, cursos, cursos[0]));
    
            turma.setPeriodoAno((String) JOptionPane.showInputDialog(null, "Selecione o período:", "Período",
                    JOptionPane.QUESTION_MESSAGE, null, periodos, periodos[0]));
    
            turma.setTurno((String) JOptionPane.showInputDialog(null, "Selecione o turno:", "Turno",
                    JOptionPane.QUESTION_MESSAGE, null, turnos, turnos[0]));
    
            // Lista de opções de disciplinas
            String[] opcoesDisciplinas = new String[listaDisciplinas.size()];
            for (int i = 0; i < listaDisciplinas.size(); i++) {
                opcoesDisciplinas[i] = listaDisciplinas.get(i).getNomeDisciplina();
            }
    
            String disciplinaSelecionada = (String) JOptionPane.showInputDialog(null,
                    "Selecione a disciplina para esta turma:", "Disciplina", JOptionPane.QUESTION_MESSAGE,
                    null, opcoesDisciplinas, opcoesDisciplinas[0]);
    
            // Encontrar a disciplina correspondente ao nome selecionado
            Disciplina disciplinaAssociada = null;
            for (Disciplina disciplina : listaDisciplinas) {
                if (disciplina.getNomeDisciplina().equals(disciplinaSelecionada)) {
                    disciplinaAssociada = disciplina;
                    break;
                }
            }
    
            // Verificar se a disciplina foi encontrada
            if (disciplinaAssociada != null) {
                turma.setDisciplinasTurma(disciplinaAssociada);
            } else {
                JOptionPane.showMessageDialog(null, "Disciplina não encontrada.");
                continue; // Continue para evitar adicionar uma turma sem disciplina associada
            }
    
            listaTurmas.add(turma);
    
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra turma?",
                    "Cadastrar Turma", JOptionPane.YES_NO_OPTION);
    
            if (opcao != JOptionPane.YES_OPTION) {
                break;
            }
        } while (true);
    }

    public static void editarTurma(ArrayList<Turma> listaTurmas) {
        String[] modalidades = {"Técnico", "Subsequente", "Graduação"};
        String[] cursos = {"ADS", "Informática", "Manutenção e Suporte"};
        String[] periodos = {"1º", "2º", "3º", "4º", "5º"};
        String[] turnos = {"Diurno", "Noturno"};
    
        
        boolean encontrado = false;
        Turma turmaEditar = null;
    
        if (listaTurmas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma turma cadastrada.");
        } else {
            listarTurmas(listaTurmas);
    
            int idEditar = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da turma: "));
    
            for (Turma turma : listaTurmas) {
                if (turma.getIdTurma() == idEditar) {
                    turmaEditar = turma;
                    encontrado = true;
                    break;
                }
            }
    
            if (encontrado) {
                String[] opcoes = {"Editar Modalidade", "Editar Curso", "Editar Periodo", "Editar Turno", "Editar Disciplina", "Sair"};
    
                int opcao;
                do {
                    opcao = JOptionPane.showOptionDialog(
                            null,
                            "Escolha uma opção:",
                            "Menu",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opcoes,
                            opcoes[0]
                    );
    
                    switch (opcao) {
                        case 0:    // Edição da Modalidade
                            turmaEditar.setModalidade((String) JOptionPane.showInputDialog(null, "Escolha a modalidade:", "Modalidade",
                                    JOptionPane.QUESTION_MESSAGE, null, modalidades, modalidades[0]));
                            break;
    
                        case 1:    // Edição do curso
                            turmaEditar.setCurso((String) JOptionPane.showInputDialog(null, "Selecione o curso:", "Curso",
                                    JOptionPane.QUESTION_MESSAGE, null, cursos, cursos[0]));
                            break;
    
                        case 2:    // Edição de Período
                            turmaEditar.setPeriodoAno((String) JOptionPane.showInputDialog(null, "Selecione o período:", "Período",
                                    JOptionPane.QUESTION_MESSAGE, null, periodos, periodos[0]));
                            break;
    
                        case 3:    // Edição do Turno
                            turmaEditar.setTurno((String) JOptionPane.showInputDialog(null, "Selecione o turno:", "Turno",
                                    JOptionPane.QUESTION_MESSAGE, null, turnos, turnos[0]));
                            break;
    
                        case 4:    // Edição da Disciplina
                            
                            break;
    
                        case 5:    // Sair do menu de edição
                            JOptionPane.showMessageDialog(null, "Edição concluída.");
                            break;
                    }
    
                } while (opcao != 5); // Repetir até que o usuário escolha sair
            } else {
                JOptionPane.showMessageDialog(null, "Turma não encontrada.");
            }
        }
    }
    


    //Excluir Turma
    public static boolean excluirTurma(int idTurma, ArrayList<Turma> listaTurmas) {
        for (Turma turma : listaTurmas) {
            if (turma.getIdTurma() == idTurma) {
                listaTurmas.remove(turma);
                JOptionPane.showMessageDialog(null, "Turma excluída!");
                return true; // Retorna true se a turma foi excluída
            }
        }
        JOptionPane.showMessageDialog(null, "Turma não encontrada!");

        return false; // Retorna false se a turma não foi encontrada

    }

}