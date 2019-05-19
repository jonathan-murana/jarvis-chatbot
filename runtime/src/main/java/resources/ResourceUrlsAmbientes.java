package resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class ResourceUrlsAmbientes {

	public static String getResponse(String aplication) {
	
	System.out.println("file ===============================");
	File curDir = new File(".");
	File[] filesList = curDir.listFiles();
        for(File f : filesList){
            if(f.isFile()){
                System.out.println(f.getName());
            }
        }
	System.out.println("hola===============================");
	System.out.println("label==============================="+aplication);

	BufferedReader reader;
	try {
		reader = new BufferedReader(new FileReader("./urls.txt"));
		String line = "";
			while (line != null) {
				line = reader.readLine();				
				String key = line.split(",")[1-1];
				String value = line.split(",")[1];
				if (aplication.equals(key)){
					reader.close();
					return value;				
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


        return "no se pudo extraer la informacion en el recurso";	

	}

}
