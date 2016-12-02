package com.hjz.video;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class FileOperator {
	private static Log log = LogFactory.getLog(FileOperator.class);

	public static void deleteFile(String path) {
		
		File file = new File(path);
		if(file.exists()){
			if(file.isFile()){
				log.info("delete file:" + path);
				file.delete();
			} else {
				log.info("not file" + path);
			}	
		} else {
			log.info("not exist" + path);
		}
	}	
	
	public static String getFilePrefix(String fileName) {
		
		int splitIndex = fileName.lastIndexOf(".");
		return fileName.substring(0, splitIndex);
	}

	public static String getFileSufix(String fileName) {
		
		int splitIndex = fileName.lastIndexOf(".");
		return fileName.substring(splitIndex + 1);
	}
}
