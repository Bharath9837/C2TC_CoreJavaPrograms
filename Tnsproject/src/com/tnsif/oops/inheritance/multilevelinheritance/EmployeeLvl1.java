package com.tnsif.oops.inheritance.multilevelinheritance;
import java.util.Date;
public class EmployeeLvl1 extends Employee{
	 private int noOfShares;
	    private String authority;
	    
	    public EmployeeLvl1() {}
	    
	    public EmployeeLvl1(String name, long contactNo, Date dateOfBirth,String deptName, double baseSalary, int noOfShares, String authority) {
	    	super(name,contactNo,dateOfBirth,deptName, baseSalary);
	        this.noOfShares = noOfShares;
	        this.authority=authority;
	    }

		public int getNoOfShares() {
			return noOfShares;
		}

		public void setNoOfShares(int noOfShares) {
			this.noOfShares = noOfShares;
		}

		public String getAuthority() {
			return authority;
		}

		public void setAuthority(String authority) {
			this.authority = authority;
		}

		@Override
		public String toString() {
			return "LevelOneEmployee ["+super.toString()+"noOfShares=" + noOfShares + ", authority=" + authority + "]";
		}   

}
