package model;

import java.time.LocalDateTime;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
//import org.joda.time.format.DateTimeFormatter;
public class Record {
	
	String cameraid;
	String filename;
	String DateNTime;
	
	
	public String getCameraid() {
		return cameraid;
	}
	public void setCameraid(String cameraid) {
		this.cameraid = cameraid;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getDateNTime() {
		return DateNTime;
	}
	public void setDateNTime(String DateNTime) {
		this.DateNTime = DateNTime;
	}

}
