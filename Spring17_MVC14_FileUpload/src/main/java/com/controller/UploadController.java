package com.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.dto.UploadDTO;

@Controller
public class UploadController {

	//http://localhost:8099/app/uploadForm
	
	@GetMapping("/uploadForm")
	public String uploadForm() {
		return "uploadForm";  // /WEB-INF/views/uploadForm.jsp
	}
	
	@PostMapping("/upload")
	public String upload(UploadDTO dto) {
		
		//자동으로 DTO에 저장된 값을 불러오기
		String theText = dto.getTheText();
		CommonsMultipartFile theFile = 	dto.getTheFile();
		
		//파일정보
		long size = theFile.getSize();
		String name = theFile.getName();
		String originalFilename = theFile.getOriginalFilename();
		String contentType = theFile.getContentType();

		System.out.println(theText);
		System.out.println(size);
		System.out.println(name);
		System.out.println(originalFilename);
		System.out.println(contentType);
		
		//저장할 경로 지정
		File f = new File("c:\\upload", originalFilename);
		
		//theFile.transferTo(f);에 예외처리
		try {
			theFile.transferTo(f);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return "uploadForm";  // /WEB-INF/views/uploadForm.jsp
	}
}
