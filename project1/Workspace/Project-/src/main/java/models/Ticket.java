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
	
	@ManyToOne(targetEntity = Employee.class)
	@JoinColumn(name = "employee_id", nullable = true)
	private int employee_id;
	
	@Column(name = "status")
	private String status;
	
	@ManyToOne(targetEntity = Manager.class)
	@JoinColumn(name = "mang_id", nullable = true)
	private int mang_id;
	
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
		return mang_id;
	}

	public void setMang_id(int mang_id) {
		this.mang_id = mang_id;
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
