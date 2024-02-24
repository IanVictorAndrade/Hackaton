import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
    private int IdTurma;
    private String modalidade;
    private String curso;
    private String periodoAno;
    private String turno;
    private Disciplina disciplinasTurma;
    public ArrayList<Turma> turmas = new ArrayList<>();

    //Construtor

    public Turma(String modalidade, String curso, String periodoAno, String turno,
            String disciplinasTurma) {
        IdTurma = IdTurma++;
        this.modalidade = modalidade;
        this.curso = curso;
        this.periodoAno = periodoAno;
        this.turno = turno;
        this.disciplinasTurma = disciplinasTurma;
    }

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
        
        if (turmas.isEmpty()) {
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
        Scanner ler = new Scanner(System.in);
        boolean encontrado = false;
        Turma turmaEditar = null;

        if (listaTurmas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Turma não encontrada.");

            System.out.println("Nenhuma turma cadastrada.");
        } else {
            listarTurmas(listaTurmas);
            int idEditar = JOptionPane.showInputDialog("Digite o ID da turma");

            for (Turma turma : listaTurmas) {
                if (turma.getIdTurma() == idEditar) {
                    turmaEditar = turma;
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {  
                
                
                String[] opcoes = {"Editar Modalidade", "Editar Curso", "Editar Periodo", "Editar Turno", "Editar Disciplina", "Sair"};
                
                int opcao = JOptionPane.showOptionDialog(
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

                case 0:    //Edição da Modalidade          
                    
                String novaModalidade == turma.setModalidade((String) JOptionPane.showInputDialog(null, "Escolha a modalidade:", "Modalidade",
                    JOptionPane.QUESTION_MESSAGE, null, modalidades, modalidades[0]));                    
                    if (novaModalidade == null) {
                        return;
                    }
                    break;

                case 1:    //Edição do curso

                String novoCurso = turma.setCurso((String) JOptionPane.showInputDialog(null, "Selecione o curso:", "Curso",
                JOptionPane.QUESTION_MESSAGE, null, cursos, cursos[0]));

                    if (novoCurso == null) {
                        return;
                    }
                    break;
                
                case 2:    //Edição de Período
                String novoPeriodo == turma.setPeriodoAno((String) JOptionPane.showInputDialog(null, "Selecione o período:", "Período",
                JOptionPane.QUESTION_MESSAGE, null, periodos, periodos[0]));
                   if (novoPeriodo == null) {
                        return;
                    }
                    break;

                case 3:    //Edição do Turno
                String novoTurno == turma.setTurno((String) JOptionPane.showInputDialog(null, "Selecione o turno:", "Turno",
                JOptionPane.QUESTION_MESSAGE, null, turnos, turnos[0]));
                    if (novoTurno == false) {
                        return;
                    }
                    break;              
                
                case 5:
                    JOptionPane.showMessageDialog(null, "Edição concluída.");
                    break;                

                }
               
             JOptionPane.showMessageDialog(null, "Turma editada!");
                            
        }else {
                JOptionPane.showMessageDialog(null, "Disciplina não existe.");
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