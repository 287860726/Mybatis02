/**
 * @ahthor zhaocm
 * @date 2019年12月17日
 * @time 下午10:22:25
 */
package com.zhaocm.mybatis.dao;

import org.apache.ibatis.annotations.Select;

import com.zhaocm.mybatis.entity.Employee;

/**
 * @author zhaocm
 * @data 2019年12月17日
 * @time 下午10:22:25
 */
public interface EmployeeMapperAnnotation {
	
	@Select("select * from tbl_employee where id = #{id}")
	public Employee getEmpById(Integer id);

}
