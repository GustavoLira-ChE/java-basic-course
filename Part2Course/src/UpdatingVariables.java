public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //Bono $200
        salary += 200;
        System.out.println(salary);
        //pensión $50
        salary -= 50;
        System.out.println(salary);
        // 2 horas extras $30 c/u
        //Comedor $45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Updating a string concat
        String employeeName = "Jonh Doe";
        employeeName = employeeName + " Johnson";
        System.out.println(employeeName);
    }
}
