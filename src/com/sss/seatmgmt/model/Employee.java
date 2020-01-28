package com.sss.seatmgmt.model;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1813165492990418188L;
	private int empId;
	private String empName;
	private char empGender;
	private String empDesignation;
	private String empTeam;
	private Location empLocation;

	public Employee() {
		
	}
	
	public Employee(int empId, String empName, char empGender, String empDesignation, String empTeam, Location empLocation) {
		this.empId = empId;
		this.empName = empName;
		this.empGender = empGender;
		this.empDesignation = empDesignation;
		this.empTeam = empTeam;
		this.empLocation = empLocation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public char getEmpGender() {
		return empGender;
	}

	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpTeam() {
		return empTeam;
	}

	public void setEmpTeam(String empTeam) {
		this.empTeam = empTeam;
	}
	
	public Location getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(Location empLocation) {
		this.empLocation = empLocation;
	}
}
