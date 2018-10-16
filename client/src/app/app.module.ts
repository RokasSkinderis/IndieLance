import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {RouterModule} from "@angular/router";
import {routes} from "./app.routes";
import {HttpClientModule} from "@angular/common/http";
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { LoginComponent } from './components/login/login.component';
import { ProfileComponent } from './widgets/profile/profile.component';
import { IndexComponent } from './components/index/index.component';
import { PromotionsComponent } from './widgets/promotions/promotions.component';
import { UserActionsComponent } from './widgets/user-actions/user-actions.component';
import { FeedComponent } from './components/feed/feed.component';
import { WelcomeComponent } from './components/welcome/welcome.component';

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
        WelcomeComponent
    ],
    imports: [
        BrowserModule,
        RouterModule.forRoot(routes),
        HttpClientModule,
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {

}
