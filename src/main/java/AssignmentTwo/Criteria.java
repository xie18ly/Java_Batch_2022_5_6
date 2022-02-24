package AssignmentTwo;

public class Criteria {
    String folderPath;
    boolean includeSubFolder;
    boolean countedExtension;
    public Criteria(){

    }
    public Criteria(String folderPath,boolean includeSubFolder,boolean countedExtension){
        this.folderPath = folderPath;
        this.includeSubFolder = includeSubFolder;
        this.countedExtension = countedExtension;
    }

    public void setPath(String folderPath){
        this.folderPath = folderPath;
    }

    public void setIncludeSubFolder(boolean includeSubFolder){
        this.includeSubFolder = includeSubFolder;
    }

    public void setCountedExtension(boolean countedExtension){
        this.countedExtension = countedExtension;
    }

    public String getPath(){
        return this.folderPath;
    }

    public boolean getIncludeSubFolder(boolean includeSubFolder){
        return this.includeSubFolder;
    }

    public boolean getCountedExtension(boolean countedExtension){
        return this.countedExtension;
    }
}
