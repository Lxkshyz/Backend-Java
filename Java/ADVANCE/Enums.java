//Enums in Java are used when you have a fixed set of constant values so ->
// code stays consistent
// you prevent invalid values
// you avoid repeating the same strings/numbers all over your project
// the compiler can catch mistakes before runtime

class Enums {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day); // returns monday
        System.out.println(day.ordinal()); // returns index
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}