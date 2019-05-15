package com.cafe24.mysite1.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cafe24.mysite1.dao.UserDao;
import com.cafe24.mysite1.vo.GuestbookVo;
import com.cafe24.mysite1.vo.UserVo;
import com.cafe24.web.WebUtil;
import com.cafe24.web.mvc.Action;

public class UpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		Long no = Long.parseLong(request.getParameter("no"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserVo vo = new UserVo(); 
		
		vo.setNo(no);
		vo.setEmail(email);
		vo.setPassword(password);
		
		boolean updateCheck = new UserDao().update(vo);
		
		WebUtil.forward(request, response, "/WEB-INF/views/main/index.jsp");
		
		/*
		 * if(updateCheck) { WebUtil.forward(request, response,
		 * request.getContextPath()+"/user/"); }
		 */
		
	}
}
