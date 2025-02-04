package com.practice.dto;

import com.practice.enums.EnumProjectStatus;
import lombok.Data;

import java.util.Date;

@Data
public class ProjectDTO {
    private int id;

    private String projectName;
    private String description;

    private EnumProjectStatus status;

    private Date createDate;
}
