import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExibirFilme extends JFrame {
    private JLabel firstMainText;
    private JButton exibirButton;
    private JButton sairButton;
    private JScrollBar scrollBar1;
    private JTextArea textArea1;
    private JPanel ExibirFilmePanel;
    ArrayMidias array;

    public ExibirFilme(ArrayMidias array) {
        this.setTitle("Exibir Filme");
        this.setSize(500, 2000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(ExibirFilmePanel);
        this.array = array;

        exibirButton.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                textArea1.setText(array.toString());
            }
        });

        sairButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e){
                dispose();

            }

        });
    }
}

