package edu.uoc.som.jarvis.data.platform;

import edu.uoc.som.jarvis.core.JarvisCore;
import edu.uoc.som.jarvis.core.platform.RuntimePlatform;
import org.apache.commons.configuration2.Configuration;
import java.io.File;

import static fr.inria.atlanmod.commons.Preconditions.checkArgument;
import static java.util.Objects.nonNull;

public class DataPlatform extends RuntimePlatform {

    public DataPlatform(JarvisCore jarvisCore, Configuration configuration) {
        super(jarvisCore, configuration);
        //dbPath = configuration.getString(NEO4J_DB_PATH_KEY);
        //checkArgument(nonNull(dbPath) && !dbPath.isEmpty(), "Cannot construct a Neo4j database with the provided " +
        //        "path: %s", dbPath);
        //this.dbService = new GraphDatabaseFactory().newEmbeddedDatabase(new File(dbPath));
        //registerShutdownHook(dbService);
    }

  
}
