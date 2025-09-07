package com.digitalclock;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/clock")
public class ClockServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get current time
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String currentTime = time.format(formatter);

        // Pass time to JSP
        request.setAttribute("currentTime", currentTime);
        request.getRequestDispatcher("clock.jsp").forward(request, response);
    }
}
