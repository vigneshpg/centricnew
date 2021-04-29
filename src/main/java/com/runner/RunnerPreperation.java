package com.runner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import junit.textui.TestRunner;

public class RunnerPreperation {
	
	
	public static void callRunnerClass() throws InterruptedException {
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		junit.run(TestRunner.class);
		Thread.sleep(5000);
		System.out.println("Runner Class Created Successfully");

	}
	
//	static String filepath = System.getProperty("user.dir")+"\\Argument.properties";
	
	static String classpath = System.getProperty("user.dir");

	
     public static void createRunnerClass() throws InterruptedException, IOException {
    	 System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("feature"));
		System.out.println(System.getProperty("tags"));
	  /*  FileReader reader=new FileReader(filepath);  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	     
	    
	    String feature = p.getProperty("feature");
	    feature=feature.replace("\\", "\\\\");
	    String tags = p.getProperty("tags");
	    
	    System.out.println(p.getProperty("feature"));  
	    System.out.println(p.getProperty("tags"));*/
    	 int i = classpath.length();
    	 System.out.println(i);
    	 String s=classpath.substring(0, i-7);
    	 System.out.println(s);
    	 classpath.replace("\\", "\\\\");
    	 
     		String classpath1 = s+"\\src\\"
	           		+ "test\\java\\com\\centric\\stepdefinition\\TestRunner.java";
    		
    //		System.out.println("Runner class is :" +classpath1);
	    
	    try{    
	           File fw=new File(classpath1); 
	    //	File fw=new File("src\\test\\java\\com\\centric\\stepdefinition\\TestRunner.java");
	           FileOutputStream fos = new FileOutputStream(fw);
	           
	       	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
	           bw.write("package com.centric.stepdefinition;"); 
	           bw.newLine();
	           bw.newLine();
	           bw.write("import org.junit.runner.RunWith;");
	           bw.newLine();
	           bw.write("import cucumber.api.CucumberOptions;");
	           bw.newLine();
	           bw.write("import cucumber.api.junit.Cucumber;");
	           bw.newLine();
	           bw.newLine();
	           bw.newLine();
	           bw.newLine();
	           bw.write("@RunWith(Cucumber.class)");
	           bw.newLine();
	         //  bw.write("@CucumberOptions(features="+"\""+System.getProperty("feature")+"\""+",");
	           bw.write("@CucumberOptions(features="+"\""+"src\\\\test\\\\resources\\\\Features"+"\""+",");
	           bw.write("glue = "+"\""+"com.centric.stepdefinition"+"\""+",");
	           bw.write("plugin = {"+"\""+"html:target"+"\","+"\""+"json:target/reports.json"+"\""+"},");
	           
	           String multiple = System.getProperty("tags");
	           if(multiple.contains(",")){
	        	   int i1 = charCount(multiple);
	        	   String[] tag = multiple.split(",");
	        	   if(i1==1){
	        	      
	           bw.write("tags = {"+"\""+tag[0]+","+tag[1]+"\""+"})");
	         //  bw.write("tags = {"+"\""+"@UpdateConfiguration"+"\""+"})");
	        	   }else if (i1==2) {
	        		   bw.write("tags = {"+"\""+tag[0]+","+tag[1]+","+tag[2]+"\""+"})");
				}
	           }else{
	        	   bw.write("tags = {"+"\""+System.getProperty("tags")+"\""+"})");  
	           }
	           bw.newLine();
	           bw.newLine();
	           bw.newLine();
	           bw.write("public class TestRunner {");
	           bw.newLine();
	           bw.newLine();
	           bw.newLine();
	           bw.write("}");
	           
	           bw.close();    
	          }catch(Exception e){
	        	  System.out.println(e);
	        	  }    
	          System.out.println("Success..."); 
	          
		}
     
     public static int charCount(String comma) {
    	 
    	 
    	 Map<Character, Integer> emp = new HashMap<Character, Integer>();
    	 char[] ch = comma.toCharArray();
    	 
    	 for (char c : ch) {
    		 if(emp.containsKey(c)){
    			 Integer x = emp.get(c);
    			 emp.put(c, x+1);
    		 }else{
    			 emp.put(c, 1);
    		 }
			
		}
    	 
    	 Integer i = emp.get(',');
		System.out.println(emp.get(','));
		
		return i;

	}
	
	public static void main(String[] args)throws Exception{ 
		
		createRunnerClass();
		//callRunnerClass();
		//charCount("@abc,@bbc");
		
		 } 
	
	
	}  