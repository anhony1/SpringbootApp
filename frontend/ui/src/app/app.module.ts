import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TestingComponentComponent } from './testing-component/testing-component.component';
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatIconModule} from "@angular/material/icon";
import {FormsModule} from "@angular/forms";
import {MatInputModule} from "@angular/material/input";
import {MatButtonModule} from "@angular/material/button";
import {MatSelectModule} from "@angular/material/select";
import {MatOptionModule} from "@angular/material/core";
import {TestingService} from "./testingService/testing.service";
import {HttpClientModule} from "@angular/common/http";
import { HeaderComponent } from './shared-components/header/header.component';
import { FooterComponent } from './shared-components/footer/footer.component';
import {MatToolbarModule} from "@angular/material/toolbar";
import {MatMenuModule} from "@angular/material/menu";
import { BlogPostComponent } from './shared-components/blog-post/blog-post.component';
import {MatCardModule} from "@angular/material/card";

@NgModule({
  declarations: [
    AppComponent,
    TestingComponentComponent,
    HeaderComponent,
    FooterComponent,
    BlogPostComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        BrowserAnimationsModule,
        MatFormFieldModule,
        MatInputModule,
        MatIconModule,
        FormsModule,
        MatButtonModule,
        MatSelectModule,
        MatOptionModule,
        HttpClientModule,
        MatToolbarModule,
        MatMenuModule,
        MatCardModule
    ],
  providers: [TestingService],
  bootstrap: [AppComponent]
})
export class AppModule { }
