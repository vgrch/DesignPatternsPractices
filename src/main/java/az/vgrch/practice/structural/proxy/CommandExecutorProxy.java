package az.vgrch.practice.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isHasAccess;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String password) {
        if ((user != null && user.equals("vugar")) && (password != null && password.equals("password"))) {
            isHasAccess = true;
        }
        commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String command) throws Exception {
        if (isHasAccess) {
            commandExecutor.runCommand(command);
        } else {
            throw new Exception("Access denied;");
        }
    }

    private static class CommandExecutorImpl implements CommandExecutor {
        @Override
        public void runCommand(String command) throws Exception {
            Runtime.getRuntime().exec(command);
            System.out.println(command + " - executed");
        }
    }
}
