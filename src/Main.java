//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan ";
        String lastName = " Ivanov ";
        String middleName = "Ivanovich";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println("Задание 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("Задание 3");

        String middleNameTwo = "Иванов ";
        String firstNameTwo = "Семён ";
        String lastNameTwo = "Семёнович";
        fullName = middleNameTwo + firstNameTwo.replace("ё", "е")
                + lastNameTwo.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}