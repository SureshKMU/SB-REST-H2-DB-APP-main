package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
public class Product {

	@Id
	private String pid;
	private String pname;
	private Double price;

	public Product() {
	}

	public Product(String pid, String pname, Double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product{" +
				"pid=" + pid +
				", pname='" + pname + '\'' +
				", price=" + price +
				'}';
	}
}
