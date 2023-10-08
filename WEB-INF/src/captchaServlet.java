import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/captchaServlet" })
public class captchaServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// 文字コードの設定
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

//		// 出力のための設定
//		PrintWriter out = resp.getWriter();

		// 入力
		String check_1 = req.getParameter("check1");
		String check_2 = req.getParameter("check2");
		String check_3 = req.getParameter("check3");
		String check_4 = req.getParameter("check4");
		String check_5 = req.getParameter("check5");
		String check_6 = req.getParameter("check6");
		String check_7 = req.getParameter("check7");
		String check_8 = req.getParameter("check8");
		String check_9 = req.getParameter("check9");
		int check1 = Integer.parseInt(check_1);
		int check2 = Integer.parseInt(check_2);
		int check3 = Integer.parseInt(check_3);
		int check4 = Integer.parseInt(check_4);
		int check5 = Integer.parseInt(check_5);
		int check6 = Integer.parseInt(check_6);
		int check7 = Integer.parseInt(check_7);
		int check8 = Integer.parseInt(check_8);
		int check9 = Integer.parseInt(check_9);

		// 出力
		if ((check1 == 1) && (check2 == 0) && (check3 == 1) &&
				(check4 == 0) && (check5 == 1) && (check6 == 1) &&
				(check7 == 1) && (check8 == 0) && (check9 == 1)) {
			resp.sendRedirect("./index.html");
		} else {
			resp.sendRedirect("./src/captcha.html");
		}
	}
}