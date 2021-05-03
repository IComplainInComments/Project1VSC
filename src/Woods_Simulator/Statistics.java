

//welcome, gentlemen, to the statistics class.
//this is going to gather statistics while the program is running. it is going to return a summary of those statistics as a string so they can be text-to-speech'd.
//let's get this bread.

public class Statistics{
  int shortestrun;
  int longestrun;
  double averageruntime; 
  int runs;

  public Statistics(){
      this.shortestrun = 0;
      this.longestrun = 0;
      this.averageruntime = 0;
      this.runs = 0;
  }

  public void updateStatistics(Application current){
      ++runs;
      if(runs ==  1){ //first run
          shortestrun = current.getUpdates();
          longestrun = current.getUpdates();
          averageruntime = current.getUpdates();
      }
      else{
          if(shortestrun > current.getUpdates()){
              shortestrun = current.getUpdates();
          }
          if(longestrun < current.getUpdates()){
              longestrun = current.getUpdates();
          }
          averageruntime = (averageruntime + current.getUpdates()); 
      }
  }

  public void clearStatistics(){
      shortestrun = 0;
      longestrun = 0;
      averageruntime = 0;
      runs = 0;
  }
  
  public String toString(){
      return "The shortest run was " + shortestrun + ", the longest run was " 
    		  + longestrun + ", and the average runtime was " + ((double)Math.round((averageruntime/runs)*100.0)/100.0);
  }
}