import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Disciplina {

    private int Id;
    private String nomeDisciplina;
    private int cargaHoraria;
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
        do {
            Disciplina disciplina = new Disciplina();
            disciplina.setNomeDisciplina(JOptionPane.showInputDialog("Digite o nome da disciplina: "));
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
                    .append("\n\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Disciplinas Cadastradas",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static String exibirChoque() {
        return null;
    }

}
