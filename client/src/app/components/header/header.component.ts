import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Apollo} from "apollo-angular";
import gql from "graphql-tag";
import {User} from "../../Models/User";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {
  loggedIn: boolean;
  loading: boolean;
  error: any;
  user: User;
  userQuery = gql`
  query user {
    users {
      name
      password
    }
  }`;

  loginForm = new FormGroup({
    email: new FormControl('', [
      Validators.required,
      Validators.email,
    ]),
    password: new FormControl('', [
      Validators.required,
      Validators.minLength(6),
    ]),
  });

  constructor(private apollo: Apollo) {
    this.loggedIn = false;
  }

  login() {
    this.apollo.watchQuery({
      query: this.userQuery
    }).valueChanges
      .subscribe(({data, loading}) => {
        this.loading = loading;
        this.user = data.user;
        this.error = data.errors;
      });
  }

  ngOnInit() {
  }

}
