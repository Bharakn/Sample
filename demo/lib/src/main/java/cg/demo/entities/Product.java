package cg.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author bharakn
 *
 */
@Entity
@Table(name="product")
public class Product 
{
	@Id
   private int proid;
	@Column(name="product_name",length=20)
   private String proname;
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	
}
