package com.chinasoft.controller._02_controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Controller01 implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("controller �ĵ�һ��ʵ�ַ�ʽ��������");
		
		ModelAndView mav = new ModelAndView();
		//������׼��ת��
		mav.addObject("user", "����");
		//ת��ҳ��
		mav.setViewName("hello.jsp");
		return mav;
	}

}
