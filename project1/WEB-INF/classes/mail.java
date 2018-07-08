import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import Mail.*;

public class mail extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            	SendMailSSL s = new SendMailSSL();
            	s.sendmail();
            }
        }