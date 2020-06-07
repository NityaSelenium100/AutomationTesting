package practice;

public class EmployeeData {
	
	String ename;
	double exp;
	String company;
	String interviewDate;
	boolean isSelected;
	
	public EmployeeData(String ename,double exp,String company,String interviewDate,boolean isSelected) {
		
		this.ename=ename;
		this.exp=exp;
		this.company=company;
		this.interviewDate=interviewDate;
		this.isSelected=isSelected;	
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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
