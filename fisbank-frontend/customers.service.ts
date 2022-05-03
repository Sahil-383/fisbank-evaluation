import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomersService {

  constructor(private httpClient: HttpClient) { }

  getAllCustomers(){
    return this.httpClient.get("http://localhost:8090/customers/v1/all");
  }
}
