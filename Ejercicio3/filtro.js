// Datos iniciales de productos
const productos = [
    {nombre: "Zapato negro", tipo: "zapato", color: "negro", img: "./taco-negro.jpg"},
    {nombre: "Zapato azul", tipo: "zapato", color: "azul", img: "./taco-azul.jpg"},
    {nombre: "Bota negra", tipo: "bota", color: "negro", img: "./bota-negra.jpg"},
    {nombre: "Bota azul", tipo: "bota", color: "azul", img: "./bota-azul.jpg"},
    {nombre: "Zapato rojo", tipo: "zapato", color: "rojo", img: "./zapato-rojo.jpg"}
  ];
  
  // Seleccionamos el contenedor donde vamos a mostrar los productos
  const li = document.getElementById("lista-de-productos");
  // Seleccionamos el campo de entrada para obtener el texto del filtro
  const $i = document.querySelector('.input');
  
  // Función para mostrar los productos en la página
  const mostrarProductos = (productos) => {
    for (let i = 0; i < productos.length; i++) {
      var d = document.createElement("div");
      d.classList.add("producto");  // Añadir clase para estilo
  
      var ti = document.createElement("p");
      ti.classList.add("titulo");
      ti.textContent = productos[i].nombre;  // Mostrar nombre del producto
  
      var imagen = document.createElement("img");
      imagen.setAttribute('src', productos[i].img);  // Añadir la imagen del producto
  
      d.appendChild(ti);
      d.appendChild(imagen);
  
      li.appendChild(d);  // Añadir el producto al contenedor
    }
  };
  
  // Mostrar todos los productos inicialmente
  mostrarProductos(productos);
  
  // Seleccionamos el botón para aplicar el filtro
  const botonDeFiltro = document.querySelector("button");
  
  // Evento de clic en el botón de filtro
  botonDeFiltro.onclick = function() {
    // Limpiar la lista de productos mostrada
    while (li.firstChild) {
      li.removeChild(li.firstChild);
    }
  
    // Obtener el texto del filtro ingresado
    const texto = $i.value;
    // Filtrar los productos según el texto ingresado
    const productosFiltrados = filtrado(productos, texto);
  
    // Mostrar los productos filtrados
    mostrarProductos(productosFiltrados);
  }
  
  // Función para filtrar los productos según el texto ingresado
  const filtrado = (productos = [], texto) => {
    const textoLower = texto.toLowerCase();  // Convertir a minúsculas para hacer la comparación más flexible
    return productos.filter(item =>
      item.tipo.toLowerCase().includes(textoLower) ||  // Filtra por tipo
      item.color.toLowerCase().includes(textoLower)  // Filtra por color
    );
  }
  