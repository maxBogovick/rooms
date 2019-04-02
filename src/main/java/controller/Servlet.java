package controller;

import org.apache.logging.log4j.core.tools.picocli.CommandLine;

import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;

public class Servlet extends HttpServlet {

    private Map<String, CommandLine.Command> commands = new HashMap<>();
}
