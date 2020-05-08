import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listClient extends Container {
    public static JTextArea text;
    private JButton listButton;
    private JButton backButton;

    public listClient(){
        setSize(1000, 700);
        setLayout(null);

        text = new JTextArea();
        text.setBounds(90, 50, 300,150);
        add(text);

        listButton = new JButton("LIST CLIENTS");
        listButton.setBounds(90, 220, 145, 30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "";
                for(int i = 0; i < Main.clCount; i++){
                    s+=Main.clients[i]+"\n";
                }
                text.setText(s);
            }
        });
        add(listButton);

        backButton=new JButton("BACK");
        backButton.setBounds(255, 220, 145, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.listWindow.setVisible(false);
                Main.frame.menuWindow.setVisible(true);
            }
        });
        add(backButton);
    }
}
