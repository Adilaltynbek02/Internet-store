import javax.swing.*;

public class MainFrame extends JFrame {
    public static MainMenu menuWindow;
    public static BuyClient buyWindow;
    public static listClient listWindow;

    public MainFrame(){
        setSize(1000, 700);
        setTitle("Internet-store");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuWindow = new MainMenu();
        menuWindow.setLocation(0,0);
        add(menuWindow);

        buyWindow = new BuyClient();
        buyWindow.setLocation(0,0);
        buyWindow.setVisible(false);
        add(buyWindow);

        listWindow = new listClient();
        listWindow.setLocation(0,0);
        listWindow.setVisible(false);
        add(listWindow);
    }
}
