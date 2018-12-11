package com.azr.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.azr.dao.FileDaoImpl;
import com.azr.model.RentDataItem;

@RestController
public class FileConverterRestController {

	@Autowired
	FileDaoImpl fileDaoImpl;
	
	@GetMapping("/getJsonFile")
	@ResponseBody
	public ResponseEntity<List<RentDataItem>> getJsonFile() {
		List<RentDataItem> list = fileDaoImpl.getCsvFile();
		return new ResponseEntity<List<RentDataItem>>(list,new HttpHeaders(),HttpStatus.OK);
		
	}
}
