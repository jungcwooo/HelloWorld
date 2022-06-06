package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testServ")
public class TestServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/xml;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		// JSON : [{"name":"홍길동","age":"25"},{"name":"팥빙수","age":"20"}]
//		out.print("[{\"name\":\"홍길동\",\"age\":\"25\"},{\"name\":\"팥빙수\",\"age\":\"20\"}]");
		
		// XML : <data><name>홍길동</name><age>27</age><name>팥빙수</name><age>22</age></data> 
		out.print("<data><name>홍길동</name><age>27</age><name>팥빙수</name><age>22</age></data>");
	}
	
	@Override
	public void destroy() {
		
	}
}
