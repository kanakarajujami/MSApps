package com.nt.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="info.app")
public class EmployeeInfo {
  private String name;
  private Integer id;
  private String size;
  private String vendor;
  private String team;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public String getVendor() {
	return vendor;
}
public void setVendor(String vendor) {
	this.vendor = vendor;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
  
}
