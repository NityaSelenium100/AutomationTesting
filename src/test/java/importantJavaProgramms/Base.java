package importantJavaProgramms;

 class GrandParent {

	 public void print() {
		
		System.out.println("GrandParent Print()");
	}
	
	class Parent extends GrandParent{
		
		public void print() {
			
			System.out.println("Parent print()");
			
		}
	}
	
	class child extends Parent{
		
		public void print() {
			super.print();
			
			System.out.println("child print");
		}
	}
	
}
