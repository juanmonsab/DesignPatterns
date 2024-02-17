# Patrones de Diseño

## Sistema de Gestión de Restaurantes

**Patrón Utilizado: Patrón Factory Method**

**Propósito**: El patrón Factory Method se seleccionó para facilitar la creación de diferentes tipos de órdenes en un sistema de gestión de restaurantes. Permite que las subclases decidan qué tipo de pedido se debe crear, como órdenes de comida, bebida y postre, sin duplicar código.

**Beneficios**:
- Permite crear diferentes tipos de órdenes de manera flexible.
- Evita repetir código al reutilizar la estructura común de creación de órdenes.

---

## Sistema de Gestión de Tareas

**Patrón Utilizado: Patrón Command**

**Propósito**: El patrón Command se eligió para manejar las acciones que los usuarios pueden realizar sobre las tareas en un sistema de gestión de tareas. Esto incluye crear, editar, eliminar y completar tareas, permitiendo también revertir acciones si es necesario.

**Beneficios**:
- Facilita el manejo de acciones sobre las tareas.
- Permite agregar nuevas acciones sin cambiar el código existente.
- Facilita deshacer acciones realizadas.

---

## Construcción de un Menú de Restaurante

**Patrón Utilizado: Patrón Builder**

**Propósito**: El patrón Builder se utiliza para construir menús de manera estructurada y paso a paso en un sistema de gestión de restaurantes. Esto facilita la creación de diferentes variantes de menús y mejora la comprensión del código.

**Beneficios**:
- Facilita la creación de diferentes variantes de menús.
- Mejora la comprensión del código.

---

## Decoración de Habitaciones en un Hotel

**Patrón Utilizado: Patrón Decorator**

**Propósito**: El patrón Decorator se utiliza para agregar características adicionales y personalizadas a las habitaciones de un hotel. Esto permite personalizar la experiencia del huésped y mejorar la comprensión del código al separar las funciones.

**Beneficios**:
- Permite agregar características personalizadas a las habitaciones.
- Mejora la comprensión del código.

---

## Implementación de un Sistema de Envío

**Patrón Utilizado: Patrón Bridge**

**Propósito**: El patrón Bridge se utiliza para separar la abstracción de los envíos de sus implementaciones concretas en un sistema de envío. Esto facilita la incorporación de nuevos tipos de envíos y servicios sin afectar el código existente.

**Beneficios**:
- Facilita la incorporación de nuevos tipos de envíos y servicios.
- Mejora la comprensión y mantenibilidad del código.
