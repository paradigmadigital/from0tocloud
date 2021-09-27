package com.paradigmadigital.watto.service;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceItem {
	@Id
	private String id;
	private String name;
	private String description;
	private Service service;
	
}
