package com.Hospitalmanagement.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity



public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docId;
	@Column(name = "doctorname", length = 20)
	private String docName;
	@Column(name = "doctorage")
	private int docAge;
	@Column(name = "doctoremail", length = 30, unique = true)
	@Nonnull(message = "must include email in postman API")
	@NotBlank(message = "must type value in email")
	@Email(message = "please provide proper email id")
	private String docEmail;
	@Column(name = "doctormobile", length = 10)
	private String docMobile;

	@OneToOne(cascade = CascadeType.ALL)
	private Hospital hospital;

}
