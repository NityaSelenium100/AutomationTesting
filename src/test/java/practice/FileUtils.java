package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {
	
	
	public void copyFile(File source,File dest) throws FileNotFoundException, IOException {
		
		try(FileInputStream fis=new FileInputStream(source);
				FileOutputStream fos=new FileOutputStream(dest)){
			
			byte[] b=new byte[1024];
			int length;
			
			while((length=fis.read(b))>0) {
				
				fos.write(b, 0, length);
			}
			
			
		}
		
		
	}
	
	public String readFile(File dest)  {
		
		String line;
		String text="";
		
		try {
			BufferedReader br=new BufferedReader(new FileReader(dest));
			
			while((line=br.readLine())!=null) {
				
				text=text+line+"\r\n";
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		return text;
		
		
		
	}

	

}
