# Proyecto Final: API para Gestión de Bazar

## 📋 Descripción
Este proyecto consiste en el desarrollo de una API que permita la gestión de ventas, productos y clientes para un bazar. El objetivo es facilitar el registro de operaciones y el manejo del stock de productos, utilizando un backend centralizado que pueda ser consumido tanto por una aplicación web como por una aplicación móvil.

---

## 🛠️ Modelado de Datos
La aplicación está basada en las siguientes entidades:

### **Producto**
- `Long` codigo_producto
- `String` nombre
- `String` marca
- `Double` costo
- `Double` cantidad_disponible

### **Venta**
- `Long` codigo_venta
- `LocalDate` fecha_venta
- `Double` total
- `List<Producto>` listaProductos
- `Cliente` unCliente

### **Cliente**
- `Long` id_cliente
- `String` nombre
- `String` apellido
- `String` dni

---

## ✨ Requerimientos
### **1. CRUD de Productos**
- **Métodos HTTP:** GET, POST, DELETE, PUT
- **Endpoints:**
  - Crear producto: `POST /productos/crear`
  - Listar productos: `GET /productos`
  - Obtener producto por código: `GET /productos/{codigo_producto}`
  - Eliminar producto: `DELETE /productos/eliminar/{codigo_producto}`
  - Editar producto: `PUT /productos/editar/{codigo_producto}`

### **2. CRUD de Clientes**
- **Métodos HTTP:** GET, POST, DELETE, PUT
- **Endpoints:**
  - Crear cliente: `POST /clientes/crear`
  - Listar clientes: `GET /clientes`
  - Obtener cliente por ID: `GET /clientes/{id_cliente}`
  - Eliminar cliente: `DELETE /clientes/eliminar/{id_cliente}`
  - Editar cliente: `PUT /clientes/editar/{id_cliente}`

### **3. CRUD de Ventas**
- **Métodos HTTP:** GET, POST, DELETE, PUT
- **Endpoints:**
  - Crear venta: `POST /ventas/crear`
  - Listar ventas: `GET /ventas`
  - Obtener venta por código: `GET /ventas/{codigo_venta}`
  - Eliminar venta: `DELETE /ventas/eliminar/{codigo_venta}`
  - Editar venta: `PUT /ventas/editar/{codigo_venta}`

### **4. Productos con stock bajo**
- **Métodos HTTP:** GET
- **Endpoint:** `GET /productos/falta_stock`
- **Descripción:** Obtiene todos los productos con `cantidad_disponible` menor a 5.

### **5. Productos de una venta específica**
- **Métodos HTTP:** GET
- **Endpoint:** `GET /ventas/productos/{codigo_venta}`
- **Descripción:** Obtiene la lista de productos asociados a una venta.

### **6. Resumen de ventas por fecha**
- **Métodos HTTP:** GET
- **Endpoint:** `GET /ventas/{fecha_venta}`
- **Descripción:** Obtiene la suma total y cantidad de ventas realizadas en una fecha específica.

### **7. Venta con el monto más alto**
- **Métodos HTTP:** GET
- **Endpoint:** `GET /ventas/mayor_venta`
- **Descripción:** Devuelve los datos de la venta con el monto más alto:
  - `codigo_venta`
  - `total`
  - Cantidad de productos
  - Nombre y apellido del cliente

---

## ⭐ Bonus (Opcional)
Se pueden agregar endpoints adicionales o implementar mejoras, como:
- Descontar stock automáticamente al realizar una venta.
- Validar disponibilidad de productos antes de completar una venta.
- Otros requerimientos según las necesidades del bazar.

---

## 🚀 Cómo ejecutar el proyecto
1. Clona este repositorio:  
   ```bash
   git clone https://github.com/usuario/repo.git
