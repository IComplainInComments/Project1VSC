

import java.io.File;
import java.io.IOException;
  
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioClipPlayer {
  //does not include pause function
  
  public String filePath; //filepath of audio, MUST BE .WAV FORMAT
  public Clip audioClip; //clip of audio
  AudioInputStream audioInputStream; 
  
  //constructor takes filepath and intended loop status of audio being made
  public AudioClipPlayer(String filePath, boolean loop) 
        throws UnsupportedAudioFileException,
        IOException, LineUnavailableException 
    {
        // create AudioInputStream object
        audioInputStream = 
                AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
          
        // create clip reference
        audioClip = AudioSystem.getClip();
          
        // open audioInputStream to the clip
        audioClip.open(audioInputStream);
        if (loop == true) {
          audioClip.loop(Clip.LOOP_CONTINUOUSLY);
        }
        
    }
  
  public void play() {
    audioClip.start();
  }
  
  public void stop() throws UnsupportedAudioFileException,
    IOException, LineUnavailableException 
  {
    audioClip.stop();
    audioClip.close();
  }
  
  public void restart() throws IOException, 
    LineUnavailableException, UnsupportedAudioFileException 
  {
    audioClip.stop();
    audioClip.close();
    resetAudioStream();
    audioClip.setMicrosecondPosition(0);
    this.play();
  }
  
  public void resetAudioStream() throws UnsupportedAudioFileException, 
    IOException, LineUnavailableException 
    {
        audioInputStream = AudioSystem.getAudioInputStream(
        new File(filePath).getAbsoluteFile());
        audioClip.open(audioInputStream);
        audioClip.loop(Clip.LOOP_CONTINUOUSLY);
    }
}