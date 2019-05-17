//mhishi s compiler


import java.io.*;//importing all the classes from package io
import java.util.Scanner;//scanner method for taking input from user



public class pyConvertor {
	public static void main(String[] args) throws IOException {
		// set up the command and parameter
	   String pythonScriptPath;
       System.out.println ("please enter  the path of your python file :");
       java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));   
       pythonScriptPath= in.readLine();  

		

		String[] cmd = new String[2];
		cmd[0] = "python3"; // check version of installed python: python -3.7.1;
		cmd[1] = pythonScriptPath;
		// create runtime to execute external command
		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec(cmd);

		// retrieve output from python script
		BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line = "";
		while((line = bfr.readLine()) != null) {
		// display each output line form python script
		System.out.println(line);
		}
	}
}

