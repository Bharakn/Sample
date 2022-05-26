package cg.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer
{
	@Id
	private int custid;
	@Column(name="cust_name",length=20)
	private String custname;
	@Column(name="address",length=20)
	private String address;
	@OneToOne
	@JoinColumn(name="proid")
	private Product proid;
	@JoinColumn
	private String proname;
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Product getProid() {
		return proid;
	}
	public void setProid(Product proid) {
		this.proid = proid;
	}
}
