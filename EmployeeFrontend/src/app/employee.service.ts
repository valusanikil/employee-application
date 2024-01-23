import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private httpClient:HttpClient) { }

  public registerEmployee(employee:Employee):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8080/employees/employee",employee);
  }

  public getEmployees():Observable<any>{
    return this.httpClient.get("http://localhost:8080/employees");
  }

  public getEmployeeById(employeeId:number|undefined):Observable<any>{
    return this.httpClient.get("http://localhost:8080/employees/"+employeeId);
  }
}
