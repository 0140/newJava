package CollectionsEx.LegacyEx;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesEx {
     
	public static void main(String[] args)throws Exception{  
	    FileReader reader=new FileReader("src\\CollectionsEx\\LegacyEx\\db.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  
	}  
	
	
}
