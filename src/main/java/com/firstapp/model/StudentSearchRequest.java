package com.firstapp.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Builder
@Setter
public class StudentSearchRequest implements Serializable {

    private String action;
    private String rollno;

}
