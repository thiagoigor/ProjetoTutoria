package br.com.tutoronline.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tutoronline.entity.Coordenador;
import br.com.tutoronline.model.CoordenadorDAO;
import br.com.tutoronline.resources.FactoryUtil;


@WebServlet({ "/CoordenadorController", "/coordenador" })
public class CoordenadorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CoordenadorController() {
		super();
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;

		//recuperando a action do index.
		String action = request.getParameter("action");

		// para tirar o erro de null exception exception
		if(action == null){
			action="";
		}

		switch (action) {
		case "cadastrar":
			this.cadastrarCoordenador(request, response);
			break;
		case "listar":
			this.listarCoordenador(request, response);
			break;
		case "alterar":
			break;
		case "remover":
			desativarCoordenador(request, response);
			break;
		default:
			rd = request.getRequestDispatcher("/view/coordenador/coordenador.jsp");
			rd.forward(request, response);
			break;
		}
	}

	private void cadastrarCoordenador(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String method = request.getMethod();

		String nome = request.getParameter("nome");
		String matricula = request.getParameter("matricula"); 
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		//boolean ativado = (boolean) request.getParameter("enabled");
		CoordenadorDAO coordenadorDao = FactoryUtil.getInstance().crie(CoordenadorDAO.class);

		Coordenador coordenador = FactoryUtil.getInstance().crie(Coordenador.class).setCoordenador(nome, matricula, email, telefone);;

		RequestDispatcher rd;

		if(coordenadorDao.GraveDados(coordenador)){ 
			request.setAttribute("retorno", "Usuário cadastrado com sucesso.");
		}else{
			request.setAttribute("retorno", "Erro no cadastro.");
		}
		rd = request.getRequestDispatcher("/view/coordenador/coordenador.jsp");

		rd.forward(request, response);

	}

	private boolean desativarCoordenador(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
		return false;
	}

	private boolean listarCoordenador(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{	
		return false;
	}
}