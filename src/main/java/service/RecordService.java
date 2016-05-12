package service;

import model.Record;

import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class RecordService {
	Hashtable<String, model.Record> records = new Hashtable<String, Record>();
	public RecordService() {
		String Date = "2016-05-09T17:31:01.000Z";
		DateTime dt = ISODateTimeFormat.dateTime().parseDateTime(Date);
		
		Record r = new Record();
		r.setCameraid("1");
		r.setFilename("yihaoD");
		r.setDateNTime(Date);
		records.put("1", r);
		
		r = new Record();
		r.setCameraid("2");
		r.setFilename("hennryD");
		r.setDateNTime(Date);
		records.put("2", r);
		
		System.out.println(dt);
		System.out.println(Date);
	}
	public Record getRecord(String cameraid){
		if(records.containsKey(cameraid))
			return records.get(cameraid);
		else
			return null;
		
		
	}
	public Hashtable<String,Record> getAll() {
		return records;
	}

}


