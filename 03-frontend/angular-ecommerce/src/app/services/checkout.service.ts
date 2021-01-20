import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Purchase } from '../common/purchase';

@Injectable({
  providedIn: 'root'
})
export class CheckoutService {

  private puchaseUrl = "http://localhost:8080/api/checkout/purchase";

  constructor(private httpsClient: HttpClient) { }

  placeOrder(purchase: Purchase): Observable<any>{
    return this.httpsClient.post<Purchase>(this.puchaseUrl, purchase);
  }
}
