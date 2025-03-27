package com.CRUD.first.Todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class todoEntity {
	
	private int  id;
	private String Username;
	@Size(min=10 ,message="Enter atlest 10 Characters")
	private String description;
	private LocalDate targeDate;
	private boolean done;
	
	
	public todoEntity(int id, String username, String description, LocalDate targeDate, boolean done) {
		super();
		this.id = id;
		Username = username;
		this.description = description;
		this.targeDate = targeDate;
		this.done = done;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTargeDate() {
		return targeDate;
	}
	public void setTargeDate(LocalDate targeDate) {
		this.targeDate = targeDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "todoEntity [id=" + id + ", Username=" + Username + ", description=" + description + ", targeDate="
				+ targeDate + ", done=" + done + "]";
	}
	
	

}
