package co.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
@WebServlet("/todolist")
public class ToDoListServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		Gson gson = new GsonBuilder().create();
		
		ToDoListDAO dao = new ToDoListDAO();
		
		if(req.getMethod().equals("GET")) {
			List<ToDoList> list = dao.toDoList();
			out.print(gson.toJson(list));
			
		} else if(req.getMethod().equals("POST")) {
			ToDoList todo =new ToDoList();
			
			String ti = req.getParameter("title");
			String listNo = req.getParameter("listNo");
			String cmd = req.getParameter("cmd");
			System.out.println(cmd);
			if (cmd.equals("submit")) {
	
			todo.setTitle(ti);
			
			dao.insertList(todo);
			
			}else if (cmd.equals("delete")) {
//				todo.setTitle(ti);
				todo.setListNo(Integer.parseInt(listNo));
				
				dao.deleteList(todo);
				
				
			}else if (cmd.equals("deleteNow")) {
				todo.setTitle(ti);
//				todo.setListNo(Integer.parseInt(listNo));
				
				dao.deleteListNow(todo);
				
				
			}
		}
		
	}
	
}
