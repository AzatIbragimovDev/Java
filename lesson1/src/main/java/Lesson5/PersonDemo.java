package Lesson5;

public class PersonDemo {
    public static void main(String[] args) {

        Employee pers = new Employee("Azat Ibragimov", "engineer", "mail@inbox.ru",  89030615, 50, 33);
        pers.printPerson();

        Employee[] persons = new Employee[5];
        persons[0] = new Employee("Ivanov Ivan", "carrier", "mailbox@mail.ru", 5437623, 25.500, 28);
        persons[1] = new Employee("Sidorov Anton", "economist", "Sidorov@mail.ru", 5432244, 43000, 42);
        persons[2] = new Employee("Mykhaylov Sergei", "engineer", "Mykhaylov@mail.ru", 554653, 34.500, 38);
        persons[3] = new Employee("Dzebisov Aleksandr", "manager", "Dzebisov@mail.ru", 542156, 42.400, 55);
        persons[4] = new Employee("Vakin Denis", "director", "Vakin@mail.ru", 575533, 21.300, 34);

            for (int i = 0; i < persons.length; i++) {
                if(persons[i].getAge() >= 40) {
                    System.out.println(persons[i]);
                }
            }
    }
}




