package br.com.tutoronline.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tutoronline.model.CoordenadorDAO;
import br.com.tutoronline.resources.FactoryUtil;


@WebServlet({ "/CoordenadorController", "/coordenador" })
public class CoordenadorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CoordenadorController() {
		super();
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CoordenadorDAO d = FactoryUtil.getInstance().crie(CoordenadorDAO.class);
	}
}