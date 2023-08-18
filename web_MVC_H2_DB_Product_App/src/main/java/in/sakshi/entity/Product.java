package in.sakshi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private Integer Pid;
	private String name;
	private Double price;
	private Integer qty;

}
