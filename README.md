# PARCIAL2-AREP

>Diseñé, construya y despliegue los siguientes servicios en un microcontenedor docker desplegado en una instancei a EC2 de AWS. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista. Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una prámetro sde tipo "Double".

>Implemente los servicios para responder al método de solicitud HTTP GET. Deben usar el nombre de la función especificado en la lista y el parámetro debe ser pasado en la variable de query con nombre "value".

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

http://ec2-34-238-80-15.compute-1.amazonaws.com:42000/atan?value=4
http://ec2-34-238-80-15.compute-1.amazonaws.com:42000/str?value=4

En value se puede poner cualquier valor numérico.
