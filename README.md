# Parcial final Web - Backend

## Descripción
Utilizando el modelo entidad/relación proporcionado, realice las siguientes tareas:

 

Tabla: Contrato

Campos:

Id: PK BIGINT(20)

Identificador: VARCHAR(255)

Valor: DOUBLE

nombre_contratante: VARCHAR(255)

documento_contratante: VARCHAR(255)

nombre_contratantista: VARCHAR(255)

documento_contratantista: VARCHAR(255)

fecha_inicial: DATE

fecha_final: DATE

 

Parte 1: Backend

Cree una aplicación backend utilizando Spring Boot que implemente los cinco endpoints básicos: 

Crear (insertar un nuevo registro). 
Actualizar (editar un registro existente). 
Eliminar (borrar un registro por su identificador). 
Consultar todos los registros. 
Consultar un registro por su identificador.
 

El backend deberá incluir las siguientes capas y componentes: 

Entidad: para representar la tabla de la base de datos. 
Repositorio: para la interacción con la base de datos. 
Servicio: para manejar la lógica de negocio. 
Controlador: para exponer las APIs REST. 
DTO (Data Transfer Object): para la transferencia de datos entre las capas. 
ModelMapper: para mapear automáticamente entre entidades y DTOs.
 

Parte 2: Frontend

Cree una aplicación frontend utilizando Angular que permita realizar las siguientes acciones: 

Insertar valores en la base de datos. 
Mostrar todos los registros almacenados.
 

Cada acción debe implementarse en un componente diferente. El proyecto deberá incluir los siguientes elementos: 

Modelos: para representar la estructura de los datos. 
Servicios: para interactuar con el backend. 
Componentes: para gestionar las vistas y la interacción del usuario.