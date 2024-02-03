package com.firstapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse implements Serializable {

    private static final long serialVersionUID = 8405151932694244180L;

    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String actionDone;

    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private String rollno;

    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private String firstname;

    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private String lastname;

    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private String dob;

}
