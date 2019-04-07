package controller.commands.mainCommand;

import controller.commands.Command;
import model.dao.impl.JDBCUserDao;
import model.entity.User;
import model.entity.types.Role;
import model.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class RegistrationCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {
        //UserService userService = new UserService();
        String nameFromRequest = request.getParameter("name");
        String passFromRequest = request.getParameter("pass");

        User user = new User();
        user.setLogin(nameFromRequest);
        user.setPassword(passFromRequest);
        user.setEmail("mail.ua");
        //user.setRole(Role.ADMIN);

        JDBCUserDao jdbcUserDao = new JDBCUserDao();
        try {
            jdbcUserDao.create(user);
            System.out.println("=================");
        } catch (SQLException e) {
            System.out.println("----------------");
            e.printStackTrace();
        }

        //userService.login(user);

        return "/registration.jsp";
    }
}
