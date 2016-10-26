public class date{
  private int day,month,year;
  public date(){
    this.day=1;
    this.month=1;
    this.year=2000;
  }
  public date(int day,int month,int year){
    this.day=day;
    this.month=month;
    this.year=year;
  }

  public int getDay(){
    return day;
  }

  public int getMonth(){
    return month;
  }

  public int getYear(){
    return year;
  }

  public void printDate(){
    System.out.printf("Day: %d\nMonth: %d\nYear: %d\n",day,month,year);
  }

}
