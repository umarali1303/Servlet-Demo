package com.ServletPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		int z=0;
		
		Cookie[] cookies = req.getCookies();
		for(Cookie c1:cookies) {
			if(c1.getName().equals("z"))
				z=Integer.parseInt(c1.getValue());
		}
		z=z*z;
		PrintWriter p=res.getWriter();
		p.println("Sq z ="+z);
	};
}
