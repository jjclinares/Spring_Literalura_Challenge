# 📚 Proyecto Literalura Challenge

## 🚀 Introducción

¡Bienvenido al proyecto **Literalura Challenge**! Este es un emocionante proyecto desarrollado con **Spring Boot** que integra una API pública para la búsqueda de libros y sus autores, permitiendo almacenarlos en una base de datos local. A través de este proyecto, demuestro todo mi aprendizaje en Spring y Springboot aplicando múltiples tecnologías y conceptos avanzados en desarrollo backend.integrando funcionalidades como  CRUD completo, y protección mediante autenticación y validación. 🛠️

---

## 🛠️ Tecnologías Usadas

### Lenguajes y Frameworks
- **Java**
- **Spring Boot**: Desarrollo de aplicaciones robustas y escalables.
- **Spring Security**: Autenticación y autorización.
- **JWT (JSON Web Token)**: Protección de la API Rest.
- **Bean Validation**: Validaciones de datos.

### Bases de Datos
- **PostgreSQL**
- **MySQL**

### Herramientas
- **IntelliJ IDEA**
- **Visual Studio Code**
- **Insomnia**: Pruebas de endpoints.
- **Trello** y **Google Sheets**: Gestión del proyecto.

### Documentación y Testing
- **Swagger (Springdoc-OpenAPI)**: Documentación interactiva de la API.
- **JUnit** y **Mockito**: Creación de escenarios de prueba.

---

## ✨ Funcionalidades

### 🌟 Búsqueda de libros
- Integración con la API pública [Gutendex](https://gutendex.com/) para buscar libros por título.

### 🌟 Gestión de datos
- CRUD completo de libros y autores.
- Reglas de negocio implementadas para garantizar la integridad de los datos.

### 🌟 Seguridad y validación
- Autenticación y autorización de la API.
- Validaciones de datos usando **Bean Validation**.

### 🌟 Documentación
- API documentada con **Swagger**, permitiendo una interacción y prueba más sencilla.

### 🌟 Pruebas unitarias
- Implementación de tests con **JUnit** y **Mockito**.

### 🌟 Diseño
- Aplicación de principios **SOLID** y patrones de diseño para una arquitectura limpia.

---

## 🔧 Instalación y Uso

1. Clona este repositorio:
   ```bash
   git clone https://github.com/jjclinares/literalura-challenge.git
   ```
2. Configura tu base de datos (PostgreSQL o MySQL) en el archivo `application.properties`.
3. Ejecuta el proyecto desde tu IDE favorito:
   ```bash
   mvn spring-boot:run
   ```
4. Accede a la documentación de la API en:
   [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---


📂 Estructura del Proyecto
```
src/main/java/com/jamerchallenge/literalura_challenge
│
├── LiteraluraChallengeApplication.java
├── dto
│   ├── AutorDto.java
│   └── LibroDto.java
├── model
│   ├── Autor.java
│   └── Libro.java
├── repository
│   ├── AutorRepository.java
│   └── LibroRepository.java
├── service
│   ├── ApiClient.java
│   ├── LibroService.java
│   └── MenuService.java
├── mapper
│   └── LibroMapper.java
└── controller
    └── LibroController.java
```
## 🎯 Metodología de Desarrollo

- **Gestión de tareas**: Usamos **Trello** para organizar las actividades del proyecto.
- **Control de versiones**: **Git** y **GitHub** para mantener el historial de cambios.
- **Pruebas continuas**: Validación constante del código mediante pruebas unitarias.

---

## 📈 Aprendizajes

Este proyecto me permitió aprender y aplicar los siguientes conceptos:
- **Spring Boot** y su ecosistema.
- Desarrollo y seguridad en API Rest.
- Principios de diseño y arquitectura de software.
- Herramientas de gestión y testing.
- Buenas prácticas en documentación.

---

## 🌐 Enlaces Relacionados

- [Repositorio en GitHub](https://github.com/jjclinares/literalura-challenge)
- [Documentación de Gutendex API](https://gutendex.com/)

---


¡Gracias por visitar el proyecto! 🎉
