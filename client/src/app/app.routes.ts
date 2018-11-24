import {Routes} from "@angular/router";
import {IndexComponent} from "./pages/index/index.component";
import {WelcomeComponent} from "./pages/welcome/welcome.component";
import {GraphqlComponent} from "./test/graphql/graphql.component";
import {RegistrationComponent} from "./components/registration/registration.component";
import {LoginComponent} from "./components/login/login.component";
import {NotFoundComponent} from "./error/not-found/not-found.component";


export const routes: Routes = [
  {path: '', component: IndexComponent},
  {path: 'welcome', component: WelcomeComponent},
  {path: 'graphql', component: GraphqlComponent},
  {path: 'register', component: RegistrationComponent},
  {path: 'login', component: LoginComponent},
  {path: '**', component: NotFoundComponent},
];
