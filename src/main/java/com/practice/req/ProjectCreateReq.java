package com.practice.req;

import com.practice.enums.EnumProjectStatus;
import lombok.Data;

import java.util.Date;

@Data
public class ProjectCreateReq {
    private String projectName;
    private String description;

    private EnumProjectStatus status;

    private Date createDate;
}
