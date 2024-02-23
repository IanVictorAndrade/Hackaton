import javax.swing.*;
import java.util.ArrayList;

public class Terminal {
    public static void main(String[] args) {
        Professor professor = new Professor();
        ArrayList<Professor> professores = new ArrayList<>();
        Professor prof1 = new Professor();
        Professor prof2 = new Professor();
        professores.add(prof1);
        professores.add(prof2);
        Administrador adm = new Administrador();

        boolean loop = true;

        while (loop) {

            String[] opcoes = {"Professor", "Administrador", "Sair"};
            int opcao = JOptionPane.showOptionDialog(
                    null,
                    "Qual login deseja usar?",
                    "Menu de login",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch (opcao) {
                case 0: // Professor
                    professor.loginComoProfessor(professores);
                    break;
                case 1: // Administrador
                    adm.login();
                    break;
                case 2: // Sair
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    loop = false;
                    break;

            }
        }
    }
}