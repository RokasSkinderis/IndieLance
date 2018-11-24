import {Component, OnInit} from '@angular/core';
import {User} from "../../Models/User";
import {FormGroup, FormControl, Validators, AbstractControl} from '@angular/forms';
import {Apollo} from "apollo-angular";
import gql from "graphql-tag";

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
export class RegistrationComponent implements OnInit {

  user: User;
  loading: boolean;
  error: string;
  userMutation = gql`
  mutation user {
    users {
      name
      lastname
      email
      password
    }
  }`;

  registerForm = new FormGroup({
    firstName: new FormControl('', [
      Validators.required,
    ]),
    lastName: new FormControl('', [
      Validators.required,
    ]),
    email: new FormControl('', [
      Validators.required,
      Validators.email,
    ]),
    password: new FormControl('', [
      Validators.required,
      Validators.minLength(6),
    ]),
    // confirmPassword: new FormControl('', [
    //   Validators.required,
    //   Validators.minLength(6),
    // ]),
  });

  constructor(private apollo: Apollo) {
  }

  register() {
    this.apollo.mutate({
      mutation: this.userMutation
    }).subscribe(({data, loading}) => {
      this.loading = loading;
      this.user = data.user;
      this.error = data.errors;
    });
  }


  ngOnInit() {
  }


}
