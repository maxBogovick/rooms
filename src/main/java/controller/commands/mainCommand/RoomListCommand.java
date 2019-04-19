package controller.commands.mainCommand;

import controller.commands.Command;
import controller.commands.mainCommand.util.Util;
import model.entity.Room;
import model.service.RoomService;
import model.service.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class RoomListCommand implements Command {

    private final RoomService roomService = ServiceFactory.getRoomService();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        List<Room> rooms = roomService.getAllRooms();
        request.setAttribute("rooms", rooms);
        return ROOM_LIST_JSP;
    }
}
