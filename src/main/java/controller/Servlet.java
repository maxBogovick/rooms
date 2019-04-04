package controller;

import controller.commands.Command;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;

import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;

public class Servlet extends HttpServlet {

    private Map<String, Command> commands = new HashMap<>();


}
