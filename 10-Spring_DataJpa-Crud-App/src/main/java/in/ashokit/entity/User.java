package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="User_Info")
public class User {
	
	@Id
	@Column(name="User_Id")
	private Integer id;
	private String name;
	private String gender;
	private String counter;  //country
	
	@CreationTimestamp
	@Column(updatable=false)
	private LocalDate createdAt;
	
	@UpdateTimestamp
	@Column(insertable=false)
	private LocalDate lastUpdated;

}
