package az.vgrch.practice.structural.proxy;

public class TestProxy {

    public static void main(String[] args) {
        try {
            CommandExecutorProxy proxy = new CommandExecutorProxy("vugar","password");

            proxy.runCommand("cmd.exe /c echo hello");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
