#language:es
  Característica: Búsqueda de un libro

    Yo como usuario interesado en comprar un libro
    Quiero poder buscar un libro en la pagina de librerianacional.com
    Para agregarlo al carrito de compras

  @SmokeTest @busquedaExitosa
  Escenario: Busqueda exitosa
    Dado que el usuario abre la pagina de librenacional.com
    Cuando el usuario busca un libro
    Y de click en un libro
    Y ingrese la cantidad de libros que desea comprar
    Y de click en añadir al carrito
    Entonces el usuario verifica los detalles del producto agregado



