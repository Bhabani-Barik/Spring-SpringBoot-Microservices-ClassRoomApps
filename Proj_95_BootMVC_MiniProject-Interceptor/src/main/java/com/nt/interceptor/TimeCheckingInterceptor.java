package com.nt.interceptor;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class TimeCheckingInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		System.out.println("TimeCheckingInterceptor.preHandle()");
		  //get System  Date and Time
		LocalTime  time=LocalTime.now();
		 //get current hour of the day
		int hour=time.getHour();
		if(hour<9  || hour>17) {
			 RequestDispatcher  rd=req.getRequestDispatcher("/timeout.jsp");
			 rd.forward(req, res);
			 return false;
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler,
			ModelAndView mav) throws Exception {
		System.out.println("TimeCheckingInterceptor.postHandle()");
		  mav.addObject("sysDate", LocalDate.now());
		}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, 
			                    Exception ex)
			throws Exception {
		System.out.println("TimeCheckingInterceptor.afterCompletion()");
	}

}
