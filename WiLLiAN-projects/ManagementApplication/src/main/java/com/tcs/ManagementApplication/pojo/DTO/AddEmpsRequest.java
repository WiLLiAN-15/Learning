package com.tcs.ManagementApplication.pojo.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.List;


public record AddEmpsRequest(
    String image,
    String username,
    String name,
    int gender,
    int job,
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate entryDate,
    int deptId,
    String phone,
    int salary,
    List<PastJob> List
) {}

public record PastJob(

)
