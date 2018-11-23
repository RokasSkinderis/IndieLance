import {Routes} from "@angular/router";
import {IndexComponent} from "./pages/index/index.component";
import {WelcomeComponent} from "./components/welcome/welcome.component";


export const routes: Routes = [
    { path: '', component: IndexComponent },
    { path: 'welcome', component: WelcomeComponent },
];
