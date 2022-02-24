package com.boot.teamMainProject;

import com.boot.teamMainProject.dao.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.boot.teamMainProject"}) 
//@MapperScan(basePackageClasses = IProductDAO.class)
@MapperScan(basePackageClasses = IMemDAO.class)
@MapperScan(basePackageClasses = ISpaceDAO.class)
@MapperScan(basePackageClasses = IGatheringDAO.class)
@MapperScan(basePackageClasses=GatherDetComDAO.class)
@MapperScan(basePackageClasses=IGatherDetDAO.class)
@MapperScan(basePackageClasses=IClassDAO.class)
@MapperScan(basePackageClasses = IGatherScheduleDAO.class)
public class TeamMainProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamMainProjectApplication.class, args);
	}

}
