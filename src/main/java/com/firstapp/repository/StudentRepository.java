package com.firstapp.repository;

import com.firstapp.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    @Procedure(name = "studentReadSp")
    String studentByRollno(String requestdata);

    @Procedure(name = "studentMaintainSp")
    String studentMaintain(String requestdata);

}
