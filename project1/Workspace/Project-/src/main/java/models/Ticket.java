package models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticket_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	private int employee_id;
	
	@Column(name = "status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "approved_by", nullable = false)
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

	public int getApproved_by() {
		return approved_by;
	}

	public void setApproved_by(int approved_by) {
		this.approved_by = approved_by;
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
	

}
