# 🚀 Sistema de Consulta: Persona & Funcionario

Este proyecto es una solución Full-Stack diseñada para gestionar ciudadanos e identificar automáticamente quiénes poseen el rol de funcionario dentro de la organización.

---

## 🏗️ Arquitectura y Clean Code
La aplicación sigue principios de **Clean Architecture**, separando las responsabilidades en capas para garantizar escalabilidad y facilidad de mantenimiento:

* **Entidades:** Modelado de datos con JPA.
* **DTOs (Data Transfer Objects):** Uso de patrones Request/Response para no exponer las entidades de base de datos directamente.
* **Servicios:** Lógica de negocio centralizada.
* **Controladores:** Endpoints REST bien definidos.



---

## 🛠️ Tecnologías Utilizadas

### Backend
* **Java 17** & **Spring Boot 3.x**
* **Spring Data JPA** (Persistencia)
* **H2 Database** (Base de datos en memoria para pruebas rápidas)
* **Lombok** (Código limpio y reducción de boilerplate)

### Frontend
* **Angular 17+**
* **Standalone Components** (Arquitectura moderna sin NgModules pesados)
* **Nginx** (Servidor web para producción en contenedor)

### Infraestructura
* **Docker** & **Docker Compose** (Orquestación completa)

---

## 🚀 Ejecución con Docker

Para levantar el entorno completo, asegúrate de estar en la raíz del proyecto y ejecuta:

```bash
docker-compose up --build
