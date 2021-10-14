import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';

import { ListarComponent } from './iveempleado/listar/listar.component';
import { EditarComponent } from './iveempleado/editar/editar.component';
import { AgregarComponent } from './iveempleado/agregar/agregar.component';
import { Listarol2Component } from './iveempleado/listarol2/listarol2.component';

import { IveempleadoService } from "src/app/servicios/iveempleado/iveempleado.service";

@NgModule({
  declarations: [
    AppComponent,
    ListarComponent,
    EditarComponent,
    AgregarComponent,
    Listarol2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    HttpClientModule
  ],
  providers: [IveempleadoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
