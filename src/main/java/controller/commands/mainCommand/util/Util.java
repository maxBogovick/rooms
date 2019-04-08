package controller.commands.mainCommand.util;

public enum Util {

    SIGN_IN("login_submit"),
    LOGIN_PAGE("login"),
    ERROR_PAGE("arror"),
    REGISTRATION("registration"),
    SHOW_REGISTRATION("show_registration"),
    LOG_OUT("log_out"),

    ADMIN_HOME_PAGE("admin_home_page"),
    CLIENT_HOME_PAGE("client_home_page"),
    CREATE_ORDER("create_order"),
    CHOSE_APARTMENT_BY_ADMIN("chose_apartment"),
    SEND_BILL_TO_CLIENT("create_bill"),
    CLIENT_BILLS_PAGE("bills-page"),
    CHANGE_LOCALE("change-locale"),
    BILL_PAYMENT("billPayment"),
    REJECT_ORDER("reject-order");


    private String path;

    Util(String path){
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

