package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Seller;

/**
 * Servlet implementation class AddSellerServlet
 */
@WebServlet("/addSellerServlet")
public class AddSellerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSellerServlet() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HouseHelper hh = new HouseHelper();
    	request.setAttribute("allHouses", hh.showAllHouses());
    	String path = "/add-seller.jsp";
    	
    	if(hh.showAllHouses().isEmpty()) {
			request.setAttribute("allHouses", "");
			path = "index.html";
		}
    	
    	
    	getServletContext().getRequestDispatcher(path).forward(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		//String fName = request.getParameter("sellerFirstName");
		//String lName = request.getParameter("sellerLastName");
		
		//Seller seller = new Seller(fName, lName);
		//SellerHelper sh = new SellerHelper();
		//sh.insertSeller(seller);
		
		//getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
