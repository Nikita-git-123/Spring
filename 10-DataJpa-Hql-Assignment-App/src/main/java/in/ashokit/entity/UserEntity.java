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
@Table(name="UserDetails")
public class UserEntity {

	@Id
	private Integer id;
	private String name;
	private String country;
	private String gender;
	
	@CreationTimestamp
	@Column(insertable=false)
	private LocalDate createdAt;
	
	@UpdateTimestamp
	@Column(updatable=false)
	private LocalDate updatedAt;
}
