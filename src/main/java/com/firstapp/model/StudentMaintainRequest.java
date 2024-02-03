package com.firstapp.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Builder
@Setter
public class StudentMaintainRequest implements Serializable {

    private String action;
    private String rollno;
    private String firstname;
    private String lastname;
    private String dob;

}
