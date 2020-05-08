import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    private JButton buyButton;
    private JButton listButton;
    private JButton exitButton;

    public MainMenu(){
        setSize(1000, 700);
        setLayout(null);

        buyButton = new JButton("BUY");
        buyButton.setBounds(370, 230, 300, 30);
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.buyWindow.setVisible(true);
            }
        });
        add(buyButton);

        listButton = new JButton("LIST");
        listButton.setBounds(370, 270, 300, 30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.listWindow.setVisible(true);
            }
        });
        add(listButton);

        exitButton = new JButton("EXIT");
        exitButton.setBounds(370, 310, 300, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
    }
}
