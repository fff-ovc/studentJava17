package com.firstapp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class StringService {

	Object unwrapStringToModel(String obj, Class<?> c) throws IOException {
		if (null != obj) {

			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.readValue(obj, c);
		} else {
			throw new IllegalArgumentException("String to unwrap cannot be null");
		}
	}
}
