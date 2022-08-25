import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { HeaderComponent } from './components/header/header.component';
import { APLogoComponent } from './components/aplogo/aplogo.component';
import { SocialComponent } from './components/social/social.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { LaboralComponent } from './components/laboral/laboral.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HardysoftComponent } from './components/hardysoft/hardysoft.component';
import { ProyectoComponent } from './components/proyecto/proyecto.component';
import { FooterComponent } from './components/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    APLogoComponent,
    SocialComponent,
    BannerComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    LaboralComponent,
    HardysoftComponent,
    ProyectoComponent,
    FooterComponent,
  ],

  imports: [

    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    NgCircleProgressModule.forRoot({})

    ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
