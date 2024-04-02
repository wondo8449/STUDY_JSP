package com.servlet.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

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
		int infoNumber = 0, infoAge =0;
		String infoName = null, infoGender = null;
		HashMap<String, Object> resultMap = new HashMap();
		HashMap<String, String> dataMap = new HashMap();
		dataMap.put("infoName", request.getParameter("infoName"));
		dataMap.put("infoAge", request.getParameter("infoAge"));
		dataMap.put("infoGender", request.getParameter("infoGender"));
		
		
		SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
		sqlSession.insert("info.insert", dataMap);
		infoNumber = sqlSession.selectOne("info.getSequence");
		resultMap = sqlSession.selectOne("info.findById", infoNumber);
		
		infoName = (String)resultMap.get("info_name");
		infoAge = (Integer)(resultMap.get("info_age"));
		infoGender = (String)resultMap.get("info_gender");
		
//		request.setAttribute("infoName", resultMap.get("info_name"));
//		request.setAttribute("infoAge", resultMap.get("info_age"));
//		request.setAttribute("infoGender", resultMap.get("info_gender"));
		
//		request.getRequestDispatcher("index.jsp").forward(request, response);
		request.getRequestDispatcher("index.jsp?infoName=" + infoName + "&infoAge=" + infoAge + "&infoGender=" + infoGender).forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
