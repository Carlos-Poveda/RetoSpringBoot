# Proyecto RetoSpringBoot

Este proyecto es una API REST para gestionar rutas, desarrollada con Spring Boot y MongoDB.

## Recursos

### Ruta

El objeto `Ruta` tiene la siguiente estructura:

```json
{
  "id": "string",
  "type": "string",
  "geometry": {
    "type": "string",
    "coordinates": [
      "double",
      "double"
    ]
  },
  "geometry_name": "string",
  "properties": {
    "ogc_fid": "integer",
    "punto": "string",
    "x": "string",
    "y": "string",
    "nombre": "string",
    "ubicacion": "string",
    "direccion": "string",
    "horario": "string",
    "telefono": "string",
    "web": "string",
    "mas_informacion": "string"
  }
}
```

## Endpoints

### GET /rutas/all_rutas

Recupera todas las rutas.

**Ejemplo de respuesta:**

```json
  {
  "geometry": {
    "coordinates": [
      373283.08,
      4065124.59
    ],
    "type": "Point"
  },
  "geometryName": "geometry",
  "id": "698b0d8344bfd6b703922a25",
  "properties": {
    "direccion": "C/ RAMÓN FRANQUELO, 10",
    "horario": "ACCESO LIBRE",
    "masInformacion": "https://rutasarqueologicas.malaga.eu/punto-n-6",
    "nombre": "TRAZA DE LA MURALLA",
    "ogcFid": 6,
    "punto": "6",
    "telefono": "",
    "ubicacion": "VÍA PÚBLICA",
    "web": "",
    "x": "373283.08",
    "y": "4065124.59"
  },
  "type": "Feature"
}
```

### GET /rutas/ruta_id/{id}

Recupera una ruta por su ID.

**Ejemplo de respuesta:**

```json
{
  "geometry": {
    "coordinates": [
      373408.43,
      4065043.79
    ],
    "type": "Point"
  },
  "geometryName": "geometry",
  "id": "698b0d8344bfd6b703922a23",
  "properties": {
    "direccion": "C/ GRANADA",
    "horario": "ACCESO LIBRE",
    "masInformacion": "https://rutasarqueologicas.malaga.eu/punto-n-4",
    "nombre": "TRAZA DE LA MURALLA EN LA PUERTA DE GRANADA",
    "ogcFid": 4,
    "punto": "4",
    "telefono": "",
    "ubicacion": "",
    "web": "",
    "x": "373408.43",
    "y": "4065043.79"
  },
  "type": "Feature"
}
```

### GET /rutas/ruta_nombre

Recupera una ruta por su nombre.

**Ejemplo de respuesta:**

```json
{
  "geometry": {
    "coordinates": [
      373396.14,
      4065051.72
    ],
    "type": "Point"
  },
  "geometryName": "geometry",
  "id": "698b0d8344bfd6b703922a24",
  "properties": {
    "direccion": "C/ MEDINA CONDE, 3",
    "horario": "CONSULTAR HORARIO",
    "masInformacion": "https://rutasarqueologicas.malaga.eu/punto-n-5",
    "nombre": "LIENZO Y TORRE DE LA MURALLA",
    "ogcFid": 5,
    "punto": "5",
    "telefono": "",
    "ubicacion": "LOCAL PRIVADO",
    "web": "",
    "x": "373396.14",
    "y": "4065051.72"
  },
  "type": "Feature"
}
```

### POST /rutas/add_ruta

Añade una nueva ruta.

**Ejemplo de body:**

```json
{
  "geometry": {
    "coordinates": [
      373246.53,
      4065079.29
    ],
    "type": "Point"
  },
  "geometryName": "geometry",
  "id": "698b0d8344bfd6b703922a26",
  "properties": {
    "direccion": "C/ RAMÓN FRANQUELO, 2",
    "horario": "CONSULTAR HORARIO",
    "masInformacion": "https://rutasarqueologicas.malaga.eu/punto-n-7",
    "nombre": "LIENZO DE LA MURALLA",
    "ogcFid": 7,
    "punto": "7",
    "telefono": "",
    "ubicacion": "LOCAL PRIVADO",
    "web": "",
    "x": "373246.53",
    "y": "4065079.29"
  },
  "type": "Feature"
}
```

### DELETE /rutas/borrar_ruta_nombre

Elimina una ruta por su nombre.

### DELETE /rutas/borrar_ruta_id/{id}

Elimina una ruta por su ID.

### PUT /rutas/actualizar_ruta_id/{id}

Actualiza una ruta por su ID.

**Ejemplo de body:**

```json
  {
  "geometry": {
    "coordinates": [
      373205.95,
      4065108.48
    ],
    "type": "Point"
  },
  "geometryName": "geometry",
  "id": "698b0d8344bfd6b703922a28",
  "properties": {
    "direccion": "C/ BEATAS, 15",
    "horario": "LUNES 10:00-16:00, MARTES-DOMINGO: 10:0019:00",
    "masInformacion": "https://rutasarqueologicas.malaga.eu/punto-n-9",
    "nombre": "MURALLA MEDIEVAL",
    "ogcFid": 9,
    "punto": "9",
    "telefono": "952210440",
    "ubicacion": "MUSEO MIMMA",
    "web": "https://www.musicaenaccion.com/",
    "x": "373205.95",
    "y": "4065108.48"
  },
  "type": "Feature"
}
```

### GET /rutas/comprobar_id/{id}

Comprueba si existe una ruta por su ID. Devuelve un status 200 si existe.

### GET /rutas/comprobar_nombre

Comprueba si existe una ruta por su nombre. Devuelve un status 200 si existe.