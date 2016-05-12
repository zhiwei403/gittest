package controller;

import java.util.HashMap;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Record;
import service.RecordService;

@RestController

@RequestMapping(value = "/records", method = RequestMethod.GET)
public class RecordController {
	
	@Autowired
	RecordService rs;
	
	@RequestMapping("/all")
	public Hashtable<String, Record> getAll() {
		
		return rs.getAll();
	}
	@RequestMapping("{id}")
	public Record getRecord(@PathVariable("id") String cameraid) {
		return rs.getRecord(cameraid);
}
}