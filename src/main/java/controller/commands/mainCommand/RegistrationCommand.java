package controller.commands.mainCommand;

import controller.commands.Command;

import javax.servlet.http.HttpServletRequest;

public class RegistrationCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "/registration.jsp";
    }
}
