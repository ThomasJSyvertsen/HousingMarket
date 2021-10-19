package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.util.ArrayList;
import java.util.List;

import model.House;
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

    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HouseHelper hh = new HouseHelper();
    	request.setAttribute("allHouses", hh.showAllHouses());
    	String path = "/viewSellersServlet";
    	Seller seller;
    	
    	if(hh.showAllHouses().isEmpty()) {
			request.setAttribute("allHouses", "");
			path = "/index.html";
		}
    	
		String fName = request.getParameter("sellerFirstName");
		String lName = request.getParameter("sellerLastName");
		String houseString = request.getParameter("allHousesToAdd");
		
		if (houseString != null) {
			House house = hh.searchForHouseById(Integer.parseInt(houseString));

			List<House> houseList;
			
			houseList = new ArrayList<House>();
			
			houseList.add(house);
			
			seller = new Seller(fName, lName, houseList);
		} else {
			seller = new Seller(fName, lName);
		}
		
		SellerHelper sh = new SellerHelper();
		sh.insertSeller(seller);
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
