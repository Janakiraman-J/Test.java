package com.Hospitalmanagement.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hospid")
	private int hId;
	@Column(name = "hospname", length = 20)
	private String hName;
	@Column(name = "hosplocation")
	private String hLocation;
	@Column(name = "hosppincode")
	private int hPincode;

}
