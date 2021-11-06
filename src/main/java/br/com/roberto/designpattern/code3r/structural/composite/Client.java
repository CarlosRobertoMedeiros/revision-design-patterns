package br.com.roberto.designpattern.code3r.structural.composite;

import br.com.roberto.designpattern.code3r.structural.composite.model.FileSytemItem;
import br.com.roberto.designpattern.code3r.structural.composite.model.Folder;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    /**
     * Usando a recursividade
    * */
    public static FileSytemItem createCompositeFromFile(File file) {
        if(!file.isDirectory()) return new br.com.roberto.designpattern.code3r.structural.composite.model.File(file.getName());
        List<FileSytemItem> childs = new ArrayList<>();
        File[] files = file.listFiles();
        for(File javaFile: files) {
            childs.add(createCompositeFromFile(javaFile));
        }
        return new Folder(file.getName(), childs);
    }

    public static void main(String[] args) {
        FileSytemItem file1 = new br.com.roberto.designpattern.code3r.structural.composite.model.File("File1.txt");
        FileSytemItem file2 = new br.com.roberto.designpattern.code3r.structural.composite.model.File("File2.txt");
        FileSytemItem file3 = new br.com.roberto.designpattern.code3r.structural.composite.model.File("File3.txt");
        FileSytemItem file4 = new br.com.roberto.designpattern.code3r.structural.composite.model.File("File4.txt");

        FileSytemItem sf1 = new Folder("sf1", Arrays.asList(file1));
        FileSytemItem sf2 = new Folder("sf2", Arrays.asList(file2,sf1));
        FileSytemItem folder = new Folder("folder", Arrays.asList(sf2, file3, file4));

        folder.mostrar("");

        System.out.println("-----------------------------");

        String diretorio = System.getProperty("user.dir");
        FileSytemItem fromDisk = createCompositeFromFile(new File(diretorio + File.separator + "src"));
        fromDisk.mostrar(">");


    }
}
