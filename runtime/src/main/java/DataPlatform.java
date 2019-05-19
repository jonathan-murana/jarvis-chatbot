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
    }

  
}
