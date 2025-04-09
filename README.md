CASO PRÁCTICO 1

DESARROLLAR E IMPLEMENTAR UNA APLICACIÓN JAVA PARA CONCESIONARIO DE COCHES

Contexto

Trabajas en una empresa como programador Java, y vuestros principales clientes son grandes empresas multinacionales con grandes volúmenes de venta. El principal cliente de vuestra empresa, un famoso concesionario de coches os ha encargado que desarrolléis una aplicación Java para ellos, adaptada tanto a los productos y servicios que ofrecen, como a sus principales clientes.

El encargo es el siguiente: debéis elaborar un programa Java permita la gestión del concesionario que trabaja con tres tipos de coches: km0, nuevos y segunda mano. Todos ellos tienen una información común: matrícula, color,modelo, precio y kilómetros recorridos.

A su vez, los coches de segunda mano y nuevos tienen una información específica: los coches de segunda mano, el nombre del antiguo propietario. y los coches nuevos, la duración de la garantía.

Los coches km0 pueden ser alquilados y los coches de segunda mano y nuevos solo vendidos.

Cuestiones a resolver

Crea una clase abstracta Coche, donde se definen los atributos mínimos para representar las características elementales de cualquier coche, que serán matricula, color, modelo, precio y kilómetros recorridos, además de un atributo de clase llamado numCochesStock, utilizado para contar los objetos de tipo Coche(que son, Km0, segunda mano o nuevos) que se instancien, este será un entero y se incrementará en 1 cada vez que se crea un objeto de una de las clases de coches que posee el concesionario.

Crea el código de las clases Java implementando una relación de herencia desde la superclase abstracta Coche hasta las subclases CocheKm0, CocheNuevo, CocheSegundaMano.

Cada clase debe disponer de constructor, así como permitir establecer y recuperar el valor de sus atributos (en caso de que los tenga) mediante métodos getter y setter, además de un método para mostrar la información del objeto, para ello deberás sobreescribir el método toString en las clases que sea necesario para mostrar la información correctamente y utilizando el principio de herencia según convenga para no volver a repetir código ya implementado.

Crea dos interfaces, una llamada Vendible y otra llamada Alquilable. Una con un método void vender () que muestre en consola “El coche X se ha vendido” y otra con un método void alquilar() que muestre “El coche X se ha alquilado”, que implementarán las clases de coches que puedan alquilar o vender, donde X será la clase de coche, que corresponderá a km0, de segunda mano o nuevo.

Crea una clase principal con el método main, donde se cree un objeto de cada tipo y se realicen las acciones necesarias para que se venda o alquile un coche km0, de segunda mano o nuevo según el tipo de coche, siempre teniendo en cuenta las especificaciones y restricciones que se han planteado en el encargo, el usuario sabrá las acciones realizadas en cada momento por los mensajes que aparecerán en consola de cada uno de los objetos creados.

Crea las clases, las relaciones de herencia e implementa las interfaces en las clases correspondientes según las indicaciones y teniendo en cuenta las restricciones y reglas a la hora de implementar clases convencionales, clases abstractas, interfaces y atributos de clase.

Para el desarrollo del código debe usarse el IDE Eclipse y se debe entregar preferiblemente solo un archivo con extensión .java que contenga un método main() para que se pueda ejecutar.
