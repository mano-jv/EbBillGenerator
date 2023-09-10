package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class ReadFile {
	
	public static List<String[]> read(String file){
	
		List<String[]> data=new LinkedList<String[]>();
		String s;
		try {
		BufferedReader br=new BufferedReader(new FileReader(file));
		
		while((s=br.readLine())!=null) {
		String sar[]=s.split(",");
			data.add(sar);
		}
		br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return data;
		
		
	}

}
