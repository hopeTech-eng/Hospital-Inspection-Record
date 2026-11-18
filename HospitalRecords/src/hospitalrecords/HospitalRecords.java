/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalrecords;

/**
 *
 * @author HOPEWELL
 */
public class HospitalRecords {
private String hospitalName;
private String hospitalLocation;
private String years;

private String output;

public HospitalRecords(String name, String location, String years, String output) {
    this.hospitalLocation = location;
    this.hospitalName = name;
    this.years = years;
    this.output = output;
}

public String getReport() {
    String report = "Hospital Name: " + hospitalName + "\n";
    report += "Hospital Location: " + hospitalLocation + "\n";
    report += "Years Since Inspection: " + years + "years\n";
    report += "**********************************************************";
    return report;
}
    
public String[][] getRecord() {
  String[][] record = {{hospitalName, hospitalLocation, years}};
  for (int i = 0; i < record.length; i++){
      
  }
  return record;
}
    
}
