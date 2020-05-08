import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyClient extends Container {
    private JLabel nameLabel;
    private JTextField nameText;

    private JLabel surnameLabel;
    private JTextField surnameText;

    private JLabel productsLabel;

    private JLabel breadsLabel;
    private JLabel meatsLabel;
    private JLabel sausagesLabel;
    private JLabel floursLabel;
    private JLabel milkLabel;
    private JLabel teasLabel;
    private JLabel vegetablesLabel;
    private JLabel fruitsLabel;

    private JButton bread1Button;
    private JButton meat1Button;
    private JButton sausage1Button;
    private JButton flour1Button;
    private JButton milk1Button;
    private JButton tea1Button;
    private JButton vegetable1Button;
    private JButton fruit1Button;

    private JButton bread2Button;
    private JButton meat2Button;
    private JButton sausage2Button;
    private JButton flour2Button;
    private JButton milk2Button;
    private JButton tea2Button;
    private JButton vegetable2Button;
    private JButton fruit2Button;


    private JButton bread3Button;
    private JButton meat3Button;
    private JButton sausage3Button;
    private JButton flour3Button;
    private JButton milk3Button;
    private JButton tea3Button;
    private JButton vegetable3Button;
    private JButton fruit3Button;

    private JButton addButton;
    private JButton backButton;

    private JLabel totalLabel;
    private JTextArea totalProducts;
    private JTextArea sumOfPrice;

    int sumPrice = 0;

    String s = "";

    public BuyClient() {
        setSize(1000, 700);
        setLayout(null);

        totalProducts = new JTextArea();
        totalProducts.setBounds(760, 150, 150, 400);
        add(totalProducts);

        nameLabel = new JLabel("NAME:");
        nameLabel.setBounds(50, 30, 60, 30);
        add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(120, 30, 150, 30);
        add(nameText);

        surnameLabel = new JLabel("SURNAME:");
        surnameLabel.setBounds(50, 70, 60, 30);
        add(surnameLabel);

        surnameText = new JTextField();
        surnameText.setBounds(120, 70, 150, 30);
        add(surnameText);

        productsLabel = new JLabel("PRODUCTS:");
        productsLabel.setBounds(50, 110, 60, 30);

        breadsLabel = new JLabel("BREADS:");
        breadsLabel.setBounds(120, 110, 60, 30);
        add(breadsLabel);

        bread1Button = new JButton("Medeuski - 180tg");
        bread1Button.setBounds(120, 150, 150, 30);
        bread1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="Bread Medeuski - 180tg"+"\n";
                totalProducts.setText(s);
                sumPrice = sumPrice+180;
            }
        });
        add(bread1Button);

        bread2Button = new JButton("Nan Alemi - 160tg");
        bread2Button.setBounds(120, 190, 150, 30);
        bread2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="Bread Nan Alemi - 160tg"+"\n";
                totalProducts.setText(s);
                sumPrice = sumPrice+160;
            }
        });
        add(bread2Button);

        bread3Button = new JButton("Litovski - 305tg");
        bread3Button.setBounds(120, 230, 150, 30);
        bread3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="Bread Litovski - 305tg"+"\n";
                totalProducts.setText(s);
                sumPrice = sumPrice+305;
            }
        });
        add(bread3Button);

        meatsLabel = new JLabel("MEATS:");
        meatsLabel.setBounds(120, 270, 60, 30);
        add(meatsLabel);

        meat1Button = new JButton("ALEL - 870tg");
        meat1Button.setBounds(120, 310, 150, 30);
        meat1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="Meat ALEL - 870tg"+"\n";
                totalProducts.setText(s);
                sumPrice = sumPrice+870;
            }
        });
        add(meat1Button);

        meat2Button = new JButton("KAZMIASO - 3100tg");
        meat2Button.setBounds(120, 350, 150, 30);
        meat2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="Meat KAZMIASO - 3100tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+3100;
            }
        });
        add(meat2Button);

        meat3Button = new JButton("ASYL ET - 1690tg");
        meat3Button.setBounds(120, 390, 150, 30);
        meat3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="Meat ASYL ET - 1690tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+1690;
            }
        });
        add(meat3Button);

        sausagesLabel = new JLabel("SAUSAGES:");
        sausagesLabel.setBounds(280, 110, 150, 30);
        add(sausagesLabel);

        sausage1Button = new JButton("AL HALAL - 2535tg");
        sausage1Button.setBounds(280, 150, 150, 30);
        sausage1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="AL HALAL - 2535tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+2535;
            }
        });
        add(sausage1Button);

        sausage2Button = new JButton("PERVOMAISKIE - 3055tg");
        sausage2Button.setBounds(280, 190, 150, 30);
        sausage2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="PERVOMAISKIE - 3055tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+3055;
            }
        });
        add(sausage2Button);

        sausage3Button = new JButton("BEKKER - 3930tg");
        sausage3Button.setBounds(280, 230, 150, 30);
        sausage3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="BEKKER - 3930tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+3930;
            }
        });
        add(sausage3Button);

        floursLabel = new JLabel("FLOURS: 10kg");
        floursLabel.setBounds(280, 270, 150, 30);
        add(floursLabel);

        flour1Button = new JButton("DOBRAYA - 2300tg");
        flour1Button.setBounds(280, 310, 150, 30);
        flour1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="DOBRAYA 10kg- 2300tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+2300;
            }
        });
        add(flour1Button);

        flour2Button = new JButton("NUR - 3000tg");
        flour2Button.setBounds(280, 350, 150, 30);
        flour2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="NUR 10kg- 3000tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+3000;
            }
        });
        add(flour2Button);

        flour3Button = new JButton("IMPERATOR - 3700tg");
        flour3Button.setBounds(280, 390, 150, 30);
        flour3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="IMPERATOR 10kg - 3700tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+3700;
            }
        });
        add(flour3Button);

        milkLabel = new JLabel("MILK: 3.2%");
        milkLabel.setBounds(440, 110, 60, 30);
        add(milkLabel);

        milk1Button = new JButton("ADAL SUT - 220tg/L");
        milk1Button.setBounds(440, 150, 150, 30);
        milk1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="ADAL SUT 3.2% - 220tg/L"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+220;
            }
        });
        add(milk1Button);

        milk2Button = new JButton("PETROPAVL - 380tg");
        milk2Button.setBounds(440, 190, 150, 30);
        milk2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="PETROPAVL - 380tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+380;
            }
        });
        add(milk2Button);

        milk3Button = new JButton("SHADRINSKOE - 270tg");
        milk3Button.setBounds(440, 230, 150, 30);
        milk3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="SHADRINSKOE - 270tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+270;
            }
        });
        add(milk3Button);

        teasLabel = new JLabel("TEAS:");
        teasLabel.setBounds(440, 270, 60, 30);
        add(teasLabel);

        tea1Button = new JButton("PIALA - 300tg");
        tea1Button.setBounds(440, 310, 150, 30);
        tea1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="PIALA - 300tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+300;
            }
        });
        add(tea1Button);

        tea2Button = new JButton("TESS - 520tg");
        tea2Button.setBounds(440, 350, 150, 30);
        tea2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="TESS - 520tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+520;
            }
        });
        add(tea2Button);

        tea3Button = new JButton("GREENFIELD - 600tg");
        tea3Button.setBounds(440, 390, 150, 30);
        tea3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="GREENFIELD - 600tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+600;
            }
        });
        add(tea3Button);

        vegetablesLabel = new JLabel("VEGETABLES:");
        vegetablesLabel.setBounds(600, 110, 150, 30);
        add(vegetablesLabel);

        vegetable1Button = new JButton("CARROT - 180tg/kg");
        vegetable1Button.setBounds(600, 150, 150, 30);
        vegetable1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="CARROT - 180tg/kg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+180;
            }
        });
        add(vegetable1Button);

        vegetable2Button = new JButton("POTATOES - 130tg/kg");
        vegetable2Button.setBounds(600, 190, 150, 30);
        vegetable2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="POTATOES - 130tg/kg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+130;
            }
        });
        add(vegetable2Button);

        vegetable3Button = new JButton("CABBAGE - 180tg/kg");
        vegetable3Button.setBounds(600, 230, 150, 30);
        vegetable3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="CABBAGE - 180tg/kg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+180;
            }
        });
        add(vegetable3Button);

        fruitsLabel = new JLabel("FRUITS:");
        fruitsLabel.setBounds(600, 270, 150, 30);
        add(fruitsLabel);

        fruit1Button = new JButton("APPLE - 400tg/kg");
        fruit1Button.setBounds(600, 310, 150, 30);
        fruit1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="APPLE - 400tg/kg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+400;
            }
        });
        add(fruit1Button);

        fruit2Button = new JButton("BANANAS - 120tg");
        fruit2Button.setBounds(600, 350, 150, 30);
        fruit2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="BANANAS - 120tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+120;
            }
        });
        add(fruit2Button);

        fruit3Button = new JButton("LIMON - 250tg");
        fruit3Button.setBounds(600, 390,150,30);
        fruit3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s+="LIMON - 250tg"+"\n";
                totalProducts.setText(s);
                sumPrice=sumPrice+250;
            }
        });
        add(fruit3Button);

        totalLabel = new JLabel("TOTAL:");
        totalLabel.setBounds(760, 110, 150, 30);
        add(totalLabel);

       /* sumOfPrice = new JTextArea();
        sumOfPrice.setBounds(760, 560, 150, 30);
        add(sumOfPrice);*/

        addButton = new JButton("ADD");
        addButton.setBounds(760, 600, 70, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String surname = surnameText.getText();
                Client client = new Client(name, surname, sumPrice);
                Main.addClient(client);
                nameText.setText("");
                surnameText.setText("");
                sumPrice=0;
                s="";
                totalProducts.setText("");
            }
        });
        add(addButton);

        backButton = new JButton("BACK");
        backButton.setBounds(840, 600, 70, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.buyWindow.setVisible(false);
                Main.frame.menuWindow.setVisible(true);
            }
        });
        add(backButton);
    }
}
