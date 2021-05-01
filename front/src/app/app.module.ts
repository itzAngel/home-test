import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './shared/material/material.module';
import { DashboardComponent } from './shared/dashboard/dashboard.component';
import { DefaultComponent } from './modules/default/default.component';
import { HomeComponent } from './modules/home/home.component';
import { AddCategoriaComponent } from './modules/categoria/add-categoria/add-categoria.component';
import { ListarCategoriaComponent } from './modules/categoria/listar-categoria/listar-categoria.component';
import { EditCategoriaComponent } from './modules/categoria/edit-categoria/edit-categoria.component';
import { EditProductoComponent } from './modules/producto/edit-producto/edit-producto.component';
import { AddProductoComponent } from './modules/producto/add-producto/add-producto.component';
import { ListarProductoComponent } from './modules/producto/listar-producto/listar-producto.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    DefaultComponent,
    HomeComponent,
    AddCategoriaComponent,
    ListarCategoriaComponent,
    EditCategoriaComponent,
    EditProductoComponent,
    AddProductoComponent,
    ListarProductoComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
