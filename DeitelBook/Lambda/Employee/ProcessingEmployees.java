import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * ProcessingEmployees
 */
public class ProcessingEmployees {

    public static void main(String[] args) {
        
        // inicializa o array de Employees
        Employee[] employees = {
            new Employee("Jason", "Red", 5000, "IT"),
            new Employee("Ashley", "Green", 7600, "IT"),
            new Employee("Matthew", "Indigo", 3587.5, "Sales"),
            new Employee("James", "Indigo", 4700.77, "Marketing"),
            new Employee("Luke", "Indigo", 6200, "IT"),
            new Employee("Jason", "Blue", 3200, "sales"),
            new Employee("Wendy", "Brown", 4236.4, "Marketing")
        };

        // obtém a visualização List de Employees
        List<Employee> list = Arrays.asList(employees);

        // exibe todos os Employees
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);

        // Predicate que retorna true para salários entre 4000 e 6000
        Predicate<Employee> fourToSixThousand = 
            e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

        // Exibe os Employees com salários entre 4000 e 6000
        // classificados em ordem crescente por salário
        System.out.println("\nEmployees earnings $4000-$6000 per month sorted by salary:");
        list.stream()
            .filter(fourToSixThousand)
            .sorted(Comparator.comparing(Employee::getSalary))
            .forEach(System.out::println);

        // Exibe o primeiro Employee com salário entre 4000 e 6000
        System.out.printf("\nFirst employee who earns $4000-$6000:\n%s\n", 
            list.stream()
            .filter(fourToSixThousand)
            // .sorted(Comparator.comparing(Employee::getSalary))
            .findFirst()
            .get()
        );

        // Functions para obter o nome e o sobrenome de um Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName  = Employee::getLastName;

        // Comparator para comparar Employees pelo nome, então pelo sobrenome
        Comparator<Employee> lastThenFirst = 
            Comparator.comparing(byLastName).thenComparing(byFirstName);

        // Classifica funcionários pelo sobrenome e, então, pelo nome
        System.out.println("\nEmployees in ascending order by last name the first:");
        list.stream()
            .sorted(lastThenFirst)
            .forEach(System.out::println);

        // classifica funcionários em ordem decrescente pelo sobrenome e, então, pelo nome
        System.out.println("\nEmployees in descending order by last name then first:");
        list.stream()
            .sorted(lastThenFirst.reversed())
            .forEach(System.out::println);

        // exibe os sobrenomes únicos dos funcionários classificados
        System.out.println("\nUnique employee last names");
        list.stream()
            .map(Employee::getLastName)
            .distinct()
            .sorted()
            .forEach(System.out::println);

        // Exibe apenas nome e o sobrenome
        System.out.println("\nEmployee names in order by last name then first name:");
        list.stream()
            .sorted(lastThenFirst)
            .map(Employee::getName)
            .forEach(System.out::println);

        // agrupa Employees por departamento
        System.out.println("\nEmployees by department:");
        Map<String, List<Employee>> groupedByDepartment =
            list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDepartment.forEach((department, employeesInDepartment) -> {
            System.out.println(department);
            employeesInDepartment.forEach(
                employee -> System.out.printf("     %s\n", employee)
            );
        });

        // Conta o número de Employees em cada departamento
        System.out.println("\nCount of Employees by department:");
        Map<String, Long> employeeCountByDepartment =
            list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        employeeCountByDepartment.forEach((department, count) -> 
            System.out.printf("%s has %d employee(s)\n", department, count)
        );

        // soma os salários dos Employees com o método da soma DoubleStream
        System.out.printf("\nSum of Employees' salaries (via sum method): %.2f\n", 
            list.stream()
                .mapToDouble(Employee::getSalary)
                .sum()
        );

        // calcula a soma dos salários dos Employees com o método reduce Stream
        System.out.printf("\nSum of Employees' salaries (via reduce method): %.2f\n", 
            list.stream()
                .mapToDouble(Employee::getSalary)
                .reduce(0, (x, y) -> x + y)
        );

        // calcula a média de salários dos Employees o método average DoubleStream
        System.out.printf("\nAverage of Employees' salaries: %.2f\n", 
            list.stream()
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0)
        );

    }
}

/*
Collectors.groupinigBy() ele pega as referencias do fluxo e armazena num map de 
acordo um valor retornado
*/