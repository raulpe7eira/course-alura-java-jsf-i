package br.com.raulpe7eira.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.raulpe7eira.livraria.dao.DAO;
import br.com.raulpe7eira.livraria.model.Autor;

@ManagedBean
public class AutorBean {

	private Autor autor = new Autor();

	public Autor getAutor() {
		return this.autor;
	}

	public void gravar() {
		System.out.println("Gravando autor " + this.autor.getNome());

		new DAO<Autor>(Autor.class).adiciona(this.autor);
	}
}
