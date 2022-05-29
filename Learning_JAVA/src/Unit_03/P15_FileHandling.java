//package Unit_03;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.ArrayList;
//import java.util.List;
//
//public class P15_FileHandling {
//
//	public static void main(String[] args) {
//		files obj = new files();
//		obj.takeInputFromAFileNotFromConsole();
////		obj.saveOutputIntoAFlie();
////		obj.createALogFile();
//	}
//
//}
//
//class files{
//	private static final String[]  = null;
//	void takeInputFromAFileNotFromConsole() {
//		String file1 = "input.txt";
//		File file = new File(file1);
//		BufferedReader br = new BufferedReader(new FileReader(file));
//		String st;
//		while((st = br.readLine()) != null) {
//			System.out.println(st);
//		}
//		//list that holds string of files
//		List<String> Listofstrings = new ArrayList<String>();
//		
//		//read entire line as string
//		String line = br.readLine();
//		
//		while(line!=null) {
//			Listofstrings.add(line);
//			line = br.readLine();
//		}		
//		for(String str:Listofstrings)
//		{
//			System.out.println(str);
//		}
//		System.out.println("\n");
//		br.close();
//	}
//	void saveOutputIntoAFlie(){
//		
//	}
//	void createALogFile() {
//		
//	}
//}
//


package Unit_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

///*
// * - Byte and Character Streams
// * - Reading and writing from console and file
// * */
//
public class P15_FileHandling  {

	public static void main(String[] args) throws IOException {

		ABCDEF obj = new ABCDEF();
		obj.takeInputFromAFile();
		// obj.saveOutputIntoAFile();
		 //obj.saveLogOfProgram();

	}

}

class ABCDEF {
	
	static int a = 10;

	void takeInputFromAFile() throws IOException {

		String path = "C:\\Users\\anshi\\git\\Java_Programming\\Learning_JAVA\\src\\Unit_03\\input.txt";
		File file = new File(path);

      //Class used for reading data from file - file>buffer>program
        //file reader figures out the permissions related to files
		BufferedReader br = new BufferedReader(new FileReader(file));

		//readline returns the newline character that it encounters
//		String st;
//		while ((st = br.readLine()) != null) {
//			System.out.println(st);
//		}
		//int c;
		//while ((c = br.read()) != -1) { //reads values 2 bytes at a time character by character to follow the ascii format of representation
//			System.out.println((char)c); 
//		}

//		// list that holds strings of a file
    	List<String> listOfStrings = new ArrayList<String>();

//		// read entire line as string
	String line = br.readLine();

		while (line != null) {
			listOfStrings.add(line);
			line = br.readLine();
		}

		for (String str : listOfStrings) {
			System.out.println(str);
		}
		System.out.println("\n");
		br.close();
	}

	void saveOutputIntoAFile() throws IOException {

		FileWriter myObj = null;

		try {
			myObj = new FileWriter("output.txt");
			//this line will append the new data in the same file 
			//to open file in append mode
			//myObj = new FileWriter("output.txt",true);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "Hey this would store in Output file";

		f_writer.write(text);
		f_writer.close();

	}

	void saveLogOfProgram() throws IOException {
		
		a++;
		
		//Find current time and Date
		LocalTime ltime = java.time.LocalTime.now();
		LocalDate ldate = java.time.LocalDate.now();
		
		FileWriter myObj = null;

		try {
			myObj = new FileWriter("log.txt",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "The Program executed at: " + ltime.toString() + " " + ldate.toString() + "\n";

		try {
			f_writer.write("Value of a: " + a + ", ");
			f_writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		f_writer.close();

	}

}