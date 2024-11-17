package Classes;

import java.util.ArrayList;
import java.util.List;

public class EmployeesList {
    /**
     * Лист, в котором собраны сотрудники
     */
    private List<Employee> employeesList;

    public EmployeesList() {
        this.employeesList = new ArrayList<>();
    }

//    public EmployeesList() {
//        this.employeesList = new employeesList();
//    }

    /**
     * Метод добавления сотрудников в список
     * @param empl данные по сотруднику
     */
    public void addEmpl(Employee empl){
        employeesList.add(empl);
    }

    /**
     * Метод поиска сотрудников со стажем больше заданного
     * @param length искомый стаж
     * @return список сотрудников с большим стажем
     */
    public ArrayList<Employee> getEmlByLengthOfService(int length){
        ArrayList<Employee> employeesListOfLength = new ArrayList<>();
        for (Employee empl : employeesList) {
            if (empl.getLengthOfServiceEml() >= length) {
                employeesListOfLength.add(empl);
            }
        }
        return employeesListOfLength;
    }

    /**
     * Метод поиска телефона сотрудника по имени
     * @param name имя искомого сотрудника
     * @return номер или список номеров сотрудников с одинаковыми именами
     */
    public ArrayList<String> getPhoneNumberList(String name){
        ArrayList<String> phoneNumberList = new ArrayList<String>();
        for (Employee empl : employeesList) {
            if (empl.getNameEmpl().equals(name)) {
                phoneNumberList.add(empl.getPhoneNumberEmpl());
            }
        }
        if (phoneNumberList.isEmpty()){
            phoneNumberList.add("Такого сотрудника не найдено");
        }
        return phoneNumberList;
    }

    /**
     * Метод поиска сотруднико по табельному номеру
     * @param number передаваемый табельный номер
     * @return сотрудника, если совпал табельный номер
     */
    public Employee getEmplByServiceNumber(int number){
        for (Employee empl : employeesList) {
            if (empl.getServiceNumberEmpl() == number) {
                return empl;
            }
        }
        return null;
    }
}
