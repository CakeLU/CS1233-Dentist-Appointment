import java.util.Scanner;
public class DentalApptTest{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    int day,month,year,hours,minutes,duration;
    String[] date=new String[3];
    String[] time=new String[2];
    String fName,lName;
    DentalAppointment[] arr=new DentalAppointment[4];
    for(int i=0;i<3;i++){
      System.out.print("First Name: ");
      fName=scan.nextLine();
      System.out.print("Last Name: ");
      lName=scan.nextLine();
      System.out.print("Day of Appointment(M/D/Y): ");
      date=scan.nextLine().split("/");
      month=Integer.parseInt(date[0]);
      day=Integer.parseInt(date[1]);
      year=Integer.parseInt(date[2]);
      System.out.print("Time of Appointment(hrs:mins): ");
      time=scan.nextLine().split(":");
      hours=Integer.parseInt(time[0]);
      minutes=Integer.parseInt(time[1]);
      arr[i]=new DentalAppointment(fName,lName,month,day,year,hours,minutes);
    }
    System.out.print("First Name: ");
    fName=scan.nextLine();
    System.out.print("Last Name: ");
    lName=scan.nextLine();
    System.out.print("Day of Appointment(M/D/Y): ");
    date=scan.nextLine().split("/");
    month=Integer.parseInt(date[0]);
    day=Integer.parseInt(date[1]);
    year=Integer.parseInt(date[2]);
    System.out.print("Time of Appointment(hrs:mins): ");
    time=scan.nextLine().split(":");
    hours=Integer.parseInt(time[0]);
    minutes=Integer.parseInt(time[1]);
    System.out.print("Duration of appoinment: ");
    duration=scan.nextInt();
    arr[3]=new DentalAppointment(fName,lName,month,day,year,hours,minutes,duration);
    for(int i=0;i<4;i++)
      arr[i].printDentalAppt();
  }
}
