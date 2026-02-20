import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import {
  ConsultaService,
  ConsultaResponse,
} from '../../services/consulta.service';

@Component({
  selector: 'app-consulta',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './consulta.component.html',
  styleUrls: ['./consulta.component.css'],
})
export class ConsultaComponent {
  cedulaInput: string = '';
  resultado: ConsultaResponse | null = null;
  error: string | null = null;
  loading: boolean = false;

  constructor(private consultaService: ConsultaService) {}

  buscar() {
    if (!this.cedulaInput) return;

    this.loading = true;
    this.error = null;
    this.resultado = null;

    this.consultaService.consultarPorCedula(this.cedulaInput).subscribe({
      next: (data) => {
        this.resultado = data;
        this.loading = false;
      },
      error: (err) => {
        this.error = 'No se encontró a la persona con esa cédula.';
        this.loading = false;
      },
    });
  }
}
