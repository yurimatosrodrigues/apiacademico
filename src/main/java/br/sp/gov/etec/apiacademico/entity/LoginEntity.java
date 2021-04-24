package br.sp.gov.etec.apiacademico.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "tb_login")
public class LoginEntity implements Serializable{

	private static final long serialVersionUID = 7782824127699444986L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private Long Id;
	private String login;
	private String password;
	private String tipo;
	private String nome;
	
	public LoginEntity() {
	}
	
	public LoginEntity(String login, String password, String tipo, String nome) {
		super();
		this.login = login;
		this.password = password;
		this.tipo = tipo;
		this.nome = nome;
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getUsername() {
		return login;
	}
	public void setUsername(String username) {
		this.login = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipoLogin() {
		return tipo;
	}
	
	public void setTipoLogin(String tipoLogin) {
		this.tipo = tipoLogin;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
