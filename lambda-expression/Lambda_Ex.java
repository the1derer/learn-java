Topic studied from following:
https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html#approach3



class Person {
  public emum Sex {
    MALE, FEMALE
  }

  String name;
  LocalDate birthday;
  Sex gender;
  String emailAddress;

  public int getAge() {

  }

  public void printPerson {

  }

  // Approach 1:
  // This apporoach is brittle, and have to change a lot a things to accomaodate even a small change
  // in class Person
  print static vodi PrintPersonOlderThan(List<Person> roster, int age) {
    for(Person p : roster) {
      if(p.getAge() >= age) {
        p.printPerson();
      }
    }
  }
// ------------------------------------------
  
// Approach 2:
// This is still somewhat brittle
  public static void printPerson(List<Person> roster, int low, int high) {
    for(Person p : roster) {
      if(low<=p.getAge() && p.getAge()<high) {
        p.printPerson();
      }
    }
  }

  // Approach 3:
  public static void printPersons(List<Person> roster, CheckPerson tester) {
    for(Person p : roster) {
      if(tester.test(p)) {
        p.printPerson();
      }
    }
  } 

  // To call above function
  printPersons(roster, new CheckPersonEligibleForSelectiveService());


  // Approach 4: Specify Search Criteria Code in Anonymous Class
  printPersons(roster, new CheckPerson() {
    public boolean test(Person p) {
      return p.getGender() == Person.Sex.MALE && p.getAge()  <= 18 && p.getAge() <= 25;
    }
  });

  // Approach 5: Specify Search Criteria Code with a Lambda Expression
  printPersons(roster, (Person p) -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25); 

  // Approach 6: Use Standard Fuctional Interfaces with Lambda Expressions
  
  // We can also use predefined `java.util.function.Predicate` interface to skip having to define a separate interace `CheckPerson`
  // interface Predicate<T> {
  //   boolean test(Person p);
  // }

  // So we can have the `printPersonsWithPredicate` as
  public static void perintPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
    for(Person p : roster) {
      if(tester.test(p)) {
        p.printPerson();
      }
    }
  } 
  // Method invocation will be same as 'Approach 5'
  
  // Approach 7: Use Lambda Expression throughtout your application
  // We will use Consume<T> interface with method `void accept(T t)`, which is as follows:
  public static void processPersons(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
    for(Person p : roster) {
      if(tester.test(p)) {
        block.accept(p);
      }
    }
  }

  // To invoke above method

  processPersons(roster, )

}

// Part of Approach 3, 4, 5
interface CheckPerson {
  boolean test(Person p)
}

class CheckPersonEligibleForSelectiveService implements CheckPerson {
  public boolean test(Person p) {
    return p.gender == Person.Sex.MALE && p.getAge() >=18 && p.getAge() <= 25;
  }
}
