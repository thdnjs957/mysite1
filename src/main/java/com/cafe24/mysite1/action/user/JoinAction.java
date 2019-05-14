package com.cafe24.mysite1.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cafe24.mysite1.dao.UserDao;
import com.cafe24.mysite1.vo.GuestbookVo;
import com.cafe24.mysite1.vo.UserVo;
import com.cafe24.web.WebUtil;
import com.cafe24.web.mvc.Action;

public class JoinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		
		UserVo vo = new UserVo();
		vo.setName(name);
		vo.setPassword(email);
		vo.setPassword(password);
		vo.setPassword(gender);
		
		new UserDao().insert(vo);
		
		WebUtil.redirect(request, response, request.getContextPath()+"/user?a=joinsuccess");
	
	}

}
