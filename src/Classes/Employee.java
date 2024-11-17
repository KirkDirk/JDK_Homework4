package Classes;

public class Employee {
    /**
     * Табельный номер сотрудника
     */
    private Integer serviceNumberEmpl;
    /**
     * Номер телефона сотрудника
     */
    String phoneNumberEmpl;
    /**
     * Имя сотрудника
     */
    private String nameEmpl;
    /**
     * Стаж работы сотрудника
      */
    private Integer lengthOfServiceEml;

    /**
     * Конструктор класса Сотрудник
     * @param serviceNumberEmpl табельный номер сотрудника
     * @param phoneNumberEmpl телефонный номер сотрудника
     * @param nameEmpl имя сотрудника
     * @param lengthOfServiceEml стаж работы сотрудника
     */
    public Employee(Integer serviceNumberEmpl, String phoneNumberEmpl, String nameEmpl, Integer lengthOfServiceEml) {
        this.serviceNumberEmpl = serviceNumberEmpl;
        this.phoneNumberEmpl = phoneNumberEmpl;
        this.nameEmpl = nameEmpl;
        this.lengthOfServiceEml = lengthOfServiceEml;
    }

    public Employee(){
        super();
    }

    public Integer getServiceNumberEmpl() {
        return serviceNumberEmpl;
    }

    public String getPhoneNumberEmpl() {
        return phoneNumberEmpl;
    }

    public String getNameEmpl() {
        return nameEmpl;
    }

    public Integer getLengthOfServiceEml() {
        return lengthOfServiceEml;
    }

    @Override
    public String toString() {
        return "Работник {" +
                "табельный номер = " + serviceNumberEmpl +
                ", номер телефона = " + phoneNumberEmpl +
                ", имя = '" + nameEmpl + '\'' +
                ", стаж работы = " + lengthOfServiceEml +
                '}';
    }
}
