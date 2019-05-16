package edu.uoc.som.jarvis.data.platform.action;

import edu.uoc.som.jarvis.core.platform.action.RuntimeAction;
import edu.uoc.som.jarvis.core.session.JarvisSession;
import edu.uoc.som.jarvis.data.platform.DataPlatform;
import java.io.*;
import static java.util.Objects.isNull;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * Creates a new node with the provided {@code label}.
 * <p>
 * This class relies on the {@link Neo4jPlatform}'s {@link org.neo4j.graphdb.GraphDatabaseService} to create and
 * store the node in the associated Neo4j database.
 */
public class DameData extends RuntimeAction<DataPlatform> {


    private String label;


    public DameData(DataPlatform runtimePlatform, JarvisSession session, String label) {
        super(runtimePlatform, session);
        this.label = label;
    }

   
    @Override
    protected Object compute() {
	System.out.println("file ===============================");
	File curDir = new File(".");
	File[] filesList = curDir.listFiles();
        for(File f : filesList){
            if(f.isFile()){
                System.out.println(f.getName());
            }
        }
	System.out.println("hola===============================");
	System.out.println("label==============================="+label);

	BufferedReader reader;
	try {
		reader = new BufferedReader(new FileReader("./myfile.txt"));
		String line = "";
			while (line != null) {
				line = reader.readLine();				
				String key = line.split(",")[1-1];
				String value = line.split(",")[1];
				if (label.equals(key)){
					reader.close();
					return value;				
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


        return "node2";
    }
}
