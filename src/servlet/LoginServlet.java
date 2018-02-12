package servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet ("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String stMailAddress = request.getParameter("stMailAddress");
		String stPassword = request.getParameter("stPassword");

		//LoginBeanインスタンス（ログイン情報）の作成
//		LoginBean loginInfo = new LoginBean(stMailAddress, stPassword);

		//ログインユーザを取得
		String idLoginUse = LoginLogic.getLoginUserID(stMailAddress, stPassword);

		//ログイン判定（ユーザIDが空の場合はエラー）
		if(idLoginUse.equals("")) {

			//ログイン画面にエラーメッセージを表示
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/");
			dispatcher.forward(request, response);

		} else {

			//Login
			Map mapUserInfo = LoginLogic.getLoginUserInfo(idLoginUse);

			//ユーザ情報をセッションスコープに保存;
			HttpSession session = request.getSession();
			session.setAttribute("userInfo", mapUserInfo);
//			HttpSession session = request.getSession();
//			session.setAttribute("stMailAddress", loginInfo);

			//ホーム画面に遷移
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Home");
			dispatcher.forward(request, response);

		}
	}

}
