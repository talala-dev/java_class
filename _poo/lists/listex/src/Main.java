import entities.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<Employee> list = new ArrayList<>();
    IO.println("");
    IO.println("How many employees will be registered?:");
    int N = sc.nextInt();
    IO.println("How many employees will be registered?:");
    for (int i = 0; i < N; i++) {
        IO.println("Employee#: " + (i + 1) + ":");
        IO.print("ID: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        IO.print("Name: ");
        String name = sc.nextLine();
        IO.print("Salary: ");
        Double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        list.add(emp);
    }
    IO.print("Enter the employee id that will have salary  increase: ");
    int idincrease = sc.nextInt();
    Integer pos = idFinder(list, idincrease);
    if(pos == null){
        IO.println("The id does not exist!.");
    }else{
        IO.println("Enter the percentage: ");
        double percent = sc.nextDouble();
        list.get(pos).increaseSalary(percent);
    }
    IO.println("");
    IO.println("List of employees: ");
    for(Employee emp : list){
        IO.println(emp);
    }

    sc.close();
}

        static Integer idFinder(List<Employee> list, int id) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId().equals(id)){
                    return i;
                }
            }
            return null;
        }
