package com.infy.jd.entity;

public class employ {
		private int id;
		private String name;
		private String city;
		private int salary;
		
		
		
		
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




		public String getCity() {
			return city;
		}




		public void setCity(String city) {
			this.city = city;
		}




		public int getSalary() {
			return salary;
		}




		public void setSalary(int salary) {
			this.salary = salary;
		}




		public employ() {
			super();
		}




		public employ(int id, String name, String city, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.salary = salary;
		}




		@Override
		public String toString() {
			return "employ [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
		}
		
		
		
}
