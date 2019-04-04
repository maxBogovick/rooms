package model.dao;

import model.dao.impl.JDBCDaoFactory;

import java.sql.Connection;

public abstract class DaoFactory {
    private static DaoFactory daoFactory;

    public abstract UserDao createUserDao();
    public abstract RoomDao createRoomDao();

//    public abstract UserDAO getUserDAO();
//
//    public abstract ApartmentDAO getApartmentDAO();
//
//    public abstract OrderDAO getOrderDAO();
//
//    public abstract BillDAO getBillDAO();
//
//    public abstract Connection getConnection();


    public static DaoFactory getInstance(){
        if( daoFactory == null ){
            synchronized (DaoFactory.class){
                if(daoFactory==null){
                    DaoFactory temp = new JDBCDaoFactory();
                    daoFactory = temp;
                }
            }
        }
        return daoFactory;
    }
}
