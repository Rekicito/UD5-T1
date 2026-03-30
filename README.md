# Proyecto D&D

Proyecto de Programación en Java realizado para practicar herencia, clases, métodos, atributos estáticos y uso de GitHub con ramas y commits.

## Objetivo

Desarrollar una pequeña aplicación inspirada en D&D con distintos tipos de personajes:

- personaje
- guerrero
- mago

Además, el proyecto se ha gestionado con Git y GitHub usando ramas, commits y merges.

## Estructura del proyecto

El proyecto contiene las siguientes clases:

- `personaje`: clase base con nombre, nivel y energía.
- `guerrero`: hereda de personaje y añade el atributo arma.
- `mago`: hereda de personaje y añade el atributo elemento.
- `App`: clase principal donde se crean los objetos y se prueban sus métodos.

## Funcionalidades

### Clase personaje
- atributo `nombre`
- atributo `nivel`
- atributo `energia`
- atributo estático `totalPersonajes`
- método `entrenar(int x)`
- método `descansar(int x)`
- método `gastarEnergia(int x)`
- método `mostrarInfo()`
- método estático `mostrarTotalPersonajes()`

### Clase guerrero
- hereda de `personaje`
- añade el atributo `arma`
- método `ataquePesado()`
- sobrescribe `mostrarInfo()`

### Clase mago
- hereda de `personaje`
- añade el atributo `elemento`
- método `ataqueElemental()`
- sobrescribe `mostrarInfo()`

### Clase App
En la clase principal se:
- crean varios personajes
- se ejecutan sus métodos
- se muestra el total de personajes creados
- se guardan en un array llamado `reino`
- se recorren con un bucle para mostrar su información

## Ramas usadas

Durante el desarrollo del proyecto se han utilizado varias ramas:

- `main`
- `feature`
- `personaje`
- `guerrero`
- `mago`
- `app`

## Tecnologías usadas

- Java
- Git
- GitHub
- Visual Studio Code