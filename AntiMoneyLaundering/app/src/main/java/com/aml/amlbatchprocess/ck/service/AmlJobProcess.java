package com.aml.amlbatchprocess.ck.service;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



/**
 * 
 * @author Chandrakant
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
public class AmlJobProcess {
	
	private static Logger logger = Logger.getLogger(AmlJobProcess.class.getName());
	private static final String log4jPath = "C:\\WinServer\\AMLJob\\logs\\logs.properties";
	private static final String[] AML_CONFIG_FILES = new String[] {"C:\\WinServer\\AMLJob\\config\\applicationContext-AMLProcessDAO.xml"};
	
	private FileSystemXmlApplicationContext appContext = null;
	public void initAMl(){
		loadAmlConfiguration();
	}
	
	public void loadAmlConfiguration(){
		appContext = new FileSystemXmlApplicationContext(AML_CONFIG_FILES);
	}
	
	public static void main(String[] args){
		PropertyConfigurator.configure(log4jPath);
		AmlJobProcess process = new AmlJobProcess();
		process.processAllFeeds();
		
	}
	
	public void processAllFeeds(){
		try{
			initAMl();
			logger.info("Application Started for process all feeds.");
			
		}catch(Exception e){
			//Do whatever expected
		}
	}

}
