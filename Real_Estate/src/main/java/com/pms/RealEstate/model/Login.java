package com.pms.RealEstate.model;

import javax.persistence.*;


@Entity
public class Login {

    @Id
    private String email_id;

    @Column(nullable = false)
    private String password;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "email_id")
    @MapsId
    private Accounts accounts;

    
    
    
	public Login() {
		super();
	}

	public Login(String email_id, String password, Accounts accounts) {
		super();
		this.email_id = email_id;
		this.password = password;
		this.accounts = accounts;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Login [email_id=" + email_id + ", password=" + password + ", accounts=" + accounts + "]";
	}

    
    
    
}

