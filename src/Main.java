import Classes.Employee;
import Classes.EmployeesList;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        EmployeesList employeesList = new EmployeesList();

        employeesList.addEmpl(new Employee(1,
                "79991112233",
                "Иван Егорович",
                7));
        employeesList.addEmpl(new Employee(2,
                "79880002233",
                "Егор Георгиевич",
                2));
        employeesList.addEmpl(new Employee(3,
                "79001112244",
                "Георг Григорьевич",
                5));
        employeesList.addEmpl(new Employee(4,
                "7911654321",
                "Степа",
                1));

        /**
         * Поиск сотрудников по стажу
         */
        System.out.println(employeesList.getEmlByLengthOfService(3));
        // [Работник {табельный номер =1, номер телефона =79991112233, имя ='Иван Егорович', стаж работы =7},
        // Работник {табельный номер =3, номер телефона =79001112244, имя ='Георг Григорьевич', стаж работы =5}]

        /**
         * Поиск телефона по имени
         */
        System.out.println(employeesList.getPhoneNumberList("Егор Георгиеви"));
        //[Такого сотрудника не найдено]

        /**
         * Поиск сотрудника по табельному номеру
         */
        System.out.println(employeesList.getEmplByServiceNumber(3));
        //Работник {табельный номер =3, номер телефона =79001112244, имя ='Георг Григорьевич', стаж работы =5}
    }
}