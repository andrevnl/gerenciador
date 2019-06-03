package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
		if (paramAcao.equals("ListaEmpresas")) {
			System.out.println("Listando Empresas");
			ListaEmpresas listaEmpresas = new ListaEmpresas();
			listaEmpresas.executa(request, response);
		} else if (paramAcao.equals("RemoveEmpresa")) {
			System.out.println("Removendo Empresas");
			RemoveEmpresa removeEmpresa = new RemoveEmpresa();
			removeEmpresa.executa(request, response);
		} else if (paramAcao.equals("MostraEmpresa")) {
			System.out.println("Mostrando Empresa");
			MostraEmpresa mostraEmpresa = new MostraEmpresa();
			mostraEmpresa.executa(request, response);
		} else if (paramAcao.equals("AlteraEmpresa")) {
			System.out.println("Alterando Empresa");
			AlteraEmpresa alteraEmpresa = new AlteraEmpresa();
			alteraEmpresa.executa(request, response);
		} else if (paramAcao.equals("NovaEmpresa")) {
			System.out.println("Criando nova Empresa");
			NovaEmpresa novaEmpresa = new NovaEmpresa();
			novaEmpresa.executa(request, response);
		}
	}

}
