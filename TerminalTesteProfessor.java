import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class TerminalTesteProfessor {
    public static void main(String[] args) {
    ArrayList<Professor> professores = new ArrayList<>();
        Professor prof1 = new Professor("Alguém", 2023, null, false, 0, "2024", "2024", null, null, null, null);
        Professor prof2 = new Professor(null, 2023, null, false, 0, "2023", "2023", null, null, null, null);
        professores.add(prof1);
        professores.add(prof2);

        String[] opcoesLogin = {"Logar como professor", "Logar como admnistrador", "Sair"};

        int escolha = JOptionPane.showOptionDialog(null, "Como deseja realizar o login?", "Login", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesLogin, opcoesLogin[0]);

        switch (escolha) {
            case 0:
                Professor.loginComoProfessor(professores);
                break;
            case 1:
                //loginComoAdministrador();
                break;
            case 2:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.");
                break;
        }
    }

}
