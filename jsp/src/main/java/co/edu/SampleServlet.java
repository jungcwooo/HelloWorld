package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 이 페이지를 호출하기 위해선 servlet 형태로 
// init 과 service에 기능을 구현
public class SampleServlet extends HttpServlet {
	// IOC

	// 첫 서버 호출시 실행됨
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 호출.....");
	}

	// 서버가 호출될때마다 실행
	// 서비스를 웹브라우저에서 요청이 들어오면 클라이언트의 정보를 가지고 호출
	// 사용자의 정보는 HttpServletRequest의 타입으로 와서 HttpServletResponse로 반환
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		// 응답요청과 요청을 반환하는 텍스트를 <h3> 를 html로 읽어준다
		// 이것을 안해주면 그대로 <h3>~~ 이렇게 출력
		resp.setContentType("text/html;charset=utf-8");
		System.out.println("service 호출....");

		if (req.getMethod().equals("GET"))// 호출 방식을 알아보기 위해 (겟인지 포스트인지)
		{// 주소창에 쳐서 들어가는 것은 GET방식
			System.out.println("GET 요청");

		} else if (req.getMethod().equals("POST")) {
			// form을 통해 인풋 >submit으로 요청되면 POST방식
			// form을 통해 a 태크를 통해 요청되면 GET방식
			System.out.println("POST 요청");

		}

		String name = req.getParameter("name"); //name=??&age=??
		String age = req.getParameter("age");
		
		//servlet 자체가 웹페이지이다
		
		
		PrintWriter out = resp.getWriter(); // 출력스트림
		out.print("<h3>요청파라미터 : "+ name + "</h3>");
		out.print("<h3>요청파라미터 : "+ age + "</h3>");
		
		out.close();
		
		
	}

//	// 만약 service라는 메서드가 없다면 아래처럼 
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doGet(req, resp);
//	}
//	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doPost(req, resp);
//	}

	// 서버가 종료되었을때 실행
	public void destroy() {
		System.out.println("destroy 호출....");
	}
}
