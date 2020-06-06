package importantJavaProgramms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Emloyee {

	public static void main(String[] args) {
		
		
		
		//People hired 1-5 years experience range 1
		//People hired 5-10 years experience range 1
		//People hired 10-15 years experience range 0
		//Companies we hired from: Capgimini,Accenture
		
		
		EmployeeDatabase interview1= new EmployeeDatabase("Nitya", 4.5, "Sapient", "10-Nov-2019", false);
		EmployeeDatabase interview2= new EmployeeDatabase("Abhay", 3.5, "Cognizant", "15-Nov-2019", false);
		EmployeeDatabase interview3= new EmployeeDatabase("Chiku", 8.5, "Capgimini", "21-Nov-2019", true);
		EmployeeDatabase interview4= new EmployeeDatabase("Viswa", 2.5, "Accenture", "25-Nov-2019", true);
		
		
		ArrayList<EmployeeDatabase> EmployeeList=new ArrayList<EmployeeDatabase>();
		
		EmployeeList.add(interview1);
		EmployeeList.add(interview2);
		EmployeeList.add(interview3);
		EmployeeList.add(interview4);
		
		Map<String, Integer> range=new LinkedHashMap<String, Integer>();
		
		range.put("1-5", 0);
		range.put("5-10", 0);
		range.put("10-15", 0);
		
		List<String> fromCompany=new ArrayList<String>();
		
		
		for(EmployeeDatabase employeeData: EmployeeList) {
			
			if(employeeData.isSelected()&& employeeData.getExp()>1 & employeeData.getExp()<5) {
				
				range.put("1-5", range.get("1-5")+1);
				fromCompany.add(employeeData.getOrg());
				
			}else if(employeeData.isSelected()&& employeeData.getExp()>5 & employeeData.getExp()<10) {
				
				range.put("5-10", range.get("5-10")+1);
				fromCompany.add(employeeData.getOrg());
				
			}else if(employeeData.isSelected()&& employeeData.getExp()>10 & employeeData.getExp()<15) {
				
				range.put("10-15", range.get("10-15")+1);
				fromCompany.add(employeeData.getOrg());
			}
			
		}
		
		
		for(Entry<String, Integer> expRange:range.entrySet()) {
			
			System.out.println("People hired from " + expRange.getKey() + " Years Experience range is " + expRange.getValue());
		}
		
        System.out.println("Companies we Hired From : " + String.join(",", fromCompany));
	}

}
