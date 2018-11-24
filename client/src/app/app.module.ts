import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppComponent} from './app.component';
import {RouterModule} from "@angular/router";
import {routes} from "./app.routes";
import {HttpClientModule} from "@angular/common/http";
import {HeaderComponent} from './components/header/header.component';
import {FooterComponent} from './components/footer/footer.component';
import {RegistrationComponent} from './components/registration/registration.component';
import {LoginComponent} from './components/login/login.component';
import {ProfileComponent} from './widgets/profile/profile.component';
import {IndexComponent} from './pages/index/index.component';
import {PromotionsComponent} from './widgets/promotions/promotions.component';
import {UserActionsComponent} from './widgets/user-actions/user-actions.component';
import {FeedComponent} from './components/feed/feed.component';
import {WelcomeComponent} from './pages/welcome/welcome.component';
import {GraphQLModule} from './graphql.module';
import {ApolloModule, APOLLO_OPTIONS} from "apollo-angular";
import {HttpLinkModule, HttpLink} from "apollo-angular-link-http";
import {InMemoryCache} from "apollo-cache-inmemory";
import { GraphqlComponent } from './test/graphql/graphql.component';
import { FormsModule, ReactiveFormsModule} from "@angular/forms";
import { NotFoundComponent } from './error/not-found/not-found.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    RegistrationComponent,
    LoginComponent,
    ProfileComponent,
    IndexComponent,
    PromotionsComponent,
    UserActionsComponent,
    FeedComponent,
    WelcomeComponent,
    GraphqlComponent,
    NotFoundComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    HttpClientModule,
    GraphQLModule,
    ApolloModule,
    HttpLinkModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [{
    provide: APOLLO_OPTIONS,
    useFactory(httpLink: HttpLink) {
      return {
        cache: new InMemoryCache(),
        link: httpLink.create({
          uri: "https://w5xlvm3vzz.lp.gql.zone/graphql"
        })
      }
    },
    deps: [HttpLink]
  }],
  bootstrap: [AppComponent]
})
export class AppModule {

}
