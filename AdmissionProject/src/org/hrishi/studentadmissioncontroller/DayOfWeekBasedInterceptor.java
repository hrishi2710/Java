package org.hrishi.studentadmissioncontroller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object Handler) throws Exception{
		
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		
		if(dayOfWeek == 1) {
			response.getWriter().write("The website is closed on sunday!");
			return false;
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object Handler, ModelAndView modelAndView) throws Exception{
		System.out.println("PostHandle method called for"+ request.getRequestURI().toString());
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
			Object Handler, Exception ex) throws Exception{
		System.out.println("AfterCompletion method called for"+ request.getRequestURI().toString());
	}
}
