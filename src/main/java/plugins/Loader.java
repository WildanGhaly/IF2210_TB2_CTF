package plugins;

import java.util.jar.*;
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;

public class Loader {
    public static ArrayList<String> getClassNamesFromJar(String jarPath) throws Exception {
        JarFile jarFile = new JarFile(jarPath);
        ArrayList<String> nameClass = new ArrayList<String>();
        
        jarFile.stream()
            .filter(entry -> entry.getName().endsWith(".class"))
            .map(entry -> entry.getName().replace('/', '.').substring(0, entry.getName().length() - 6))
            .forEach(nameClass::add);

        return nameClass;
    }

    public static ArrayList<Class> loadJarFile(String filePath) throws Exception {
 
        ArrayList<Class> availableClasses = new ArrayList<>();
         
        ArrayList<String> classNames = getClassNamesFromJar(filePath);
        File f = new File(filePath);
     
        URLClassLoader classLoader = new URLClassLoader(new URL[]{f.toURI().toURL()});
        for (String className : classNames) {
            try {
                Class cc = classLoader.loadClass(className);
                availableClasses.add(cc);
            } catch (ClassNotFoundException e) {
                // LOGGER.error("Class " + className + " was not found!", e);
                System.out.println("error brow");
            }
        }
        return availableClasses;
    }
}
