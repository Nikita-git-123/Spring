package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repo.AddrRepo;
import in.ashokit.repo.EmpRepo;

@Service
public class EmployeeAddrService {

	@Autowired
	private AddrRepo addrRepo;
	
	@Autowired
	private EmpRepo empRepo;
	
	public void saveEmpWithAddr() {
		
		Employee emp = new Employee();
		emp.setEmpName("Nikita");
		emp.setEmpSal(1000.00);
		
		Address a1 = new Address();
		a1.setAddrState("Maharashtra");
		a1.setAddrCity("Thane");
		a1.setAddrType("Permanent");
		
		Address a2 = new Address();
		a2.setAddrState("Maharashtra");
		a2.setAddrCity("Pune");
		a2.setAddrType("Present");
		
		List<Address> addrList = Arrays.asList(a1,a2);
		emp.setAddr(addrList);
		
		a1.setEmp(emp);
		a2.setEmp(emp);
		
		empRepo.save(emp);
	}
	
	public void deleteEmp() {
		empRepo.deleteById(2);
	}
	
	public void getAddr() {
		addrRepo.findById(2);
	}

	public void getEmp() {
		Optional<Employee> byId = empRepo.findById(1);
		if(byId.isPresent()) {
			System.out.println("Id : " + byId.get());
		}
	}
}
