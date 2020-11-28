package br.com.bytebank.model;

public class Client {
	private String name;
	private String cpf;
	private String address;
	private String birthday;
	private String telephone;
	private String emai;
	private String login;
	private String password;
	
	public Client() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "Client [name=" + name + ", cpf=" + cpf + ", address=" + address + ", birthday=" + birthday
				+ ", telephone=" + telephone + ", emai=" + emai + ", login=" + login + ", password=" + password + "]";
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmai() {
		return emai;
	}
	public void setEmai(String emai) {
		this.emai = emai;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
