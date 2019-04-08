package controller.commands.mainCommand;

import controller.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignInCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "/login.jsp";
    }
}
