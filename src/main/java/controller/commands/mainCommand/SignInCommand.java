package controller.commands.mainCommand;

import controller.commands.Command;
import model.entity.User;
import model.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignInCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) {


//        System.out.println(user.getRole());
        return "/login.jsp";
    }
}
