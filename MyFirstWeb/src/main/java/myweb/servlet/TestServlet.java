
// myweb.servlet.TestServlet

package myweb.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class TestServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			out.println( "<h2>I am clever!</h2>" );
			out.flush();
			out.close();
			}
}
