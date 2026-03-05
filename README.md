# Gestor de Tareas de Equipo

Aplicación de consola en Java para gestionar una lista de tareas en equipo. Permite añadir tareas y listarlas de forma interactiva.

---

## Estructura del Proyecto

```
GestorTareas/
├── src/
│   ├── Tarea.java          # Clase que representa una tarea
│   ├── GestorTareas.java   # Lógica de gestión (ArrayList de tareas)
│   └── Main.java           # Menú interactivo de consola
├── javadoc/                # Documentación generada con JavaDoc
└── README.md
```

---

## Clases Principales

- **Tarea.java**: Representa una tarea con atributos `descripcion` y `completada`, junto con su constructor, getters y setters.
- **GestorTareas.java**: Contiene la lógica del programa usando un `ArrayList<Tarea>`. Incluye los métodos `añadirTarea()` y `mostrarTareas()`.
- **Main.java**: Menú interactivo que permite al usuario añadir y listar tareas desde la consola.

---

## Funcionalidades

1. **Añadir tarea** – El usuario introduce el texto de la tarea por teclado.
2. **Listar tareas** – Muestra todas las tareas almacenadas con su estado (completada o pendiente).

---

## Cómo Ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/alexiamarcee/Tarea.git
   ```
2. Abre el proyecto en IntelliJ IDEA.
3. Compila y ejecuta `Main.java`.

---

## Flujo de Trabajo Git

El proyecto se desarrolló siguiendo el siguiente flujo de ramas:

```
main
 └── develop
      ├── feature-registro   (Alexia: añadirTarea)
      └── feature-listado    (Iván: mostrarTareas)
```

---

## Documentación

La documentación JavaDoc está generada en la carpeta `/javadoc`. Para consultarla, abre el archivo `javadoc/index.html` en tu navegador.

---

## Autores

- **Alumno A** – Clase `Tarea`, método `añadirTarea()`, opción 1 del menú.
- **Alumno B** – Método `mostrarTareas()`, opción 2 del menú.
