import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {ButtonModule} from 'primeng/button';
import {AccordionModule} from 'primeng/accordion';
import { ProductsComponent } from './products/products.component';    
// import httpclient$
import {SplitterModule} from 'primeng/splitter';
import {HttpClientModule} from '@angular/common/http';
import {TableModule} from 'primeng/table';
import { CustomersComponent } from './customers/customers.component';
import { OrdersComponent } from './orders/orders.component';
import {MenubarModule} from 'primeng/menubar';
import { NavebareComponent } from './navebare/navebare.component';
import { OrderDetailsComponent } from './order-details/order-details.component';
import {CardModule} from 'primeng/card';

                //api


@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    CustomersComponent,
    OrdersComponent,
    NavebareComponent,
    OrderDetailsComponent,
    
  ],
  imports: [
 
    BrowserModule,
    AppRoutingModule,
    ButtonModule,
    AccordionModule,
    // HttpClient
    HttpClientModule,
    TableModule,
    
    MenubarModule,
    SplitterModule,
    CardModule
    

     

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
