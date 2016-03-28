package com.facility.management.model.usage;
// Generated Mar 14, 2016 11:20:33 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Owner generated by hbm2java
 */
public class OwnerImpl implements java.io.Serializable, Owner {

	/**
	 * 
	 */
	private static final long serialVersionUID = -645843235902817961L;
	private Integer ownerId;
	private String firstName;
	private String lastName;
	private String ssn;
	private String email;
	private String phone;
	private String address;

	public OwnerImpl() {
	}

	public OwnerImpl(String firstName, String lastName, String ssn, String email,
			String phone, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#getOwnerId()
	 */
	@Override
	public Integer getOwnerId() {
		return this.ownerId;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#setOwnerId(java.lang.Integer)
	 */
	@Override
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#getFirstName()
	 */
	@Override
	public String getFirstName() {
		return this.firstName;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#setFirstName(java.lang.String)
	 */
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#getLastName()
	 */
	@Override
	public String getLastName() {
		return this.lastName;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#setLastName(java.lang.String)
	 */
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#getSsn()
	 */
	@Override
	public String getSsn() {
		return this.ssn;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#setSsn(java.lang.String)
	 */
	@Override
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#getEmail()
	 */
	@Override
	public String getEmail() {
		return this.email;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#setEmail(java.lang.String)
	 */
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#getPhone()
	 */
	@Override
	public String getPhone() {
		return this.phone;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#setPhone(java.lang.String)
	 */
	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#getAddress()
	 */
	@Override
	public String getAddress() {
		return this.address;
	}

	/* (non-Javadoc)
	 * @see com.facility.management.model.Owner#setAddress(java.lang.String)
	 */
	@Override
	public void setAddress(String address) {
		this.address = address;
	}

}