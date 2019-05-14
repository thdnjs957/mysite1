package com.cafe24.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebUtil {
	
	public static void redirect(HttpServletRequest request, HttpServletResponse response, String url) throws IOException {
		response.sendRedirect(url);
	}
	
	public static void forward(HttpServletRequest request, HttpServletResponse response, String location) throws ServletException, IOException {
		//request 보고 요청 분기시킬라고 dispatcher를 달라고 함
		RequestDispatcher rd = request.getRequestDispatcher(location);
		rd.forward(request, response);
	}
	
}
