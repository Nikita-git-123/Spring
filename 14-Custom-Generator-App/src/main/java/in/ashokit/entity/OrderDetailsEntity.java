package in.ashokit.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Table(name="Order_details")
@Entity
public class OrderDetailsEntity {
	
	@Id
	@Column(name="ORDER_ID")
	@GenericGenerator(name="order_id_gen", strategy = "in.ashokit.generator.OrderIdGenerator")
	@GeneratedValue(generator="order_id_gen")
	private String orderId;
	
	@Column(name="ORDER_BY")
	private String orderBy;
	
	@Column(name="ORDER_DATE")
	@Temporal(TemporalType.DATE)
	private Date orderDate;

}
