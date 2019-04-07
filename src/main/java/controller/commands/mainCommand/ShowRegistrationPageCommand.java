package controller.commands.mainCommand;

import controller.commands.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

public class ShowRegistrationPageCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "/registration.jsp";
    }
}
