import { Component, OnInit } from '@angular/core';
import { Customers } from '../customers';
import { CustomersService } from '../customers.service';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {

  constructor(private service: CustomersService) { }

    customers:any;
  ngOnInit(): void {
    this.service.getAllCustomers()
    .subscribe(response =>{
      this.customers=response;
      console.log(response);
    });
    console.log(this.customers);
  }

}
