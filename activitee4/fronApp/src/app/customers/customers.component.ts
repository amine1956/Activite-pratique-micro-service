import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../model/customer.model';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {
customers: Customer[] = [];
  constructor(private http: HttpClient,private router: Router) { 
    this.http.get<any>('http://localhost:9999/customer-service/customers?projection=fullCustomer').subscribe(
      response => {
        this.customers = response["_embedded"]["customers"];
      }
    );
  
  }
  getOrder(customer: any){
    this.router.navigateByUrl("/orders/"+customer.id);
    //rederiect to orders with rou

  }


  ngOnInit(): void {
  }

}
