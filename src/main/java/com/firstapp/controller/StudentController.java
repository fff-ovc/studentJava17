package com.firstapp.controller;

import com.firstapp.model.StudentMaintainRequest;
import com.firstapp.model.StudentResponse;
import com.firstapp.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;


@RestController
@RequestMapping("/v1/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @Operation(summary = "Fetch Student Details")
    @GetMapping("/fetch")
    public ResponseEntity<StudentResponse> getStudentDetails(
            @RequestParam Map<String, String> searchParm)
            throws IOException, SQLException {

        return ResponseEntity.ok().body(studentService.getStudentDetails(searchParm));
    }

     @Operation(summary = "Maintain Student Details")
     @PostMapping("/maintain")
     public ResponseEntity<StudentResponse> maintainStudentDetails(
             @RequestBody StudentMaintainRequest request)
             throws IOException, SQLException {

         return ResponseEntity.ok().body(studentService.maintainStudentDetails(request));
     }

}
