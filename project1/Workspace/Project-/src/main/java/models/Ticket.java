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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticket_id")
	private int id;
	

	@Column(name = "employee_id", nullable = true)
	protected int employee_id;
	
	@Column(name = "status")
	private String status;
	

	@Column(name = "approved_by", nullable = true)
	private int approved_by;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "desc")
	private String description;
	
	@Column(name = "submitted", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date submitted;
	
	@Column(name = "responded", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date responded;
	
	@Column(name = "reason")
	private String reason;
	
	@Column(name = "type")
	private String type;
	
	
//	Setters && Getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getMang_id() {
		return approved_by;
	}

	public void setMang_id(int mang_id) {
		this.approved_by = mang_id;
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

	public Date getResponded() {
		return responded;
	}

	public void setResponded(Date responded) {
		this.responded = responded;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
