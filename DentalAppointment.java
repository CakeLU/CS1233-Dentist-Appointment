public class DentalAppointment{
  private int duration;
  private Person patient;
  private Time startTime;
  private Time endTime;
  private date apptDate;

  public DentalAppointment(String first,String last,int month,int day,int year,int hours,int minutes){
    this.patient=new Person(first,last,"X");
    this.startTime=new Time(hours,minutes);
    this.endTime=new Time(startTime.getHours(),startTime.getMinutes());
    this.endTime.addMinutes(30);
    this.apptDate=new date(day,month,year);
  }

  public DentalAppointment(String first,String last,int month,int day,int year,int hours,int minutes,int duration){
    this.patient=new Person(first,last,"X");
    this.startTime=new Time(hours,minutes);
    if(duration<=240){
      this.endTime=new Time(startTime.getHours(),startTime.getMinutes());
      this.endTime.addMinutes(duration);
    }
    else{
      this.endTime=new Time(startTime.getHours(),startTime.getMinutes());
      endTime.addMinutes(240);
    }
    this.apptDate=new date(day,month,year);
  }

  public void printDentalAppt(){
    System.out.printf("Full Name: %s %s\n",patient.getFirst(),patient.getLast());
    System.out.printf("Date of Appointment(M/D/Y): %s/%s/%s\n",apptDate.getMonth(),apptDate.getDay(),apptDate.getYear());
    System.out.printf("Time of Appointment: %02d:%02d to %02d:%02d\n",startTime.getHours(),startTime.getMinutes(),endTime.getHours(),endTime.getMinutes());
  }
}
