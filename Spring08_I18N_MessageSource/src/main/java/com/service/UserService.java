package com.service;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class UserService implements MessageSourceAware {

	//implements MessageSourceAware => 메인이 아닌 임의의 일반 클래스에서 I18N 사용하기
	
	MessageSource ctx;
	
	@Override
	public void setMessageSource(MessageSource messageSource) {
		// 자동으로 MessageSource변수에 ApplicationContext가 주입됨
		this.ctx = messageSource;
	}

	public void info() {
		String mesg = ctx.getMessage("greeting", null, null, Locale.KOREA);
		System.out.println(mesg);
		String mesg2 = ctx.getMessage("greeting", null, null, Locale.ENGLISH);
		System.out.println(mesg2);
		
	}
}
