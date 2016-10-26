public class Time{
  private int hours,minutes;

  public Time(){
    this.hours=0;
    this.minutes=0;
  }

  public Time(int hours){
    this.hours=hours;
    this.minutes=0;
    if(hours>23)
      hours=23;
  }

  public Time(int hours,int minutes){
    this.hours=hours;
    this.minutes=minutes;
    if(hours>23)
      hours=23;
    if(minutes>59)
      minutes=59;
  }

  public int getHours(){
    return hours;
  }

  public int getMinutes(){
    return minutes;
  }

  public void addMinutes(int a){
    minutes+=a;
    while(minutes>59){
      minutes-=60;
      hours+=1;
    }
    while(hours>23)
      hours-=24;
  }

  public void printTime(){
    System.out.printf("The time is %02d:%02d\n",hours,minutes);
  }
}
