import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListarComponent } from './iveempleado/listar/listar.component';
import { Listarol2Component } from './iveempleado/listarol2/listarol2.component';

const routes: Routes = [
  {path:'listarol1', component:ListarComponent},
  {path:'listarol2', component:Listarol2Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
