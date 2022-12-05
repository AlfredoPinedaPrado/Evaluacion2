
public class Client extends Cuenta {
    String name;

    public Client(int cuenta, double inicial, int NIP, String name) {
        super(0, 0, 0);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
