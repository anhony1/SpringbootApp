import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {author} from "../models/author";

@Injectable({
  providedIn: 'root'
})
export class TestingService {

  api = 'http://localhost:4200';

  constructor(private httpClient: HttpClient) { }

  public getAuthors(): Observable<author>{
    const apiUrl = `${this.api}/api/authors`;
    return this.httpClient.get<author>(apiUrl);
  }


}
