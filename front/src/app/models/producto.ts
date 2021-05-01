import { Categoria } from "./categoria";

export class Producto {
    codigoProducto: string = null;
	modelo: string = null;
	talla: number = null;
    color: string = null;
	genero: string = null;
    agente: Categoria = new  Categoria();
    precio: number = null;
    cantidad: number = null;
}
