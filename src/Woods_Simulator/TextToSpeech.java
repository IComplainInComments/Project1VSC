

import java.io.*;

//Source: https://alvinalexander.com/java/edu/pj/pj010016/
public class TextToSpeech {
    
    String stringToSpeak;
    TextToSpeech() {
        stringToSpeak = "no string found";
    }
    
    public void speak(String tts) {

        String s = null; //reads error information

        /*try {
            
            // using the Runtime exec method:
            Process p = Runtime.getRuntime().exec("PowerShell -Command \"Add-Type �AssemblyName System.Speech; "
                    + "(New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('" + tts + "');");
            
            BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new 
                 InputStreamReader(p.getErrorStream()));

            // read the output from the command
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            
            // read any errors from the attempted command
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
            
            //System.exit(0);
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }*/
    }
}