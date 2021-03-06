package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddSellerGetHousesServlet
 */
@WebServlet("/addSellerGetHousesServlet")
public class AddSellerGetHousesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSellerGetHousesServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HouseHelper doa = new HouseHelper();
		 request.setAttribute("allHousesToAdd", doa.showAllHouses());
		 String path = "/add-seller.jsp";
		 
		 getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
