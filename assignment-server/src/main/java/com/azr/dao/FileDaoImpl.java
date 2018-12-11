package com.azr.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.azr.model.RentDataItem;

@Component
public class FileDaoImpl {

	private static final String FILE_PATH = "src/main/resources/rent_data.txt";

	public List<RentDataItem> getCsvFile() {
		List<RentDataItem> result = null;
		try {
			result = Files.lines(Paths.get(FILE_PATH)).skip(1) // skip headers
					.map(data -> {
						String[] vars	= data.split(",");
						RentDataItem rdi = null;
						if (vars.length == 3) {
							rdi = new RentDataItem(vars[0], vars[1], vars[2], "");
						} else if (vars.length == 4) {
							rdi = new RentDataItem(vars[0], vars[1], vars[2], vars[3]);
						}

						return rdi;

					}).collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
