package com.firstapp.service.impl;

import com.firstapp.service.JsonService;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.StringWriter;

@Service
public class JsonServiceImpl implements JsonService {

	public String generateJson(Object objToSerializeToJson) throws IOException {

		ObjectMapper objMapper = getObjectMapper();
		objMapper.enable(SerializationFeature.INDENT_OUTPUT);
		// Globally prevent empty fields from being serialized and sent
		objMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

		StringWriter outputJson = new StringWriter();
		ObjectWriter objWriter = objMapper.writerWithDefaultPrettyPrinter();
		objWriter.writeValue(outputJson, objToSerializeToJson);

		return outputJson.toString();
	}

	public ObjectMapper getObjectMapper() {
		return new ObjectMapper().registerModule(new JavaTimeModule());
	}

}
