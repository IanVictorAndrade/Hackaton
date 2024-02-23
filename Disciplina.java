import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Disciplina {

    private int Id;
    private String nomeDisciplina;
    private int cargaHoraria;
    private String nivel;
    private String periodo;
    private String categoria;
    private String professorResponsavel;
    public ArrayList<Disciplina> disciplinas = new ArrayList<>();


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
                break;
            }
        } while (true);
    }


    public void listarDisciplinas() {
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
    }

    public static String exibirChoque() {
        return null;
    }

}
