import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {blogPost} from "../../models/blog-post";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class BlogPostService {

  api = 'http://localhost:4200/api';

  constructor(private httpClient: HttpClient) { }

  public getBlogPosts(): Observable<blogPost>{
    const apiUrl = `${this.api}/blogPost`;
    return this.httpClient.get<blogPost>(apiUrl);
  }

}
