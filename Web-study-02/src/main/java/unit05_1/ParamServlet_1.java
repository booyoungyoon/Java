package unit05_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet_1")
public class ParamServlet_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		int A = Integer.parseInt(request.getParameter("A"));
		int B = Integer.parseInt(request.getParameter("B"));
		String name = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println(name+"<br>");
		out.println(A+B);
		out.println("<br>");
		out.println(A*B);
		out.println("<br>");
		out.println(A-B);
		out.println("<br>");
		out.println(A/B);
		out.println("<br>");
		out.print("</body></html>");
	}

}
