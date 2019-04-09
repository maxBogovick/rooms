package controller.commands.mainCommand;

import controller.commands.Command;
import model.dao.mapper.RoomMapper;
import model.entity.Room;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RoomListCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {



       return "/roomList.jsp";
    }
}
