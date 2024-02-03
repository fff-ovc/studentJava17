package com.firstapp.entity;

import jakarta.persistence.*;


@NamedStoredProcedureQuery(name = "studentReadSp", procedureName = "TESTYAJLSP", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.OUT, type = String.class)})

@NamedStoredProcedureQuery(name = "studentMaintainSp", procedureName = "TESTYAJLSP", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.OUT, type = String.class)})

@Entity
public class StudentEntity {
    @Id
    private Long dummyId;
}
