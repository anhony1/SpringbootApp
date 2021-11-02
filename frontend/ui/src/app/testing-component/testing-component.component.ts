import { Component, OnInit } from '@angular/core';
import {TestingService} from "../testingService/testing.service";
import {author} from "../models/author";

@Component({
  selector: 'app-testing-component',
  templateUrl: './testing-component.component.html',
  styleUrls: ['./testing-component.component.scss']
})
export class TestingComponentComponent implements OnInit {

  value = "Clear me";

  authors: author[] | undefined;

  constructor(private testService: TestingService) { }

  ngOnInit(): void {
    // @ts-ignore
    this.testService.getAuthors().subscribe( (data: author[]) => {
      this.authors = data;
      console.log(data);
    })
  }

}
