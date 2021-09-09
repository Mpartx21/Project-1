package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tickets")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticket_id")
	private int id;
	

	
	
	@Column(name = "status")
	private String status;
	

	
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "desc")
	private String description;
	
	@Column(name = "submitted", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date submitted;
	
	
	
	
	@Column(name = "type")
	private String type;
	
	
//	Setters && Getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getSubmitted() {
		return submitted;
	}

	public void setSubmitted(Date submitted) {
		this.submitted = submitted;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	
}
