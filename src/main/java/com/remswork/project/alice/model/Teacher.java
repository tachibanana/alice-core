package com.remswork.project.alice.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.remswork.project.alice.model.support.Link;

@XmlRootElement
public class Teacher implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private UserDetail userDetail;
	private Department department;
	private List<Link> links;
	
	public Teacher() {
		super();
		links = new ArrayList<>();
	}
	
	public Teacher(String firstName, String middleName, String lastName, String email) {
		this();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
	}

	public Teacher(long id, String firstName, String lastName, String middleName, String email) {
		this(firstName, middleName, lastName, email);
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public void addLink(Link link){
		boolean isExist = false;
		for (Link eachLink : links) {
			if(eachLink.getRel().equalsIgnoreCase(link.getRel())) {
				isExist = true;
				break;
			}
		}
		if(!isExist)
			links.add(link);
	}
}
