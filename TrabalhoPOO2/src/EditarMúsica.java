import javax.swing.*;

public class EditarMúsica extends JFrame {
    private JLabel firstMainText;
    private JTextField textField1;
    private JButton OKButton;
    private JPanel EditarMusica;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private ArrayMidias array;

    public EditarMúsica(ArrayMidias array) {

        this.setTitle("Editar Música");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(EditarMusica);
        this.pack();
        this.array = array;

    }
}
