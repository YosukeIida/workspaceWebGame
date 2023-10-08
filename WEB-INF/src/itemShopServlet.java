import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/itemShopServlet")
public class itemShopServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 文字コードの設定
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

		// 出力用の設定
		PrintWriter out = resp.getWriter();

		// 入力
		String str = req.getParameter("item");
		int item = Integer.parseInt(str);


		// 出力
		out.println("<!DOCTYPE html>");
		out.println("<html lang=ja>");
		
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"src/css/itemShopServlet.css\"> ");
		out.println("<title>territory.io</title>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<div>");

		out.println("<div class=\"title\">TERRITORY.IO テリトリオ</div>");
		out.println("<div>");
		if (item == 1) {
			out.println("<div class=text>");
			out.println("エルリックは新しい冒険に備えて、力強い剣を手に入れることを決意しました。彼はヴァリアンティア大陸にある有名な武器鍛冶の店に足を運びました。"
					+ "エルリックはパワーが100レベルアップしました");
			out.println("</div>");
			out.println("<img class=\"image\" src=\"img/sword.jpg\">\n"
					+ "</div>");
			out.println("<div>");
			out.println("<a class=\"backLink\" href=\"src/top.html\">キャンプ地にもどる</a>\n"
					+ "</div>");
		} else {
			out.println("<div class=text>");
			out.println("エルリックは新たな冒険に挑むため、魔法の鎧を手に入れることを決意しました。"
					+ "店は薄暗い光が差し込む中、エルリックを出迎えました。彼女は鎧の制作に専念し、エルリックの存在に気付くと微笑みました。"
					+ "「エルリック、お前がここに来ることを待っていた。新しい魔法の鎧を作っておこう。」\n"
					+ "\n"
					+ "セリーナはエルリックの体型を測り、彼の要望に合わせて鎧を仕立てました。数日後、エルリックはセリーナから渡された魔法の鎧を身に着けました。それは軽く、しかし驚くほど頑丈で、魔法のシンボルと宝石が埋め込まれた美しいものでした。\n"
					+ "\n"
					+ "エルリックは鎧を身に纏い、その瞬間から魔法のエネルギーが彼を包み込みました。彼は不可視のバリアで保護され、力強い魔法の力を感じました。鎧が彼の冒険を劇的に変えることを確信しました。"
					+ "彼のレベルは一段と上がり、魔法の鎧はエルリックを無敵の勇者へと変貌させました。彼はヴァリアンティア大陸の未知の冒険に臆せず挑み、その鎧は新たな伝説の始まりを告げました。");
			out.println("</div>");
			out.println("<img class=\"image\" src=\"img/armor.jpg\">\n"
					+ "</div>");
			out.println("<a class=\"backLink\" href=\"src/top.html\">キャンプ地にもどる</a>\n"
					+ "</div>");
		}
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}
}

//	</div>
//	<div>
//		<img id="image" src="../img/itemshop.jpg">
//	</div>
//
//	</div>
//</body>
//
//</html>