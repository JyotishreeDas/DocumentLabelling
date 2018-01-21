package com.poc.Documentlabelling.service;

import java.io.File;
import java.util.*;

public class DocumentServiceImpl implements DocumentService {
	
	public Map<String,Map> findAllDocs(){
		Map<String,Map> result = new HashMap<>();
		String FileDir = "C:\\Documentlabelling\\src\\main\\resources\\waybill\\";
	
	    File folder = new File(FileDir);
	    File[] listOfFiles = folder.listFiles();
	
	    Map<Integer,Map<String,String>> counter = new HashMap<>();
	   
	    for( int i=0; i < listOfFiles.length; i++){
	    	Map<String,String> fl = new HashMap<>();
	    		fl.put("name",listOfFiles[i].getName());
	    		fl.put("path",FileDir+listOfFiles[i].getName());
	    		
	    	counter.put(i, fl);
	    	
	     }
		    
		    
		result.put("FileList", counter);
    
		return result;
	}
}
