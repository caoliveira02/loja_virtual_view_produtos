package br.com.alura.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

public class ProdutoController {

	private ProdutoDAO pordutoDAO;
	
	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.pordutoDAO = new ProdutoDAO(connection);		
	}
		
	public void deletar(Integer id) {
		System.out.println("Deletando produto");
		this.pordutoDAO.deletar(id);
	}

	public void salvar(Produto produto) {
		System.out.println("Salvando produto");
		this.pordutoDAO.salvar(produto);
	}
	
	public List<Produto> listar() {
		return this.pordutoDAO.listar();
	}

	/*public List<Produto> listar() {
		List<Produto> produtos = 
				new ArrayList<Produto>();
		produtos.add(new Produto("Nome do Produto de teste"
				, "Descri??o do produto de teste"));
		return produtos;
	}*/

	public void alterar(String nome, String descricao, Integer id) {
		System.out.println("Alterando produto");
		this.pordutoDAO.alterar(nome, descricao, id);
	}
}
