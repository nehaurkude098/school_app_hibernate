package com.ty.school.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
		@Id
		
		private int id;
		private String name;
		@Column( unique = true)
		private String email;
		@Column(nullable = false)
		private String password;
		private long phone;
		private String gender;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		} 		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phone="
					+ phone + ", gender=" + gender + "]";
		}
		
		

	}



