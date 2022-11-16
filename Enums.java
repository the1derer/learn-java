/*
 * Used to define a constant like days of week & month.
 * Increases readability of code.
 */

enum UserStatus {
    PENDING("P"), ACTIVE("A"), INACTIVE("I"), DELETED("D");
    
    private String statusCode;

    private UserStatus(String s) {
        statusCode = s;
    }

    public String getStatusCode() {
        return statusCode;
    }
}

class TestConstuctor {
    public static void main(String[] args) {
        System.out.println(UserStatus.ACTIVE.getStatusCode());
    }
}

//-----------------------------------------
/*TODO: Not able to understand
enums Day {
    MONDAY(1) {
        public Day next() { return TUESDAY;} // each instance provides its implementation to abstract method
    },
    TUESDAY(1) {
        public Day next() { return WEDNESDAY;} // each instance provides its implementation to abstract method
    },
    WEDNESDAY(1) {
        public Day next() { return THURSDAY;} // each instance provides its implementation to abstract method
    },
    THURSDAY(1) {
        public Day next() { return FRIDAY;} // each instance provides its implementation to abstract method
    },
    FRIDAY(1) {
        public Day next() { return SATURDAY;} // each instance provides its implementation to abstract method
    },
    SATURDAY(1) {
        public Day next() { return SUNDAY;} // each instance provides its implementation to abstract method
    },
    SUNDAY(1) {
        public Day next() { return MONDAY;} // each instance provides its implementation to abstract method
    };

    public abstract Day next();
    private final int dayNumber();

    Day(int dayNumber) { // consturctor
        this.dayNumber = dayNumber;
    }

    int getDayNumber() {
        return dayNumber;
    }
}

public class DayTestAbstract {
    public static void main(String[] args) {
                
    }
}

*/

//-------------------------------
// Enum Switch case

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class EnumTest {
    private Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void tell() {
        switch(day) {
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are bettter");
                break;
            case SATURDAY: case SUNDAY: // same output for >1 cases
                System.out.println("Weekends are best");
                break;
            default:
                System.out.println("Weekdays are so-so");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tell();

        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tell();

        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tell();
    }
}

//--------------------------------------

// enums in class
class EnumsInClass {
    public enum Season{WINTER, SPRING, SUMMER, FALL}

    public static void main(String[] args) {
        for (Season s: Season.values())
            System.out.println(s);
    }
}

//-----------------------
// Enums Consturctor

enum Apple {
    A(10), B(9), C(12), D(15), E(8);

    private int price; // price of each apple

    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

class EnumConstuctor{
    public static void main(String[] args) {
        System.out.println("All apple prices");

        for(Apple a: Apple.values())
            System.out.println(a.getPrice());
    }
}

// ----------------------------------------
// Enum Equals
enum Week {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}

class EnumEquals {
    public static void main(String[] args) {
        Week day1, day2, day3;
        day1 = Week.Monday;
        day2 = Week.Monday;
        day3 = Week.Tuesday;

        if(!day1.equals(day2))
            System.out.println("Error!");
        if(!day1.equals(day3))
            System.out.println(day1+" not equals "+day3);
        if(day2 != day3)
            System.out.println(day2+" != "+day3);
        if(day1 == day2)
            System.out.println(day1+" == "+day2);
    }
}

// -------------------
// Enum Compares to
class EnumCompareTo {
    public static void main(String[] args) {
        Week day1, day2, day3;
        day1 = Week.Monday;
        day2 = Week.Tuesday;
        day3 = Week.Friday;

        if(day1.compareTo(day2)<0)
            System.out.println(day1+"comes before"+day2);
        if(day2.compareTo(day3)>0)
            System.out.println(day2+"comes before"+day3);
        if(day1.compareTo(day3)==0)
            System.out.println(day1+"equals"+day3);

        System.out.println(day2.compareTo(day3));
    }
}

/*
 * --------------------------------------------------------
 * ordinal() fn
 */

class Ordinal {
    public static void main(String[] args) {
        // obtain all ordinal values using ordinal

        System.out.println(("here are all week constants " + "and their ordinal values:"));

        Week day1[] = Week.values();
        for(int i=0; i<day1.length;i++) {
            System.out.println(day1[i].ordinal());
        }

        for(Week day : Week.values())
            System.out.println(day+" "+day.ordinal());
    }
}

/*-----------------------------------------------------------------
 * valueOf()
 */
class EnumValueOf {
    public static void main(String[] args) {
        Week day;

        day = Week.valueOf("Monday");
        System.out.println(day);
        day = Week.valueOf("Tuesday");
        System.out.println(day);
    }
}

/*----------------------------------------------------------------------
 * values()
 */

 class EnumValues {
    public static void main(String[] args) {
        Week [] allWeek = Week.values();

        for(Week aday : allWeek) {
            System.out.println(aday);
        }
    }
 }

/*-------------------------------------------------------------------------
 * Exxample
 */
enum myCars {
    HONDA, BMW, LANDROVER
}

class MyEnum {
    public static void main(String[] args) {
        myCars currentCar = myCars.LANDROVER;

        System.out.println("Current car: "+currentCar);
    }
}

// More detailed: https://www.baeldung.com/a-guide-to-java-enums