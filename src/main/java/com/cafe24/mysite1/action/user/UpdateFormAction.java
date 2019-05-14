package com.cafe24.mysite1.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cafe24.mysite1.dao.UserDao;
import com.cafe24.mysite1.vo.UserVo;
import com.cafe24.web.WebUtil;
import com.cafe24.web.mvc.Action;

public class UpdateFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long no = Long.parseLong(request.getParameter("no"));
		
		UserVo vo = new UserDao().get(no);
		String email = vo.getEmail();
		String password = vo.getPassword();
		
		request.setAttribute("email", email);
		request.setAttribute("password", password);
		
		
		WebUtil.forward(request, response, "/WEB-INF/views/user/updateform.jsp");

	}

	
}
