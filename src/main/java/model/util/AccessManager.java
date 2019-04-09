package model.util;

import model.entity.types.Role;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessManager {
    private static final Map<String, List<String>> CommandMap = new HashMap<>();
    private final static Logger LOGGER = LogManager.getLogger(AccessManager.class);


    static {
        init();
    }

    private static void init() {
        List<String> adminCommand = new ArrayList<>();
        adminCommand.add("login_submit");
        adminCommand.add("login");
        adminCommand.add("error");
        adminCommand.add("registration");
        adminCommand.add("show_registration");
        adminCommand.add("log_out");
        adminCommand.add("info_page");
        adminCommand.add("room_list");
        adminCommand.add("admin_home_list");

        List<String> userCommand = new ArrayList<>();
        userCommand.add("login_submit");
        userCommand.add("login");
        userCommand.add("error");
        userCommand.add("registration");
        userCommand.add("show_registration");

        List<String> visitorCommand = new ArrayList<>();
        visitorCommand.add("login_submi");
        visitorCommand.add("login");
        visitorCommand.add("error");
        visitorCommand.add("registration");
        visitorCommand.add("login");
        visitorCommand.add("show_registration");


        CommandMap.put("admin", adminCommand);
        CommandMap.put("user", userCommand);
        CommandMap.put("visitor", visitorCommand);
    }


    public boolean isSecuredPage(String urlPattern) {
        for (Role role : Role.values()) {
            if (urlPattern.contains(role.toString().toLowerCase())) {
                LOGGER.debug("Page is secured");
                return true;
            }
        }
        LOGGER.debug("Page isn't secured");
        return false;
    }

    public boolean checkPermission(String urlPattern, String role) {
        if (urlPattern.contains(role)) {
            String command = urlPattern.replaceFirst(".*/", "");
            return CommandMap.get(role.toLowerCase()).contains(command);
        }
        return false;
    }
}
