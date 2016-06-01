package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;



@WebServlet("/select")
public class select extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public select() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html,charset=UTF-8");
		String quantity = request.getParameter("quantity");
		System.out.println(quantity);
		
			DAO dao = new GuitarImpl();
			request.setAttribute("list", dao.queryGoods(quantity));
			System.out.print(dao.queryGoods(quantity));
			request.getRequestDispatcher("check.jsp").forward(request, response);
		
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}