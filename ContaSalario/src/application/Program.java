package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        // vai criar uma lista
		List<Employee> list = new ArrayList<>();
		
		
		// Para puxar os id/nome/salario
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			//instanciando produto e adiciona à lista
		
			Employee emp = new Employee (id, name, salary);
			list.add(emp);
		}

		
		// Irá pergunta qual id quer modificar o salario
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt(); 
		
		Integer pos = position(list, idsalary);
		
		// Verificará se o id existe ou nao, se existir fará o aumento do salario dele perguntando a porcentagem
		if (pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		// Monstrará toda a lista na tela
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}
	// Dizer qual o posição do id na lista, se nao existe retorna null
	public static Integer position(List<Employee> list ,int id) {
			for ( int i = 0 ; i < list.size();i++) {
				if (list.get(i).getId() == id ) {  // Verifica se o ID do funcionário na posição atual da lista é igual ao ID fornecido
					return i;
				}
			}
	        return null;   
	 }
	}  