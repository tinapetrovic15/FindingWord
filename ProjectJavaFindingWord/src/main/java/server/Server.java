package server;

import org.example.FindingWordByHashMap;
import org.example.FindingWordByList;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet("/Server")
@MultipartConfig
public class Server extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Server() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        String input = request.getParameter("input").toString();
        String word = request.getParameter("word").toString();
        System.out.println(input+" "+word);

        FindingWordByHashMap findingWordByHashMap = new FindingWordByHashMap();
        FindingWordByList findingWordByList = new FindingWordByList();
        int numberOfAppearances = 0;
        try {
            numberOfAppearances = findingWordByList.findingWord(input,word);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        writer.println("<html><head></head><body>" + numberOfAppearances + "</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
