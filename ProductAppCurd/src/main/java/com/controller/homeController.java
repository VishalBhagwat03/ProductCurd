package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.ProductDao;
import com.model.Product;

@Controller
public class homeController {

	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String index(Model m) {
		List<Product> products= productDao.getProducts();
		m.addAttribute("products", products);
		return "index";
	}
	
	@RequestMapping("add-form")
	public String addProduct() {
		return "add_Product_form";
	}
	
	//Handel Product
	@RequestMapping(value = "/handel-product",method = RequestMethod.POST)
	public RedirectView handelProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		RedirectView redirectView = new RedirectView();
		productDao.createProduct(product);
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
}
