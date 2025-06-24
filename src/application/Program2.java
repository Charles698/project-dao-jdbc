package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById ===");
		Department dep = depDao.findById(3);
		System.out.println(dep);
			
		System.out.println("\n=== TEST 2: findAll ===");
		List<Department> list = depDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: department insert ===");
		Department newDep = new Department(null, "Automobiles");
		depDao.insert(newDep);
		System.out.println("Inserted! New Id = " + newDep.getId());
		
		System.out.println("\n=== TEST 4: department update ===");
		dep = depDao.findById(1);
		dep.setName("Food");
		depDao.update(dep);
		System.out.println("Updated completed!");
		
		System.out.println("\n=== TEST 5: department delete ===");
		System.out.print("Enter id for delete teste: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Deleted completed!");
		
		sc.close();
	}

}
