import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*; 
import java.util.*; 
import com.opencsv.*;

public class CreateFileInFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		writeDataLineByLine("C://New folder//New folder//Demand_Sheet3.csv");
		

	}
	public static void writeDataLineByLine(String filePath) 
	{ 
	    // first create file object for file placed at location 
	    // specified by filepath 
	    File file = new File(filePath); 
	    try { 
	        // create FileWriter object with file as parameter 
	        FileWriter outputfile = new FileWriter(file); 
	  
	        // create CSVWriter object filewriter object as parameter 
	        CSVWriter writer = new CSVWriter(outputfile); 
	  
	        // adding header to csv 
	        String[] header = { "ReqNo", "Initiator", "PrimarySkills", "SecondarySkills","PrimarySkill Category","PrimarySkillArea","Customer","Project","Project Code","Designation","Job Family","Job" }; 
	        writer.writeNext(header); 
	  
	       
	        // closing writer connection 
	        writer.close(); 
	    } 
	    catch (IOException e) { 
	        // TODO Auto-generated catch block 
	        e.printStackTrace(); 
	    } 
	} 

}
