package br.com.prointjsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.swing.JOptionPane;

import br.com.dao.DaoGenerico;
import br.com.proint.Cadastro;

//@ViewScoped
@ManagedBean(name="cadastroBean")

public class CadastroBean {
	
	private Cadastro cadastro = new Cadastro(); // objeto usado para o cadastro
	private DaoGenerico<Cadastro> daoGenerico = new DaoGenerico<Cadastro>();

	public String salvar() {
		daoGenerico.salvar(cadastro);
		cadastro = new Cadastro();
		
		return "";
	}
	
	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public DaoGenerico<Cadastro> getDaoGenerico() {
		return daoGenerico;
	}

	public void setDaoGenerico(DaoGenerico<Cadastro> daoGenerico) {
		this.daoGenerico = daoGenerico;
	}
	
	
	

}
