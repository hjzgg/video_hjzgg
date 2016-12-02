package com.hjz.video;

import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.MultimediaInfo;
import java.io.File;

public class ReadVideo {
	  public static String getVideoLength(String source,int aa){
		  String s=null;
		  File file = new File(source); 
		  Encoder encoder = new Encoder(); 
	        try { 
	             MultimediaInfo m = encoder.getInfo(file); 
	             long ls = m.getDuration()/1000; //��ȡ������
	             ls= ls/aa;
	             long a=ls%60;
	             String a1;
	             if(a<10){
	            	 a1="0"+a;
	             }else{
	            	 a1=String.valueOf(a);
	             }
	             long b= (ls/60)%60;
	             String b1;
	             if(b<10){
	            	 b1="0"+b;
	             }else{
	            	 b1=String.valueOf(b);
	             }
	             long c=(ls/3600);
	             String c1;
	             if(c<10){
	            	 c1="0"+c;	 
	             }else{
	            	 c1=String.valueOf(c);
	             }
	             s=c1+":"+b1+":"+a1;
             } catch (Exception e) { 
	            e.printStackTrace(); 
	        }
			return s; 
	        
	  }
	 
	  public static String getVideoLength(String source){
		  File file = new File(source); 
		  long ls=0;
		  Encoder encoder = new Encoder(); 
	        try { 
	             MultimediaInfo m = encoder.getInfo(file); 
	             ls = m.getDuration()/1000; //��ȡ������
             } catch (Exception e) { 
	            e.printStackTrace(); 
	        }
			return String.valueOf(ls);
	        
	  }
}
