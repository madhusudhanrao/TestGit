package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TestBO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;

	private java.lang.String address;

	@org.kie.api.definition.type.Label(value = "street")
	private java.lang.String street;

	public TestBO() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public java.lang.String getStreet() {
		return this.street;
	}

	public void setStreet(java.lang.String street) {
		this.street = street;
	}

	public TestBO(java.lang.String name, java.lang.String address,
			java.lang.String street) {
		this.name = name;
		this.address = address;
		this.street = street;
	}

}