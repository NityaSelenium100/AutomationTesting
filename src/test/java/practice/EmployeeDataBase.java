package practice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeDataBase {

	public static void main(String[] args) {
		
		EmployeeData interview1=new EmployeeData("Nitya", 4.5, "Accenture", "12-june-2019", true);
		EmployeeData interview2=new EmployeeData("Abhay", 6.5, "Capgimini", "15-june-2019", true);
		EmployeeData interview3=new EmployeeData("Bikash", 10.5, "Google", "20-june-2019", false);
		EmployeeData interview4=new EmployeeData("Viswa", 2.5, "Cognizent", "25-june-2019", true);
		
		
		ArrayList<EmployeeData> InterviewList=new ArrayList<EmployeeData>();
		
		InterviewList.add(interview1);
		InterviewList.add(interview2);
		InterviewList.add(interview3);
		InterviewList.add(interview4);
		
		
		Map<String, Integer> range=new LinkedHashMap<String, Integer>();
		
		range.put("1-5", 0);
		range.put("5-10", 0);
		range.put("10-15", 0);
		
		ArrayList<String> fromCompany=new ArrayList<String>();
		
		for(EmployeeData data:InterviewList) {
			
			if(data.isSelected() && data.getExp()>1 & data.getExp()<5) {
				
				range.put("1-5", range.get("1-5")+1);
				fromCompany.add(data.getCompany());
				
			}else if(data.isSelected() && data.getExp()>5 & data.getExp()<10){
				range.put("5-10", range.get("5-10")+1);
				fromCompany.add(data.getCompany());
			
			}else if(data.isSelected() && data.getExp()>10 & data.getExp()<15) {
				range.put("10-15", range.get("10-15")+1);
				fromCompany.add(data.getCompany());
			}
			
		}
		
		for(Entry<String, Integer> dataMap:range.entrySet()) {
			
			System.out.println("People Hired From " + dataMap.getKey() + " years of experience range is " + dataMap.getValue() );
		}
		
		System.out.println("Companies we Hired from : " + String.join(",", fromCompany));

	}

}
