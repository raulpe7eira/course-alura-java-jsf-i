package br.com.raulpe7eira.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.raulpe7eira.livraria.dao.DAO;
import br.com.raulpe7eira.livraria.model.Livro;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();

	public Livro getLivro() {
		return this.livro;
	}

	public void gravar() {
		System.out.println("Gravando livro " + this.livro.getTitulo());

		if (this.livro.getAutores().isEmpty()) {
			throw new RuntimeException("Livro deve ter pelo menos um Autor.");
		}

		new DAO<Livro>(Livro.class).adiciona(this.livro);
	}

}
