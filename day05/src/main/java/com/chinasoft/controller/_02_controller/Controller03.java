package com.chinasoft.controller._02_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller03 {

	@RequestMapping("/controller03.do")
	public  ModelAndView  method03() {
		System.out.println("�����controller�ĵ�����ʵ�ַ�ʽ������");
		ModelAndView modelAndView = new ModelAndView();
		ModelAndView mav = new ModelAndView();
		//������׼��ת��
		mav.addObject("user", "����");
		//ת��ҳ��
		mav.setViewName("hello.jsp");
		
		return mav;
		
	}
}
