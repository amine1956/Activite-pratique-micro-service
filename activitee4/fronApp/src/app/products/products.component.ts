import { Component, OnInit } from '@angular/core';
import { Product } from '../model/product.model';
  //httpclient
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products: Product[]=[];
    constructor(private http: HttpClient) { 

    }

  ngOnInit(): void {
    this.http.get<any>('http://localhost:8082/products').subscribe(
      response => {
        this.products = response["_embedded"]["products"];
      }
    );
  }

}

