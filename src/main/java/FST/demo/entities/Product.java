package FST.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "traca_produits")
public class Product {
	@Id
	private long id;
	@Column(name="num_serie")
	private String sn;
	private String customer;
	private String mvt;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getMvt() {
		return mvt;
	}
	public void setMvt(String mvt) {
		this.mvt = mvt;
	}
	public Product(long id, String sn, String customer, String mvt) {
		super();
		this.id = id;
		this.sn = sn;
		this.customer = customer;
		this.mvt = mvt;
	}
	public Product(String sn, String customer, String mvt) {
		super();
		this.sn = sn;
		this.customer = customer;
		this.mvt = mvt;
	}
	public Product() {
		super();
	}

	
	
}
