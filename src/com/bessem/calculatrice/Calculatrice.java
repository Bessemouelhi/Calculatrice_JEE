package com.bessem.calculatrice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Calculatrice() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int x;
		int y;
		
		String ope =  request.getParameter("ope");
		int calc = 0;
		double calc2 = 0.0;
		String result = null;
		
		if(request.getParameter("x") != null && !request.getParameter("x").equals(""))
			x =  Integer.parseInt(request.getParameter("x"));
		else
			x = 0;
		
		if(request.getParameter("y") != null && !request.getParameter("y").equals(""))
			y =  Integer.parseInt(request.getParameter("y"));
		else
			y = 0;
		
        switch(ope) 
        { 
            case "additionner": 
        		calc = x + y;
        		result = "Le résultat de l'opération : " + x + " + " + y + " = " + calc;

        		request.setAttribute("result", result);
                break; 
            case "soustraire": 
            	calc = x - y;
        		result = "Le résultat de l'opération : " + x + " - " + y + " = " + calc;
        		
        		request.setAttribute("result", result);
                break; 
            case "multiplier": 
            	calc = x * y;
        		result = "Le résultat de l'opération : " + x + " * " + y + " = " + calc;
        		
        		request.setAttribute("result", result);
                break; 
            case "diviser": 
            	calc2 = (double)x / (double)y;
        		result = "Le résultat de l'opération : " + x + " / " + y + " = " + calc2;
        		
        		request.setAttribute("result", result);
                break; 
        } 
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

}
