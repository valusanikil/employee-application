import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employeesearch',
  templateUrl: './employeesearch.component.html',
  styleUrls: ['./employeesearch.component.css']
})
export class EmployeesearchComponent implements OnInit {

  employeeId:number|undefined;
  employee:Employee=new Employee();
  message='';
  constructor(private employeeService:EmployeeService,private router:Router) { }

  ngOnInit(): void {
  }

  onSubmit(employeeId:number|undefined){
    this.getEmployeeById(employeeId);
  }

  getEmployeeById(employeeId:number|undefined){
    this.employeeService.getEmployeeById(employeeId).subscribe(
      data=>{
        this.employee=data;
      },
      error=>{
        console.log("error");
        this.message="No employee found";
      }
    )
  }
}
