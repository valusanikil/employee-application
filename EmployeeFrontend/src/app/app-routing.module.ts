import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MainComponent } from './main/main.component';
import { EmployeeregisterComponent } from './employeeregister/employeeregister.component';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { EmployeesearchComponent } from './employeesearch/employeesearch.component';

const routes: Routes = [
  {path:"",component:MainComponent},
  {path:"employeeregister",component:EmployeeregisterComponent},
  {path:"employeelist",component:EmployeelistComponent},
  {path:"employeesearch",component:EmployeesearchComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
