import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface ConsultaResponse {
  cedula: string;
  nombres: string;
  apellidos: string;
  esFuncionario: boolean;
  cargo?: string;
  dependencia?: string;
}

@Injectable({
  providedIn: 'root',
})
export class ConsultaService {
  private apiUrl = 'http://localhost:8080/api/v1/consultas';

  constructor(private http: HttpClient) {}

  consultarPorCedula(cedula: string): Observable<ConsultaResponse> {
    return this.http.get<ConsultaResponse>(`${this.apiUrl}/${cedula}`);
  }
}
