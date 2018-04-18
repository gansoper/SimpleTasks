package com.euroboats.test;

import java.io.File;
import java.io.FileInputStream;

public class FileReading {
	public static void main(String[] args) {
		File f = new File(args[0]);
		if (!f.exists()){
			System.out.println("File does not exist!");
			return;
		}
		
		try(FileInputStream is = new FileInputStream(f)){
			int c;
			String out = "";
			while((c = is.read()) != -1){
				char ch = (char)c;
				if (ch == ','){
					System.out.println(out);
					break;
				}
				
				out = out + ch;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
