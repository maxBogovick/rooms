package controller.commands.mainCommand;

import controller.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RoomListCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {


       return "/roomList.jsp";
    }
}
