import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
   Scanner nowy = new Scanner(System.in);
   String imie;
   String nazwisko;
   int wiek;
   String dataUrodzenia; 
    System.out.println("Podaj wybor:");
   int wybor = nowy.nextInt();
    switch(wybor)
      {
        case 1:
          {
            try
              {
                Service1 s = new Service1();
                nowy.nextLine();
                System.out.println("Podaj imie: ");
                imie = nowy.nextLine();
                System.out.println("Podaj nazwisko: ");
                nazwisko = nowy.nextLine();
                System.out.println("Podaj wiek: ");
                wiek = nowy.nextInt();
                System.out.println("Podaj datę urodzenia: ");
                nowy.nextLine();
                dataUrodzenia = nowy.nextLine();
                System.out.println("Dane zostały wprowadzone");
                s.addStudent(new Student(imie, nazwisko, wiek, dataUrodzenia));
              }
              catch (IOException e) {}
                break;
            }
        case 2:
          {
            try
            {
              Service1 s = new Service1();
              var students = s.getStudents();
              for(Student current : students)
              {
              System.out.println(current.ToString());
              }
              }
              catch (IOException e) {}
            }
          }
      }
  


  }
  
