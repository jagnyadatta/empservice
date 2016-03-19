package com.self.conf;




import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@org.springframework.context.annotation.Configuration
@PropertySource("classpath:application.properties")
public class Configuration {
	 @Bean
	    DataSource dataSource(Environment env) {
		 DriverManagerDataSource dataSourceConfig=new DriverManagerDataSource();
		 dataSourceConfig .setDriverClassName(env.getRequiredProperty("db.driver"));
	        dataSourceConfig.setUrl(env.getRequiredProperty("db.url"));
	        dataSourceConfig.setUsername(env.getRequiredProperty("db.username"));
	        dataSourceConfig.setPassword(env.getRequiredProperty("db.password"));
	 
	        return  dataSourceConfig;
	    }
	   @Bean
	    JdbcTemplate jdbcTemplate(DataSource dataSource){
		 return new  JdbcTemplate(dataSource);
		   
		   }
	   }