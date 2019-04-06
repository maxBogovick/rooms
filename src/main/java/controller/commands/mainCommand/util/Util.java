package controller.commands.mainCommand.util;

public enum Util {

    SIGN_IN("/view/sign_in"),
    LOGIN_PAGE("login"),
    ERROR_PAGE("/view/arror_page"),
    REGISTRATION("/view/registration"),
    LOG_OUT("/view/log_out"),
    ADMIN_HOME_PAGE("/view/admin_home_page"),
    CLIENT_HOME_PAGE("/view/client_home_page"),
    CREATE_ORDER("/view/create_order"),
    CHOSE_APARTMENT_BY_ADMIN("/view/chose_apartment"),
    SEND_BILL_TO_CLIENT("/view/create_bill"),
    CLIENT_BILLS_PAGE("/view/bills-page"),
    CHANGE_LOCALE("/view/change-locale"),
    BILL_PAYMENT("/view/billPayment"),
    REJECT_ORDER("/view/reject-order");


    private String path;

    Util(String path){
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

