import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;

public class Disciplina {

    private int Id;
    private String nomeDisciplina;
    private int cargaHoraria;
    private String nivel;
    private String periodo;
    private String categoria;
    private String professorResponsavel;


    //Getters e Setters

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNivel() { return nivel; }

    public void setNivel(String nivel) { this.nivel = nivel; }

    public String getPeriodo() { return periodo; }

    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public String getCategoria() { return categoria; }

    public void setCategoria(String categoria) { this.categoria = categoria; }

    public int getCargaHorariaS() {
        return cargaHoraria;
    }

    public void setCargaHorariaS(int cargaHorariaS) {
        this.cargaHoraria = cargaHorariaS;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    //Métodos




    public static String exibirChoque() {
        return null;
    }

    public static String[] getNomesDisciplinas(ArrayList<Disciplina> disciplinas) {
        String[] nomes = new String[disciplinas.size()];
        for (int i = 0; i < disciplinas.size(); i++) {
            nomes[i] = disciplinas.get(i).getNomeDisciplina();
        }
        return nomes;
    }

    public static String escolherDisciplinaDom(ArrayList<Disciplina> disciplinas) {
        Professor professor = new Professor();
        boolean sair = false;

        while (!sair) {
            String[] opcoes = { "Opções de disciplinas", "Voltar" };
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Escolher Disciplinas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null,
                    opcoes,
                    opcoes[0]);

            switch (escolha) {
                case 0:
                    String[] disciplinasCadastradas = getNomesDisciplinas(disciplinas);
                    if (disciplinasCadastradas.length > 0) {
                        String disciplinaSelecionada = (String) JOptionPane.showInputDialog(
                                null,
                                "Selecione a disciplina de domínio:",
                                "Escolher Disciplina de Domínio",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                disciplinasCadastradas,
                                disciplinasCadastradas[0]);
                        if (disciplinaSelecionada != null) {
                            professor.setDisciplinaDominio(disciplinaSelecionada);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma disciplina cadastrada pelo adm.");
                    }
                }
                    break;
                case 1:
                    sair = true; // Altera a variável para sair do loop
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
        return null; // Retornar null caso saia do loop sem selecionar disciplina
    }

    public static String escolherDisciplinas(ArrayList<Disciplina> disciplinas) {
        Professor professor = new Professor();
        boolean sair = false;

        while (!sair) {
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0, 1));
            String[] opcoes = { "Opções de disciplinas", "Voltar" };
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Escolher Disciplinas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null,
                    opcoes,
                    opcoes[0]);

            switch (escolha) {
                case 0:
                   for (Disciplina disciplina : disciplinas) {
                    JCheckBox checkBox = new JCheckBox(disciplina.getNomeDisciplina());
                    panel.add(checkBox);
                        }
                    
                        int disciplinaSelecionadaInt = JOptionPane.showConfirmDialog(null, panel, "Escolha as disciplinas:",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                        if (disciplinaSelecionadaInt == JOptionPane.OK_OPTION) {
                            // Lógica para lidar com as disciplinas selecionadas
                            for (Component component : panel.getComponents()) {
                                if (component instanceof JCheckBox) {
                                    JCheckBox checkBox = (JCheckBox) component;
                                    if (checkBox.isSelected()) {
                                        String disciplinaSelecionada = checkBox.getText();
                                        Professor.disciplinasEscolhidas.add(disciplinaSelecionada);
                                    }
                                }
                            }
                        }
                    break;
                case 1:
                    sair = true; // Altera a variável para sair do loop
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
        return null; // Retornar null caso saia do loop sem selecionar disciplina
    }

}
