package com.servlet.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
//		System.out.println(request.getParameter("userName"));
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		out.print("<h2>" + request.getParameter("userName") + "님 환영합니다. </h2>");
//		out.close();
//		request.getRequestDispatcher("").forward(request, response); : forward 방식은 request객체를 그대로 화면까지 전달한다
//		response.sendRedirect(""); : redirect방식은 request객체를 초기화 한 후 화면으로 이동한다
		request.setAttribute("userName", request.getParameter("userName"));
		request.setAttribute("userAge", Integer.valueOf(request.getParameter("userAge")) -1);
		request.setAttribute("gender", request.getParameter("gender"));
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
