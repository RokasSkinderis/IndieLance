import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {
  feed: boolean;
  service: boolean;

  constructor() {
    this.feed = true;
    this.service = false;
  }

  showFeed() {
    this.feed = true;
  }

  showService() {
    this.service = true;
  }

  ngOnInit() {
  }

}
