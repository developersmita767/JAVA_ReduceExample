package Java_8;


import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {
		/**
		 * Find the Sum of square of each element in a list
		 */
		List<Integer> list=List.of(1,2,3,4,5,6,7,8);
		int res=list.stream().reduce(0, (a,b)->a+b);
		System.out.println("Sum="+res);
		/**
		 * Find Salary of all the employees
		 */
		 Employee e1=new Employee("1", "Dinesh", 10000.0, 40);
		 Employee e2=new Employee("2", "Ramesh", 50000.0, 32);
		 Employee e3=new Employee("3", "Suresh", 12000.0, 36);
		 Employee e4=new Employee("4", "Rahul", 20000.0, 40);
		 List<Employee> empList=List.of(e1,e2,e3,e4);
		 double totalSalary=empList.stream().mapToDouble(a->a.getSalary())
				 				   .reduce(0,(a,b)->a+b);
		 System.out.println("Total salary:"+totalSalary);
	}

}
