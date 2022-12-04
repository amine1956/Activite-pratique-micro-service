import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AnyCatcher } from 'rxjs/internal/AnyCatcher';
import { Product } from '../model/product.model';

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.css']
})
export class OrderDetailsComponent implements OnInit {
  orderDetailes: any;
  orderId!:number;
  products:any[]=[];

  constructor(private http:HttpClient,private router:Router,private route:ActivatedRoute) {
    this.orderId = this.route.snapshot.params['orderid'];
    console.log(this.orderId);
  }

  ngOnInit(): void {
    this.http.get<any>('http://localhost:8083/fusllOrder/'+this.orderId).subscribe(
      response => {
        this.orderDetailes = response;
        this.products = response.productItems;
      }
    );
  }   

}
