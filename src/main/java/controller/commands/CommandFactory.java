package controller.commands;

import controller.commands.mainCommand.LogOutCommand;
import controller.commands.mainCommand.RegistrationCommand;
import controller.commands.mainCommand.SignInCommand;
import controller.commands.mainCommand.UnknownCommand;
import controller.commands.mainCommand.util.Util;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class CommandFactory {
    private static volatile CommandFactory commandFactory;

    private static Map<String, Command> commands = new HashMap<>();

    static {
        commands.put(Util.LOGIN_PAGE.getPath(), new SignInCommand());
        commands.put(Util.REGISTRATION.getPath(), new RegistrationCommand());
        commands.put(Util.LOG_OUT.getPath(), new LogOutCommand());
        commands.put(Util.ERROR_PAGE.getPath(), new UnknownCommand());
    }

    public static Command getCommand(String url) {
        Command command = commands.getOrDefault(url, r ->"/index.jsp");
//        logger.info(String.format("get command by url = %s", url));

        if( command == null){
            return new UnknownCommand();
        }

        return command;

    }
}
