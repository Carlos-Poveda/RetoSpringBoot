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
[
  {
    "id": "6630b7fbac70582a4792a431",
    "type": "Feature",
    "geometry": {
      "type": "Point",
      "coordinates": [
        -16.25413,
        28.46824
      ]
    },
    "geometry_name": "the_geom",
    "properties": {
      "ogc_fid": 0,
      "punto": "1",
      "x": "375792.2",
      "y": "3149411.1",
      "nombre": "Museo de la Naturaleza y la Arqueología (MUNA)",
      "ubicacion": "MNH",
      "direccion": "C/ Fuente Morales, s/n",
      "horario": "Martes a sábado de 9:00 a 19:00 h. Domingo, lunes y festivos de 10:00 a 17:00 h.",
      "telefono": "922 535 816",
      "web": "www.museosdetenerife.org",
      "mas_informacion": ""
    }
  }
]
```

### GET /rutas/ruta_id/{id}

Recupera una ruta por su ID.

**Ejemplo de respuesta:**

```json
{
  "id": "6630b7fbac70582a4792a431",
  "type": "Feature",
  "geometry": {
    "type": "Point",
    "coordinates": [
      -16.25413,
      28.46824
    ]
  },
  "geometry_name": "the_geom",
  "properties": {
    "ogc_fid": 0,
    "punto": "1",
    "x": "375792.2",
    "y": "3149411.1",
    "nombre": "Museo de la Naturaleza y la Arqueología (MUNA)",
    "ubicacion": "MNH",
    "direccion": "C/ Fuente Morales, s/n",
    "horario": "Martes a sábado de 9:00 a 19:00 h. Domingo, lunes y festivos de 10:00 a 17:00 h.",
    "telefono": "922 535 816",
    "web": "www.museosdetenerife.org",
    "mas_informacion": ""
  }
}
```

### GET /rutas/ruta_nombre

Recupera una ruta por su nombre.

**Ejemplo de respuesta:**

```json
{
  "id": "6630b7fbac70582a4792a431",
  "type": "Feature",
  "geometry": {
    "type": "Point",
    "coordinates": [
      -16.25413,
      28.46824
    ]
  },
  "geometry_name": "the_geom",
  "properties": {
    "ogc_fid": 0,
    "punto": "1",
    "x": "375792.2",
    "y": "3149411.1",
    "nombre": "Museo de la Naturaleza y la Arqueología (MUNA)",
    "ubicacion": "MNH",
    "direccion": "C/ Fuente Morales, s/n",
    "horario": "Martes a sábado de 9:00 a 19:00 h. Domingo, lunes y festivos de 10:00 a 17:00 h.",
    "telefono": "922 535 816",
    "web": "www.museosdetenerife.org",
    "mas_informacion": ""
  }
}
```

### POST /rutas/add_ruta

Añade una nueva ruta.

**Ejemplo de body:**

```json
{
  "type": "Feature",
  "geometry": {
    "type": "Point",
    "coordinates": [
      -16.25413,
      28.46824
    ]
  },
  "geometry_name": "the_geom",
  "properties": {
    "ogc_fid": 0,
    "punto": "1",
    "x": "375792.2",
    "y": "3149411.1",
    "nombre": "Museo de la Naturaleza y la Arqueología (MUNA)",
    "ubicacion": "MNH",
    "direccion": "C/ Fuente Morales, s/n",
    "horario": "Martes a sábado de 9:00 a 19:00 h. Domingo, lunes y festivos de 10:00 a 17:00 h.",
    "telefono": "922 535 816",
    "web": "www.museosdetenerife.org",
    "mas_informacion": ""
  }
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
  "type": "Feature",
  "geometry": {
    "type": "Point",
    "coordinates": [
      -16.25413,
      28.46824
    ]
  },
  "geometry_name": "the_geom",
  "properties": {
    "ogc_fid": 0,
    "punto": "1",
    "x": "375792.2",
    "y": "3149411.1",
    "nombre": "Museo de la Naturaleza y la Arqueología (MUNA)",
    "ubicacion": "MNH",
    "direccion": "C/ Fuente Morales, s/n",
    "horario": "Martes a sábado de 9:00 a 19:00 h. Domingo, lunes y festivos de 10:00 a 17:00 h.",
    "telefono": "922 535 816",
    "web": "www.museosdetenerife.org",
    "mas_informacion": ""
  }
}
```

### GET /rutas/comprobar_id/{id}

Comprueba si existe una ruta por su ID. Devuelve un status 200 si existe.

### GET /rutas/comprobar_nombre

Comprueba si existe una ruta por su nombre. Devuelve un status 200 si existe.
