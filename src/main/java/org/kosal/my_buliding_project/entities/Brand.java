package org.kosal.my_buliding_project.entities;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Brand {
	@Id
	private Long id;
	private String name;

}
