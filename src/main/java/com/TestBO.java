package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TestBO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;

	private java.lang.String lastName;

	private java.lang.String address;

	public TestBO() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public TestBO(java.lang.String name, java.lang.String lastName,
			java.lang.String address) {
		this.name = name;
		this.lastName = lastName;
		this.address = address;
	}

}