package com.soninisha.ems.mapper;

import com.soninisha.ems.dto.DepartmentDto;
import com.soninisha.ems.entity.Department;

public class DepartmentMapper {

    // convert department jpa entity into department dto
    public static DepartmentDto mapToDepartmentDto(Department department){
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription()
        );
    }

    // convert department dto into department jpa entity
    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
    }
}
