package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.text.NumberFormat;
import java.util.Locale;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		int age=17;
		
		if(age<18) {
			
			throw new MyException("You are under Aged");
		}

}
}
