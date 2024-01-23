import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';

@Component({
  selector: 'app-employeeregister',
  templateUrl: './employeeregister.component.html',
  styleUrls: ['./employeeregister.component.css']
})
export class EmployeeregisterComponent implements OnInit {

  employee=new Employee();
  message='';

  constructor(private employeeService:EmployeeService) { }

  ngOnInit(): void {
  }

  employeeregistration(){
    this.employeeService.registerEmployee(this.employee).subscribe(
      data=>{
        console.log("Registered successfully");
        this.message="Registered Successfully";
      },
      error=>{
        console.log("erorr and exception");
      }
    )
  }

}
