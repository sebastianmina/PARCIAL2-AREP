# PARCIAL2-AREP

>Diseñé, construya y despliegue los siguientes servicios en un microcontenedor docker desplegado en una instancei a EC2 de AWS. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista. Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una prámetro sde tipo "Double".

>Implemente los servicios para responder al método de solicitud HTTP GET. Deben usar el nombre de la función especificado en la lista y el parámetro debe ser pasado en la variable de query con nombre "value".

### Pre-requisitos

> Para  elaborar este proyecto requeimos de dos tecnologias:
> * [Maven](https://es.wikipedia.org/wiki/Maven): Herramienta la cual permite realizar la construción de proyectos, realizarles pruebas y otras funciones.
> * [Git](https://es.wikipedia.org/wiki/Git): Software de control de versionamiento centralizado.

## Construido con

* [Maven](https://maven.apache.org/): Herramienta que se encarga de estandarizar la estructura física de los proyectos de software, maneja dependencias (librerías) automáticamente desde repositorios y administra el flujo de vida de construcción de un software.
* [GIT](https://git-scm.com/): Sistema de control de versiones que almacena cambios sobre un archivo o un conjunto de archivos, permite recuperar versiones previas de esos archivos y permite otras cosas como el manejo de ramas (branches).
* [Java](https://www.oracle.com/java/): Lenguaje de programación de propósito general, es decir, que sirve para muchas cosas, para web, servidores, aplicaciones móviles, entre otros. Java también es un lenguaje orientado a objetos, y con un fuerte tipado de variables.

## Prueba en Local
![](img/local.png)

## Prueba puerto Docker
![](img/localdocker.png)

## Prueba AWS Máquina
![](img/aws0.png)

## Prueba AWS Función SQRT
![](img/aws1.png)

## Prueba AWS Función ATAN
![](img/aws2.png)

## Video AWS Prueba funciones

https://youtu.be/ZzFJ2iXgfy4

## Instalar

1. Clonarlo
```
git clone https://github.com/sebastianmina/PARCIAL2-AREP
```
2. Compilarlo
```
mvn package
```
3. Ejecutar
```
mvn exec:java -Dexec.mainClass="edu.eci.arep.parcial2.SparkWebMath"
```
## Links de AWS

1. http://ec2-34-238-80-15.compute-1.amazonaws.com:42000/atan?value=4
2. http://ec2-34-238-80-15.compute-1.amazonaws.com:42000/sqrt?value=4

En value se puede poner cualquier valor numérico.

## Autor 

[Sebastián Mina](https://github.com/sebastianmina)

## Licencia & Derechos de Autor
**©** Sebastián Mina, Estudiante de Ingeniería de Sistemas de la Escuela Colombiana de Ingeniería Julio Garavito

Licencia bajo la [GNU General Public License](https://github.com/sebastianmina/PARCIAL2-AREP/blob/main/LICENSE.txt).
