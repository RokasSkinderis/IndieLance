import {Component, OnInit} from '@angular/core';
import {Apollo} from 'apollo-angular';
import gql from 'graphql-tag';

@Component({
  selector: 'exchange-rates',
  templateUrl: './graphql.component.html',

})
export class GraphqlComponent implements OnInit {
  rates: any;
  loading = true;
  error: any;

  constructor(private apollo: Apollo) {}

  ngOnInit() {
    this.apollo
      .watchQuery({
        query: gql`
          {
            rates(currency: "EUR") {
              currency
              rate
            }
          }
        `,
      })
      .valueChanges.subscribe(result => {
      // this.rates = result.data && result.data.rates;
      this.loading = result.loading;

      this.error = result.errors;
    });
  }
}
