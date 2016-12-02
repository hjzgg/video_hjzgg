package com.hjz.video;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SystemConfig {
    
	public static String getSystemConfig(String key) {
		
		Properties props = null;
		if(props == null){
			props = new SystemConfig().initProps();
		}
		
		return props.get(key).toString();
	}

	private Properties initProps() {
		
		Properties props =new Properties();
		InputStream in=null;
		
		try {
			in = getClass().getResourceAsStream("/system.properties");
			props.load(in);
		} catch (IOException e) {
		
		}finally{
		    try {
		        in.close();
		      } catch (IOException e1) {
		        // TODO Auto-generated catch block
		        e1.printStackTrace();
		      }
		}

		return props;
	}
}
