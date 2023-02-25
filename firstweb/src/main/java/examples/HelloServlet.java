package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet") //어노테이션 : url경로 설
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; //java 직렬화 프로토콜에서 사용되는 고유식별자 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");//응답 결과의 컨텐츠타입 알려줌 
		PrintWriter out = response.getWriter(); //printWriter객체 반환
		out.print("<h1>Hello servlet</h1>"); //print할 내용
		
	}

}
