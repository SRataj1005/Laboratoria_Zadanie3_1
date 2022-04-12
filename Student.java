public class Student {

  private String Name;
  private int Age;
  private String Surname;
  private String DataUrodzenia;

  public Student(String name, String surname, int age, String dataurodzenia) 
  {
    Name = name;
    Age = age;
    Surname = surname;
    DataUrodzenia = dataurodzenia;
  }

  public String GetName() {return Name;}
  public String GetSurname() {return Surname;}
  public int GetAge() {return Age;}
  public String GetDataUrodzenia() {return DataUrodzenia;}

  public String ToString() {
    return "Imię: " + Name + ", Nazwisko: " + Surname + ", Wiek: " + Integer.toString(Age) + ", Data urodzenia: " + DataUrodzenia;

  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error", "Parse Error", -1, "Parse Error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
  }
}