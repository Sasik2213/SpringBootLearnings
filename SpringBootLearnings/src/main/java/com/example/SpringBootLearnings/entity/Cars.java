package com.example.SpringBootLearnings.entity;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cars",uniqueConstraints = @UniqueConstraint(name="my_fav_car",columnNames = "companyName"))
public class Cars {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String companyName;
	@Column(name = "car_colour_name")
	private String carColour;
	@Column(nullable = false)
	private String carPrice;
	@CreationTimestamp
	private String carPurchaseDate;

}
