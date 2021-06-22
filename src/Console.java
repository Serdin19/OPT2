import java.util.ArrayList;

public abstract class Console {

    private String name;
    private String userName;
    private String password;
    static ArrayList<Console> consoles;

    public Console(String name) {
        this.name = name;
        this.consoles = new ArrayList<>();
    }

    public boolean loggedIntoConsole(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();

    public void designConsole(){
        System.out.println("Design van elke console is anders");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
