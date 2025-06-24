package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById ===");
		Department dep = depDao.findById(3);
		System.out.println(dep);
				
		System.out.println("\n=== TEST 2: department insert ===");
		Department newDep = new Department(null, "Automobiles");
		depDao.insert(newDep);
		System.out.println("Inserted! New Id = " + newDep.getId());
		
		System.out.println("\n=== TEST 3: department update ===");
		dep = depDao.findById(1);
		dep.setName("Food");
		depDao.update(dep);
		System.out.println("Updated completed!");
	}

}
