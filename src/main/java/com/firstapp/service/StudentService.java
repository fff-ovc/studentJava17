package com.firstapp.service;

// import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstapp.repository.StudentRepository;
import com.firstapp.model.*;
import java.io.IOException;
import java.util.Map;

@Service
// @Slf4j
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private JsonService jsonService;

    @Autowired
    private StringService stringService;

    public StudentResponse getStudentDetails(Map<String, String> searchParams) throws IOException {

        String searchValue = searchParams.values().iterator().next();

        StudentSearchRequest request = StudentSearchRequest.builder().action("READ").rollno(searchValue).build();
        
//        System.out.println(jsonService.generateJson(request));
        String stuString = studentRepository.studentByRollno(jsonService.generateJson(request));
        StudentResponse stuResponse = (StudentResponse) stringService.unwrapStringToModel(stuString, StudentResponse.class);

        return stuResponse;
    }

     public StudentResponse maintainStudentDetails(StudentMaintainRequest request) throws IOException {

         String stuString = studentRepository.studentMaintain(jsonService.generateJson(request));
         StudentResponse stuResponse = (StudentResponse) stringService.unwrapStringToModel(stuString, StudentResponse.class);

         return stuResponse;
     }


}
