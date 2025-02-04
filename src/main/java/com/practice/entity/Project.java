package com.practice.entity;

import com.practice.enums.EnumProjectStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table
@Data
public class Project {
    //    STT, Tên đề tài, Mô tả, Trạng thái (Nháp, xét duyệt, Áp dụng), ngày tạo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String projectName;
    private String description;

    @Enumerated(EnumType.STRING)
    private EnumProjectStatus status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

}
