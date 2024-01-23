import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';

@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit {

  employeeDetails:Employee[]|undefined;
  constructor(private employeeService:EmployeeService) { }

  ngOnInit(): void {
    this.getEmployeeDetails();
  }

  getEmployeeDetails(){
    this.employeeService.getEmployees().subscribe(
      data=>{
        this.employeeDetails=data;
      },
      error=>{
        console.log("Error");
        
      }
    )
  }

}
