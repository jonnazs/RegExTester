/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regextester;

/**
 *
 * @author jonna
 */
import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExTesterMain {
    private VentanaPrincipal ventana;
    public RegExTesterMain(){
        
        ventana = new VentanaPrincipal(); 
        ventana.setVisible(true);
        /*
        boolean execution = true;
        String exitCom="";
        while (execution) {

            Pattern pattern = Pattern.compile(console.readLine("%nEnter your regex: "));
            exitCom = console.readLine("Enter input string to search: ");
            Matcher matcher = pattern.matcher(exitCom);

            boolean found = false;
            while (matcher.find()) {
                console.format("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
                console.format("No match found.%n");
            }
            if(exitCom.equalsIgnoreCase("EXIT")){
                execution = false; 
            }
        }*/
    }
    public static void main(String[] args){
        RegExTesterMain ja;
        ja = new RegExTesterMain();
        /*
        Console console = System.console();
        
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }else{
            ja = new JavaApplication2(console);
        }*/
    }
}

