package controller.commands.mainCommand;

import controller.commands.Command;

import javax.servlet.http.HttpServletRequest;

public class AdminHomePageCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "/error.jsp";
    }
}

