import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

import { Iveempleado } from './modelo/iveempleado';

import { IveempleadoService } from './servicios/iveempleado/iveempleado.service';
import { IvetipovacService } from './servicios/ivetipovac/ivetipovac.service';
import { IvevacunacionService } from './servicios/ivevacunacion/ivevacunacion.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
  loginfrm: FormGroup;

  iveempleadofrm: FormGroup;
  rol: number;
  iveempl: Iveempleado;
  ivetipovac: any;
  ivevacunacion: any;

  constructor(
    private router: Router, 
    public fb: FormBuilder,
    public iveempleadoService: IveempleadoService,    
    private http: HttpClient
    ){
    
    }

  ngOnInit(): void {
    
    this.loginfrm = this.fb.group({
      usuario : ['', Validators.required],
      contras : ['', Validators.required]
    });

  }

  ofLogin(){    
    console.log("ofLogin " + this.loginfrm?.value.usuario);
    this.iveempleadoService.ofLogin(this.loginfrm?.value.usuario, this.loginfrm?.value.contras);
    // this.iveempleadoService.ofLogin(this.loginfrm?.value.usuario, this.loginfrm?.value.contras).subscribe(
    //   data => {this.rol = data;}
    // );
    // if(this.iveempl.rolempl = 1){
    //   alert("Rol Administrador");
      this.router.navigate(["listarol1"]);
    // }else{
    //   alert("Rol Usuario Normal");
    //   this.router.navigate(["listarol2"]);
    // }
    

    
  }
   

}