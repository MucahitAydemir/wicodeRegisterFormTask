import { Injectable } from '@angular/core';
import {HttpClient , HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(public http:HttpClient) { }

  saveData(DataToSend) 
  {
    var url = "http://localhost:8080/api/register";
    return this.http.post(url,DataToSend,
    {
      headers: new HttpHeaders(
      {"content-Type":"application/json"})
    });
  }
}
