import javax.swing.*;
import java.awt.*;

public class AgendaGUI extends JFrame {
    JLabel titulo;
    ImageIcon addImg;
    ImageIcon searchImg;
    ImageIcon removeImg;
    JButton botaoAdd, botaoSrc, botaoRemove;


    public AgendaGUI() {
        setTitle("Agenda de Classes");
        setSize(800,600);
        setBackground(Color.WHITE);
        setResizable(false);
        titulo = new JLabel("Notas", JLabel.CENTER);
        titulo.setForeground(Color.gray);
        titulo.setFont(new Font("Bahnschrift", Font.BOLD, 24));
        JButton btn = new JButton("Adicionar");
        btn.setPreferredSize(new Dimension(40,40));
        getContentPane().add(btn);
        getContentPane().add(titulo);
    }

}
