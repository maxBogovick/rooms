package model.service;

import model.dao.DaoFactory;
import model.dao.RoomDao;
import model.entity.Room;

import java.util.List;

public interface RoomService {

    List<Room> getAllRooms();
}
