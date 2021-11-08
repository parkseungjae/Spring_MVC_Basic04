package com.care.root;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@GetMapping("login")
	public String login() {
		return "login/login";
	}

	@PostMapping("chkUser")
	public String chkUser(@RequestParam String id, @RequestParam String pwd, HttpSession session) {
		String msg;
		String db_id = "1", db_pwd = "1", db_nick = "홍길동";
		if (id.equals(db_id) && pwd.equals(db_pwd)) {
			session.setAttribute("loginId", db_id);
			session.setAttribute("loginNick", db_nick);
			return "redirect:main";
		} else {
			return "redirect:login";
		}
	}

	@RequestMapping("main")
	public String main(HttpSession session, HttpServletResponse response) {

		if (session.getAttribute("loginId") != null) {
			return "login/main";
		}
		return "redirect:login";

	}

	@RequestMapping("logout")
	public  void logout(HttpSession session, HttpServletResponse response) {
		
		session.invalidate();
		PrintWriter out = null;
		response.setContentType("text/html; charset=utf-8");
		try {
			out = response.getWriter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.print("<script>alert('1111로그아웃 되었습니다');"
				+"location.href='login'; </script>");
		
		//return "login/logout";
	}
}
