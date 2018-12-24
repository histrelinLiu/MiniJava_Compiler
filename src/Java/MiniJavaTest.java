import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class MiniJavaTest {

    public static void main(String[] args) {
        try {            
            File errFile = new File("./err.txt");
            System.setErr(new PrintStream(errFile));
        } catch (Exception e) {
        }
        String[] testFiles = {
            "binarysearch.java",
            "binarytree.java",
            "bubblesort.java",
            "factorial.java",
            "linearsearch.java",
            "linkedlist.java",
            "quicksort.java",
            "treevisitor.java"
        };
        byte[] bs = new byte[1];
        for (String JavaFile : testFiles) {
            System.out.println("Test " + JavaFile + ":");
            try {          
                File file = new File("../SampleMiniJavaPrograms/" + JavaFile);
                InputStream inputStream = new FileInputStream(file);        
                bs = new byte[(int)file.length()];       
                inputStream.read(bs);
                inputStream.close();
            } catch (Exception e) {
                
            }   
            
            CharStream input = CharStreams.fromString(new String(bs));
            
            MiniJavaLexer lexer = new MiniJavaLexer(input);
    
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            MiniJavaParser parser = new MiniJavaParser(tokenStream);
            ParseTree parseTree = parser.goal();
            MyMiniJavaVisitor visitor = new MyMiniJavaVisitor();
            visitor.visit(parseTree);
            System.out.println();
        }       
        
    }

}
