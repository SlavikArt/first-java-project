public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗавдання 1.\n");

        Person pers1 = new Person();
        pers1.setFullName("Петренко Петро Петрович");
        pers1.setBirthDate("10-07-1988");
        pers1.setPhoneNumber("+380572234567");
        pers1.setCity("Львів");
        pers1.setCountry("Україна");
        pers1.setHomeAddress("вул. Шевченка, 3");

        System.out.println("Дані про особу 1:");
        System.out.println(pers1);

        Person pers2 = new Person("Іванов Іван Іванович", "19-07-1993", "+380125687789",
                "Київ", "Україна", "вул. Хрещатик, 1");

        System.out.println("\nДані про особу 2:");
        System.out.println(pers2);

        System.out.println("\nЗагальна кількість людей: " + Person.getPersonCount());


        System.out.println("\nЗавдання 2.\n");

        City city1 = new City();
        city1.setCityName("Львів");
        city1.setRegionName("Львівська область");
        city1.setCountryName("Україна");
        city1.setPopulation(760000);
        city1.setPostalCode("79000");
        city1.setPhoneCode("+38032");

        System.out.println("Дані про місто 1:");
        System.out.println(city1);

        City city2 = new City("Київ", "Київська область",
                "Україна", 2800000, "01000", "+38044");

        System.out.println("\nДані про місто 2:");
        System.out.println(city2);


        System.out.println("\nЗавдання 3.\n");
        int a = 5, b = 3, c = 7, d = 2;

        System.out.println("Використання методів класа 'MyMath':");
        System.out.println("Вхідні параметри (5, 3, 7, 2)");

        System.out.println("Максимум: " + MyMath.findMax(a, b, c, d));
        System.out.println("Мінімум: " + MyMath.findMin(a, b, c, d));
        System.out.println("Середнє арифметичне: " + MyMath.calcAvg(a, b, c, d));
        System.out.println("Факторіал числа " + a + ": " + MyMath.factorial(a));
        System.out.println("Факторіал негативного числа: " + MyMath.factorial(-5));
    }
}
