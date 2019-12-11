package com.zhaowenjie.crm.bean;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role implements Serializable {

	private static final long serialVersionUID = -9189207353882571478L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String description;

	private Integer flag;

	// private List<User> users;

	
	public Role() {
	}
	
	public Role(Integer id) {
		super();
		this.id = id;
	}


	/*public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Role{" + "id=" + id + ", name=" + name + ", description=" + description + ", flag=" + flag + "}";
	}

}
