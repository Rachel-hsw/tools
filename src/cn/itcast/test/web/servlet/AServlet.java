package cn.itcast.test.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.servlet.BaseServlet;

/**
 * Servlet implementation class AServlet
 * http://localhost:8080/tools/AServlet?method=regist
 */
@WebServlet("/AServlet")
public class AServlet extends BaseServlet {
	
       
   
	public String regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("regist()..........");
		return null;
		
	}
	  
	public String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("login()..........");
			return null;
			
		}
}
