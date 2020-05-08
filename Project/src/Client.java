public class Client {
    private String name;
    private String surname;
    private int sum;

    public Client(){

    }

    public Client(String name, String surname, int sum) {
        this.name = name;
        this.surname = surname;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String toString(){
        return name + " " + surname + " " + sum;
    }
}
