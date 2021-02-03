import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Purchase } from '../common/purchase';

@Injectable({
  providedIn: 'root'
})
export class CheckoutService {

  private appUrl = environment.ecommerceAppUrl;

  private puchaseUrl = this.appUrl + "/checkout/purchase";

  constructor(private httpsClient: HttpClient) { }

  placeOrder(purchase: Purchase): Observable<any>{
    return this.httpsClient.post<Purchase>(this.puchaseUrl, purchase);
  }
}
