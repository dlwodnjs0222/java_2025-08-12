package contrler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TinyDAO;
import dto.TinyDTO;

@WebServlet("/")
public class Contrler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Contrler() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = null;
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if(com.equals("/Tinylist.jsp") || com.equals("/")) {
			TinyDAO dao = new TinyDAO();
			List<TinyDTO> list = dao.selectList();
			request.setAttribute("list", list);
			view = "Tinylist.jsp";
			
		}else if (com.equals("/insertFrom")) {
			view = "redirect:insertFrom.jsp";
		}
		
		if(view.startsWith("redirect:")) {
			response.sendRedirect(view.substring(9));
		}else {
			request.getRequestDispatcher(view).forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
