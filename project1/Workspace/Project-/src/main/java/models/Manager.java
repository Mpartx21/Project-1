package models;

import java.util.Set;

import jakarta.persistence.*;


@Entity
@Table(name = "employee")
public class Manager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mang_id")
	private int id;
	
	@Column(name = "mang_name")
	private String name;
	
	@Column(name = "mang_email")
	private String email;
	
	@Column(name = "mang_password")
	private String password;
	
	@OneToMany(mappedBy = "approved_by")
	private Set<Ticket> respondedTickets;
	
	//Setters && Getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
