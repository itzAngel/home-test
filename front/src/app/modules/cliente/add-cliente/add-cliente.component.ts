import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { Cliente } from 'src/app/models/cliente';
import { ClienteService } from 'src/app/services/cliente.service';

@Component({
  selector: 'app-add-cliente',
  templateUrl: './add-cliente.component.html',
  styleUrls: ['./add-cliente.component.css']
})
export class AddClienteComponent implements OnInit {

  cliente: Cliente = new Cliente();
  clientes: Cliente[] = [];

  constructor(public dialog: MatDialog, public service: ClienteService, private _snackBar: MatSnackBar,
    public router:Router) { }

  ngOnInit(): void {
  }

  openSnackBar(mensaje: string) {
    this._snackBar.open(mensaje, 'OK', {
      duration: 1000,
      horizontalPosition: "center",
      verticalPosition: "top",
    });
  }

  limpiar() {
    this.cliente = new Cliente();
  }

  validar() {
    if (this.cliente.dniCliente != null && this.cliente.nombre != null &&  this.cliente.apellido != null && 
      this.cliente.telefeno != null && this.cliente.provincia != null && this.cliente.distrito != null && 
      this.cliente.direccion != null && this.cliente.idCliente != null && this.cliente.contrasena) {
      return true;
    } else {
      return false;
    }
  }

  Guardar(cliente: Cliente) {
    if (this.validar()) {
      this.service.createCliente(cliente).subscribe(data => {
          this.openSnackBar("Categoria se agrego con exito");
          this.limpiar();
          this.router.navigate(['listarCliente']);
      });
    } else {
      this.openSnackBar("Llena todos los campos del cliente");
    }
  }

}
