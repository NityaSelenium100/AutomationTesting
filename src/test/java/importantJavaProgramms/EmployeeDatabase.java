package importantJavaProgramms;

public class EmployeeDatabase {
	
	String sname;
	double exp;
	String org;
	String interviewDate;
	boolean isSelected;
	
	public EmployeeDatabase(String sname,double exp,String org,String interviewDate,boolean isSelected) {
		
		this.sname=sname;
		this.exp=exp;
		this.org=org;
		this.interviewDate=interviewDate;
		this.isSelected=isSelected;	
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	
	

}
