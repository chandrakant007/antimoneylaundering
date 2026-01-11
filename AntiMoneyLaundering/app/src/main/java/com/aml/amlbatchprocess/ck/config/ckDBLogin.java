package com.aml.amlbatchprocess.ck.config;

import org.apache.commons.dbcp.BasicDataSource;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Chandrakant
 *
 */
@Getter
@Setter
public class ckDBLogin extends BasicDataSource{
	
	private String dbPassword;
	
	

}
