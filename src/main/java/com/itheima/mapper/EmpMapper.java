package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.util.List;

//员工信息
@Mapper
public interface EmpMapper {

    public List<Emp> list(String name, Integer gender, LocalDate begin, LocalDate end);
}
