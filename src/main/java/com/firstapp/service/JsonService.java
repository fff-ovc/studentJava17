package com.firstapp.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public interface JsonService {

	String generateJson(Object objToSerializeToJson) throws IOException;

	ObjectMapper getObjectMapper();
}
