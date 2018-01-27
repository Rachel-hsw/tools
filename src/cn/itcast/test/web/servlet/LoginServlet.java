package cn.itcast.test.web.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.itcast.servlet.BaseServlet;


@WebServlet("/LoginServlet")
public class LoginServlet extends BaseServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String verifyCode=request.getParameter("verifyCode");
		String vcode=(String) request.getSession().getAttribute("vCode");
		System.out.println(verifyCode.equalsIgnoreCase(vcode));
		return null;
		
	}

}
