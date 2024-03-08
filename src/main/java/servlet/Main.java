package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Movie;
import model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = this.getServletContext();
		List<Movie> movieList = (List<Movie>)application.getAttribute("movieList");
	
		if (movieList == null) {
			movieList = new ArrayList<Movie>();
		}

		// セッションスコープからユーザー情報取得
		HttpSession session = request.getSession();
		User loginUser = (User)session.getAttribute("loginUser");
		if (loginUser != null) {
			// ログイン済みの場合フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/main.jsp");
			dispatcher.forward(request, response);
		} else {
			// Top画面へリダイレクト
			response.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
