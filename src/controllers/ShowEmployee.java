package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Employees;
@WebServlet(name="ShowEmployee", urlPatterns = "/showEmployee")
public class ShowEmployee extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Employees> empList = new ArrayList<>();
		empList.add(new Employees("BinhNguyen", "22.12.2020", "Ha Noi", "/images/binhnguyen.jpg"));
		empList.add(new Employees("NguyenNguyen", "22.12.2020", "Ha Noi", "/images/binhnguyen.jpg"));
		empList.add(new Employees("TienNguyen", "22.12.2020", "Ha Noi", "/images/binhnguyen.jpg"));
		empList.add(new Employees("HoaiPham", "22.12.2020", "Ha Noi", "/images/binhnguyen.jpg"));
		empList.add(new Employees("SieuNhan", "22.12.2020", "Ha Noi", "/images/binhnguyen.jpg"));
		
		req.setAttribute("empList", empList);
		System.out.print(empList.get(1));
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		rd.forward(req, resp);
	}
	
}
