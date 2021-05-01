import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddCategoriaComponent } from './modules/categoria/add-categoria/add-categoria.component';
import { EditCategoriaComponent } from './modules/categoria/edit-categoria/edit-categoria.component';
import { ListarCategoriaComponent } from './modules/categoria/listar-categoria/listar-categoria.component';
import { DefaultComponent } from './modules/default/default.component';
import { HomeComponent } from './modules/home/home.component';
import { AddProductoComponent } from './modules/producto/add-producto/add-producto.component';
import { EditProductoComponent } from './modules/producto/edit-producto/edit-producto.component';
import { ListarProductoComponent } from './modules/producto/listar-producto/listar-producto.component';
import { DashboardComponent } from './shared/dashboard/dashboard.component';

const routes: Routes = [
  {path: '', component: DefaultComponent,
    children: [
        {path: '',component: HomeComponent},
        {path: 'home',component: HomeComponent},
        {path: 'dashboard',component: DashboardComponent, 
            children: [
              {path: 'addCategoria',component: AddCategoriaComponent},
              {path: 'listarCategoria',component: ListarCategoriaComponent},
              {path: 'editCategoria',component: EditCategoriaComponent},
              {path: 'addProducto',component: AddProductoComponent},
              {path: 'listarProducto',component: ListarProductoComponent},
              {path: 'editProducto',component: EditProductoComponent},
            ]
        },
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
