package edu.uoc.som.jarvis.data.platform.action;

import edu.uoc.som.jarvis.core.platform.action.RuntimeAction;
import edu.uoc.som.jarvis.core.session.JarvisSession;
import edu.uoc.som.jarvis.data.platform.DataPlatform;
import java.io.*;
import static java.util.Objects.isNull;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import controller.Controller;

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
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++ paso"+this.label);
	return Controller.getResponse(this.label);
    }
}
