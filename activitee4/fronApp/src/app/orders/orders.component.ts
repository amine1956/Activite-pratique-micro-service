import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {
  orders:any[] = [];
  customerid!:number;

  constructor(private http:HttpClient,private router:Router,private route:ActivatedRoute) {
    this.customerid = this.route.snapshot.params['customerid'];
   }

  ngOnInit(): void {
    this.http.get<any>('http://localhost:8083/orders/search/byCustomer?projection=fullOrder&CustomerId='+this.customerid).subscribe(
      response => {
        this.orders = response["_embedded"]["orders"];
      }
    );
  }   

  getOrderDetails(order: any){
    this.router.navigateByUrl("/orderdetails/"+1);
  
  }

   

}
