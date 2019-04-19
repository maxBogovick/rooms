package model.service;

import model.dao.DaoFactory;
import model.service.impl.RoomServiceImpl;
import model.service.impl.UserServiceImpl;

public final class ServiceFactory {

    private static final DaoFactory daoFactory = DaoFactory.getInstance();

    private ServiceFactory() {}

    public static RoomService getRoomService() {
        RoomService service = new RoomServiceImpl(daoFactory);
        return service;
    }

    public static UserService getUserService() {
        UserService service = new UserServiceImpl(daoFactory);
        return service;
    }
}
