package AssignmentTwo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Counter {
    Criteria criteria;
    public Counter(){

    }

    public Counter(Criteria criteria){
        this.criteria = criteria;
    }

    public int getNumFiles(){
        try{
            int result = new File(criteria.getPath()).list().length;
            return result;
        } catch (Exception e){
            System.out.println("error when counting files");
        }
        return -1;
    }

    public int getNumFolders(){
        try{
            File dir = new File(criteria.getPath());
            int result = 0;
            File listDir[] = dir.listFiles();
            for (int i = 0; i < listDir.length; i++) {
                if (listDir[i].isDirectory()) {
                    result++;
                }
            }
            return result;
        } catch(Exception e){
            System.out.println("error when counting folders");
        }
        return -1;
    }

    public long getNumExtenstions() throws IOException {
        try (Stream<Path> stream = Files.list(Paths.get(criteria.getPath()))) {
            Map<String, Long> fileExtCountMap = stream.filter(Files::isRegularFile)
                    .map(f -> f.getFileName().toString().toUpperCase())
                    .map(n -> n.substring(n.lastIndexOf(".") + 1))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            return fileExtCountMap.get(criteria.getPath());
        } catch (Exception e){
            System.out.println("error when counting extensions");
        }
        return -1;
    }

    public void printResult(){
        try {
            System.out.println("There are "+getNumFiles()+" files and "+getNumFolders()+"folders and "+getNumExtenstions()+"extensions in "+criteria.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
