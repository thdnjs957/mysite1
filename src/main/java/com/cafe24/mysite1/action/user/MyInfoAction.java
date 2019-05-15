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

public class MyInfoAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		
		Long no = Long.parseLong(request.getParameter("no"));
		
		System.out.println(no);
		UserVo vo = new UserDao().get(no);
		
		System.out.println(vo.getName());
		
		request.setAttribute("vo", vo);
		
		WebUtil.forward(request, response, "/WEB-INF/views/user/myinfo.jsp");
	}
}
