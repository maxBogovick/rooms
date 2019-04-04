package controller.commands;

import controller.commands.mainCommand.SignInCommand;
import controller.commands.mainCommand.UnknownCommand;

public class CommandFactory {
    public static final String SIGN_IN = "sign_in";
    public static final String LOGIN_PAGE = "login_page";
    public static final String REGISTRATION_PAGE = "registration_page";
    public static final String REGISTRATION = "registration";
    public static final String SIGN_OUT = "sign_out";
    public static final String ADMIN_HOME_PAGE = "admin_home_page";
    public static final String CLIENT_HOME_PAGE = "client_home_page";
    public static final String CREATE_ORDER = "create_order";
    public static final String CHOSE_APARTMENT_BY_ADMIN = "chose_apartment";
    public static final String SEND_BILL_TO_CLIENT = "create_bill";
    public static final String CLIENT_BILLS_PAGE = "bills-page";
    public static final String CHANGE_LOCALE = "change-locale";
    public static final String BILL_PAYMENT = "billPayment";
    public static final String REJECT_ORDER = "reject-order";

    public static Command createCommand(String command) {

        if (command == null) {
            command = LOGIN_PAGE;
        }

//        switch (command) {
//            case SIGN_IN:
//                return new SignInCommand(UserServiceImpl.getInstance());
//            case CHANGE_LOCALE:
//                return new LocaleCommand();
//            default:
                return new UnknownCommand();
//        }
    }
}
