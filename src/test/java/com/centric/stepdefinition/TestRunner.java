package com.centric.stepdefinition;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features",
glue = "com.centric.stepdefinition",
plugin = {"html:target","json:target/reports.json"},
tags = {"~@Jenkins"})


public class TestRunner {

@AfterClass
public static void excelReport() throws IOException, ParseException {
System.out.println("excel report in after class");
JSONParser parser = new JSONParser();
Object obj = parser.parse(new FileReader(".//target//reports.json"));
JSONArray array = (JSONArray) obj;
JSONObject jsonObject = (JSONObject) array.get(0);
JSONArray ele = (JSONArray) jsonObject.get("elements");
int l = ele.size();
FileOutputStream fos=new FileOutputStream(".//target//ReportGeneration.xls");
HSSFWorkbook workBook = new HSSFWorkbook();
HSSFSheet spreadSheet = workBook.createSheet("Report Sheet");
HSSFRow row;
HSSFCell cell;
int m=0,n=0;
for (int k = 0; k < l; k++) {
if (m==0) {
 row = spreadSheet.createRow(m);
cell=row.createCell(0);
cell.setCellValue("Test Cases");
cell = row.createCell(1);
cell.setCellValue("Status");
}
Object obj1 = ele.get(k);
JSONObject jsonObject1 =  (JSONObject) obj1;
JSONArray bef = (JSONArray) jsonObject1.get("steps");
row = spreadSheet.createRow(m+1);
cell = row.createCell(0);
cell.setCellValue(jsonObject1.get("name").toString());
int j = bef.size();
n=m+2;
for (int i = 0; i < j; i++) {
Object obj2 = bef.get(i);
JSONObject jsonObject2 =  (JSONObject) obj2;
Object obj3 = jsonObject2.get("result");
JSONObject jsonObject3 =  (JSONObject) obj3;
row = spreadSheet.createRow(n);
cell = row.createCell(0);
cell.setCellValue(jsonObject2.get("name").toString());
cell = row.createCell(1);
cell.setCellValue(jsonObject3.get("status").toString());
n++;
m++;
}
m=n;
}
workBook.write(fos);
fos.close();
}

}