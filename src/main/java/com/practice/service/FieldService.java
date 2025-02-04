package com.practice.service;

import com.practice.dto.FieldDTO;

public interface FieldService {
    //thêm ngành nghề
    FieldDTO createField(FieldDTO fieldDTO);

    //sửa ngành nghề
    FieldDTO updateField(Long id, FieldDTO fieldDTO);

    // xoa nganh nghe
    FieldDTO deleteField(Long id);

}

