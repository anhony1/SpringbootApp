import { Component, OnInit } from '@angular/core';
import {BlogPostService} from "../../services/blog-post-service/blog-post.service";
import {blogPost} from "../../models/blog-post";

@Component({
  selector: 'app-blog-post',
  templateUrl: './blog-post.component.html',
  styleUrls: ['./blog-post.component.scss']
})
export class BlogPostComponent implements OnInit {



  blogPosts: blogPost[] | undefined;

  constructor(private blogPostService: BlogPostService ) { }

  ngOnInit(): void {

    // @ts-ignore
    this.blogPostService.getBlogPosts().subscribe((data: blogPost[]) => {
      this.blogPosts = data;
      console.log(data);
    })

  }

}
