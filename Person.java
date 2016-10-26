public class Person{
  private String first,last,zip;

  public Person(){
    this.first="X";
    this.last="X";
    this.zip="X";
  }

  public Person(String first,String last,String zip){
    this.first=first;
    this.last=last;
    this.zip=zip;
  }

  public String getFirst(){
    return first;
  }

  public String getLast(){
    return last;
  }

  public String getZip(){
    return zip;
  }

  public void printPerson(){
    System.out.printf("Full Name: %s %s\nZip Code: %s\n",first,last,zip);
  }

}
