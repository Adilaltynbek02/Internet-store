public class Main {
    public static MainFrame frame;
    public static Client[] clients = new Client[50];
    public static int clCount = 0;
    public static void addClient(Client cl){
        clients[clCount++] = cl;
    }
    public static void main(String[] args){
        frame = new MainFrame();
        frame.setVisible(true);
    }
}
