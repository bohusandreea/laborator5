package ro.uoradea;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner obj=new Scanner(System.in);
        System.out.println("Introduceti valoarea lui n");
        int n=obj.nextInt();

        Employee[] employees = new Employee[10];
        for(int i=1;i<=n;i++)
        {
            Employee emp=new Employee();
            Scanner num =new Scanner(System.in);
            System.out.println("Introduceti numele anajatului : " + i);
            String nume =num.nextLine();
            emp.setName(nume);

            Scanner em=new Scanner(System.in);
            System.out.println("Introduceti emailul  anajatului : " + i);
            String email1 =em.nextLine();
            emp.setEmail(email1);

            Scanner hr=new Scanner(System.in);
            System.out.println("Introduceti hour rate  anajatului : " + i);
            double hR=em.nextDouble();
            emp.setHourRate(hR);

            Scanner cap=new Scanner(System.in);
            System.out.println("Introduceti capacity anajatului : " + i);
            int capa =cap.nextInt();
            emp.setCapacity(capa);

            Scanner fd=new Scanner(System.in);
            System.out.println("Introduceti freeDays  anajatului : " + i);
            int fdd =fd.nextInt();
            emp.setFreeDays(fdd);

            System.out.println("Salariul lunar este : "+emp.calculateMonthlyIncome()+"\n");
            employees[i]=emp;













        }
    }
}
