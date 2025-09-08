package basicsofjdbc;

public class Driver {
	
		public static void main(String[] args) {
			
			Employee e=new Employee();
			e.setId(8);
			e.setName("gam");
			e.setSal(1500);
			EmployeeDao.saveEmployee(e);
			EmployeeDao.findAll();
		}

}

