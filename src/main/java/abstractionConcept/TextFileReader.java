package abstractionConcept;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TextFileReader extends AbstractClassConcept {

	public static void main(String[] args) throws IOException {
		
		String s = "C:\\Users\\HP\\Desktop\\ss.properties";
		
		 FileReader reader = new FileReader(s);
		 
		Properties prop = new Properties();
		prop.load(reader);
		System.out.println(prop.getProperty("name"));
		
		
		  String text = "Computer Science Portal GeeksforGeeks";
          FileWriter fWriter = new FileWriter("C:\\Users\\HP\\Desktop\\dd.txt");
          fWriter.write(text);

          System.out.println(text);

          fWriter.close();
          
		   String ss="C:\\Users\\HP\\Desktop\\dd.txt";
		   FileReader g=   new FileReader(ss);
		        BufferedReader br= new BufferedReader(g);
		        String st;
		        while ((st = br.readLine()) != null)
		           System.out.println(st);
		        
		        
	}

	@Override
	public void jansi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void kalai() {
		// TODO Auto-generated method stub
		
	}
}
