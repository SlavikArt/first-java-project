import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public class Person {
    private String fullName;
    private LocalDate birthDate;
    private String phoneNumber;
    private String city;
    private String country;
    private String homeAddress;

    private static int personCount = 0;

    public Person() {
        personCount++;
    }

    public Person(String fullName, String birthDateStr, String phoneNumber, String city, String country, String homeAddress) {
        if (setFullName(fullName) && setBirthDate(birthDateStr) && setPhoneNumber(phoneNumber) &&
                setCity(city) && setCountry(country) && setHomeAddress(homeAddress)) {
            personCount++;
        }
    }

    public boolean setFullName(String fullName) {
        if (fullName != null && !fullName.trim().isEmpty()) {
            this.fullName = fullName;
            return true;
        }
        System.out.println("ПІБ не може бути порожнім.");
        return false;
    }

    public boolean setBirthDate(String birthDateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            this.birthDate = LocalDate.parse(birthDateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            System.out.println("Дата народження має бути у форматі 'dd-MM-yyyy' і бути коректною.");
            return false;
        }
    }

    public boolean setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("\\+?\\d{10,15}")) {
            this.phoneNumber = phoneNumber;
            return true;
        }
        System.out.println("Невірний формат телефонного номера.");
        return false;
    }

    public boolean setCity(String city) {
        if (city != null && !city.trim().isEmpty()) {
            this.city = city;
            return true;
        }
        System.out.println("Місто не може бути порожнім.");
        return false;
    }

    public boolean setCountry(String country) {
        if (country != null && !country.trim().isEmpty()) {
            this.country = country;
            return true;
        }
        System.out.println("Країна не може бути порожньою.");
        return false;
    }

    public boolean setHomeAddress(String homeAddress) {
        if (homeAddress != null && !homeAddress.trim().isEmpty()) {
            this.homeAddress = homeAddress;
            return true;
        }
        System.out.println("Домашня адреса не може бути порожньою.");
        return false;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return birthDate.format(formatter);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public static int getPersonCount() {
        return personCount;
    }

    @Override
    public String toString() {
        return "Людина [ПІБ: " + fullName + ",\nДата народження: " + getBirthDate() +
                ",\nТелефон: " + phoneNumber + ",\nМісто: " + city +
                ", Країна: " + country + ", Домашня адреса: " + homeAddress +
                ",\nЗагальна кількість людей: " + getPersonCount() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) return true;
        return toString().equals(((Person)obj).toString());
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
