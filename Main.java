import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        int nombreA;
        int nombreB;
        int reste;

        JTextField nbA = new JTextField();
        JTextField nbB = new JTextField();

        JOptionPane.showOptionDialog(
                null,
                new Object[]{"Veuillez saisir :\n",
                        "Nombre a : ", nbA,
                        "Nombre b : ", nbB},
                "Saisie informations",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                null);

        nombreA = Integer.parseInt(nbA.getText());
        nombreB = Integer.parseInt(nbB.getText());


        while (nombreB != 0) {
        reste = nombreA % nombreB;
        nombreA = nombreB;
        nombreB = reste;
        }
        System.out.println(nombreA);
    }
}
