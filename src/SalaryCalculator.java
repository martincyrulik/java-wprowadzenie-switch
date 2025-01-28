/**
 * Napisz program, który:
 * zapisze pensję osoby (100, 2000, lub 2500)
 * obliczy podwyżkę
 *      jeśli osoba zarabia 100, to podniesie o 1000
 *      jeśli osoba zarabia 2000, to podniesie o 200
 *      jeśli osoba zarabia 2500, to podniesie o 25
 * wyświetli pensję po podwyżce
 * obliczy i wyświetli o ile procent wzrosła pensja
 */

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary_1 = 100;
        double salary_2 = 2000;
        double salary_3 = 2500;
        double raiseSalary1 = 1;
        double raiseSalary2 = 2;
        double raiseSalary3 = 3;
        double salary = 1;
        double raisePercentage_1;
        double raisePercentage_2;
        double raisePercentage_3;
        int option;

        System.out.println("Salarys before raise:");
        System.out.println("Salary 1 person: " + salary_1);
        System.out.println("Salary 2 person: " + salary_2);
        System.out.println("Salary 3 person: " + salary_3);

        option = 100;
        switch (option) {
            case 100:
                raiseSalary1 = salary_1 + 1000;
                break;
            case 2000:
                raiseSalary2 = salary_2 + 200;
                break;
            case 2500:
                raiseSalary3 = salary_3 + 25;
                break;
            default:
                break;
        }
        option = 2000;
        switch (option) {
            case 100:
                raiseSalary1 = salary_1 + 1000;
                break;
            case 2000:
                raiseSalary2 = salary_2 + 200;
                break;
            case 2500:
                raiseSalary3 = salary_3 + 25;
                break;
            default:
                break;
        }
        option = 2500;
        switch (option) {
            case 100:
                raiseSalary1 = salary_1 + 1000;
                break;
            case 2000:
                raiseSalary2 = salary_2 + 200;
                break;
            case 2500:
                raiseSalary3 = salary_3 + 25;
                break;
            default:
                break;
        }
        System.out.println();
        System.out.println("Salaries after raise:");
        System.out.println("Salary 1 person: " + raiseSalary1);
        System.out.println("Salary 2 person: " + raiseSalary2);
        System.out.println("Salary 3 person: " + raiseSalary3);
        System.out.println();

        raisePercentage_1 = ((raiseSalary1 - salary_1)/salary_1) * 100;
        raisePercentage_2 = ((raiseSalary2 - salary_2)/salary_2) * 100;
        raisePercentage_3 = ((raiseSalary3 - salary_3)/salary_3) * 100;

        System.out.println("Percentage increse of salaries:");
        System.out.println("First salary: " + raisePercentage_1 +"%");
        System.out.println("First salary: " + raisePercentage_2 +"%");
        System.out.println("First salary: " + raisePercentage_3 +"%");
    }
}
