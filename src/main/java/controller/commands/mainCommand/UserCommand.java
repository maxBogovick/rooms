package controller.commands.mainCommand;

import controller.commands.Command;
import model.entity.User;
import model.service.UserService;
import model.util.Constants;

import javax.servlet.http.HttpServletRequest;

public class UserCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        UserService userService = new UserService();
        String nameFromRequest = request.getParameterValues("name")[0];
        String passFromRequest = request.getParameterValues("pass")[0];
        User user = userService.login(nameFromRequest).get();
        String password = user.getPassword();
        if (Constants.getPwdHash(passFromRequest).equals(password)){
            return "/user.jsp";
        }
        return "/login.jsp";
    }
}
