package com.cafe24.mysite1.action.user;

import com.cafe24.mysite1.action.main.MainAction;
import com.cafe24.web.mvc.Action;
import com.cafe24.web.mvc.ActionFactory;

public class UserActionFactory extends ActionFactory {

	//String s = "JoinAction"; String으로 create object
	
	@Override
	public Action getAction(String actionName) {

		Action action = null;
		
		if("joinform".equals(actionName)) {
			
			action = new JoinFormAction();

		} else if("join".equals(actionName)){
			
			action = new JoinAction();
			
		} else if("joinsuccess".equals(actionName)){
			action = new JoinSuccessAction();

		} else if("loginform".equals(actionName)){
			action = new LoginFormAction();

		} else {
			action = new MainAction();
		}
		
		return action;
	}

}
