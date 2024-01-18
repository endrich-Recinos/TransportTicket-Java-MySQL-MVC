# Punto de Venta de Boletos de Transporte

Este proyecto es un sistema de punto de venta de boletos de transporte desarrollado en Java, utilizando MySQL como base de datos y siguiendo el patrón de diseño Modelo-Vista-Controlador (MVC). La aplicación permite gestionar la venta de boletos de transporte de manera eficiente.

## Características Principales

- **MVC Design Pattern**: El proyecto sigue el patrón de diseño Modelo-Vista-Controlador para una estructura organizada y mantenible.
- **Java Swing**: La interfaz de usuario se implementa utilizando Java Swing para una experiencia de usuario intuitiva.
- **Base de Datos MySQL**: La información sobre boletos, clientes y transacciones se almacena y gestiona en una base de datos MySQL.

## Requisitos Previos

Asegúrate de tener instalados los siguientes componentes:

- Java Development Kit (JDK)
- MySQL Database

## Configuración de la Base de Datos

1. Ejecuta el script SQL en `database/setup.sql` para crear la base de datos y las tablas necesarias.

```bash
mysql -u tu_usuario -p < database/setup.sql
