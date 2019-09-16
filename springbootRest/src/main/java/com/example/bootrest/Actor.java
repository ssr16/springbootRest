package com.example.bootrest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actor {

	@Id
	private int actor_Id;
	private String first_Name;
	private String last_Name;

	public int getActor_Id() {
		return actor_Id;
	}

	public void setActor_Id(int actor_Id) {
		this.actor_Id = actor_Id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

}
