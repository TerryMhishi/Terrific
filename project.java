//import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;

public class project {
    
    public static void main(String[] args) {
        System.out.println("----- program shows information on a unix system--------------------------");
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
    try {
        System.out.println("the computer houses the partitions");
   String[] cmd = {
"/bin/sh",
"-c",
"lsblk| grep sda"
};

Process p = Runtime.getRuntime().exec(cmd);
 int result = p.waitFor();
 
 System.out.println();

  BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
} catch (Exception e) {
        e.printStackTrace();
    }
System.out.println("------------------------------------------------------------------");

 try {
        System.out.println("the number of partitions :");
   String[] cmd = {
"/bin/sh",
"-c",
"lsblk| grep part | wc -l"
};

Process p = Runtime.getRuntime().exec(cmd);
 int result = p.waitFor();
 //System.out.println("Process exit code: " + result);
 System.out.println();
// System.out.println("Result:");
  BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
} catch (Exception e) {
        e.printStackTrace();
    }
System.out.println();
System.out.println("----------------------------------------------------------------------");

try {
        System.out.println("the number of processors ");
   String[] cmd = {
"nproc"
};

Process p = Runtime.getRuntime().exec(cmd);
 int result = p.waitFor();
 //System.out.println("Process exit code: " + result);
 System.out.println();
// System.out.println("Result:");
  BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
} catch (Exception e) {
        e.printStackTrace();
    }
System.out.println();
System.out.println("------------------------------------------------------------------");


try {
        System.out.println("ram size is :");
   String[] cmd = {
"/bin/sh",
"-c",
"cat /proc/meminfo | grep MemTotal"
};

Process p = Runtime.getRuntime().exec(cmd);
 int result = p.waitFor();
 //System.out.println("Process exit code: " + result);
 System.out.println();
// System.out.println("Result:");
  BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
} catch (Exception e) {
        e.printStackTrace();
    }
System.out.println();
System.out.println("-------------------------------------------------------------------------------------");
try {
        System.out.println("type of processor chip and its processor speed is shown bellow respectively:");
   String[] cmd = {
"/bin/sh",
"-c",
"cat /proc/cpuinfo | grep 'model name'|uniq"
};

Process p = Runtime.getRuntime().exec(cmd);
 int result = p.waitFor();
 //System.out.println("Process exit code: " + result);
 System.out.println();
// System.out.println("Result:");
  BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
} catch (Exception e) {
        e.printStackTrace();
    }
    System.out.println("-------------------------------------------------------------");
    System.out.println();


try {
        System.out.println("location of swap memory");
   String[] cmd = {
"/bin/sh",
"-c",
"swapon -v"
};

Process p = Runtime.getRuntime().exec(cmd);
 int result = p.waitFor();
 //System.out.println("Process exit code: " + result);
 System.out.println();
// System.out.println("Result:");
  BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
} catch (Exception e) {
        e.printStackTrace();
    }
    System.out.println("-------------------------------------------------------------");
    System.out.println();
// now printing  cache memory


System.out.println("-------------------------------------------------------------");
    System.out.println();
    try {
        System.out.println("The  cache memory is shown as follows ");
   String[] cmd = {
"/bin/sh",
"-c",
"cat /proc/meminfo | grep Cached"
};

Process p = Runtime.getRuntime().exec(cmd);
 int result = p.waitFor();
 //System.out.println("Process exit code: " + result);
 System.out.println();
// System.out.println("Result:");
  BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
} catch (Exception e) {
        e.printStackTrace();
    }


System.out.println();
System.out.println("------------------------------------------------------------------");


try {
        System.out.println("the hard disk size is  :");
   String[] cmd = {
"/bin/sh",
"-c",
"lsblk -dn -o NAME,TYPE,SIZE | grep sda"
};

Process p = Runtime.getRuntime().exec(cmd);
 int result = p.waitFor();
 //System.out.println("Process exit code: " + result);
 System.out.println();
// System.out.println("Result:");
  BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
} catch (Exception e) {
        e.printStackTrace();
    }


System.out.println("-------------------------------------------------------------");
    System.out.println();
    try {
        System.out.println("The  speed of processor is : ");
   String[] cmd = {
"/bin/sh",
"-c",
"lscpu | grep MHz"
};

Process p = Runtime.getRuntime().exec(cmd);
 int result = p.waitFor();
 //System.out.println("Process exit code: " + result);
 System.out.println();
// System.out.println("Result:");
  BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
} catch (Exception e) {
        e.printStackTrace();
    }




System.out.println("-------------------------------------------------------------");
    System.out.println();





}

















}
    