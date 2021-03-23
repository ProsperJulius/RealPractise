package Blablacar;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Executable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]) throws MowerException, IOException {

        Lawn blablaLawn=null;


        int rows=0,columns=0;
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();

        Path path=Path.of(s+"/src/Blablacar/instructions.txt");

        LinkedList<String> fileContent = new LinkedList<String>(Files.readAllLines(path, StandardCharsets.UTF_8));

        if(fileContent!=null){
            Pattern number_pattern=Pattern.compile("\\d\\s\\d");
            String firstLine=fileContent.get(0);
            Matcher  numberMatcher= number_pattern.matcher(firstLine);
            if(numberMatcher.matches()){
                rows=Integer.parseInt(String.valueOf(firstLine.charAt(0)));
                columns=Integer.parseInt(String.valueOf(firstLine.charAt(2)));
                fileContent.remove(0);
                blablaLawn=new Lawn(rows+1,columns+1);
                Mower blablaMower=new Mower();
                Mower blablaMower2=new Mower();
                System.out.println(fileContent);
                Simulator simulator=new Simulator(blablaLawn,blablaMower,fileContent);
                Simulator simulator1=new Simulator(blablaLawn,blablaMower2,fileContent);
                ExecutorService service= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
                service.execute(simulator);
                service.execute(simulator);
                service.shutdown();

            }

        }





    }
}
