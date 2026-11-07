# 🐾 MundoAnimal

**Herencia | Polimorfismo | Diseño de clases en Java | Clases abstractas | Interfaces**

Programa en Java que permite poner a prueba conceptos fundamentales de Programación Orientada a Objetos mediante un ejercicio que muestra información de distintos animales, el sonido que emiten y su forma de desplazarse. El proyecto aplica los conceptos de **herencia**, **polimorfismo**, **clase abstracta** e **interfaz**.

- **Autor:** _César André García León_
- **Lenguaje:** Java
- **Paquete principal:** `mx.com.animales`

---

## 📋 Descripción

MundoAnimal es un programa que crea 4 clases que representan distintos animales: un perro, un gato, una vaca y un caballo. Todas estas clases heredan de una clase Animal y comparten características comunes (nombre y edad), pero cada uno emite un sonido distinto y se desplaza de forma diferente.

Para lograrlo, el proyecto se apoya en:

| Concepto | Dónde se aplica |
| --- | --- |
| **Clase abstracta** | `Animal` define atributos privados, un constructor, un método concreto `mostrarInformacion()` y un método abstracto `hacerSonido()`. |
| **Herencia** | `Perro`, `Gato`, `Vaca` y `Caballo` heredan de `Animal` con `extends` y llaman a `super(nombre, edad)`. |
| **Sobrescritura** | Cada clase hija implementa `hacerSonido()` con `@Override`. |
| **Interfaz** | `Movible` declara `void moverse()` y es implementada por cada animal con `implements`. |
| **Polimorfismo** | En `Main` los objetos se almacenan en un ArrayList `Animal[]` y se recorren con un for each. |

---

## 🗂️ Estructura del proyecto

```
MundoAnimal/
├── src/
│   └── mx/
│       └── com/
│           └── animales/
│               ├── Animal.java     # Clase abstracta base
│               ├── Movible.java    # Interfaz con el método moverse()
│               ├── Perro.java      # Hija de Animal, implementa Movible
│               ├── Gato.java       # Hija de Animal, implementa Movible
│               ├── Vaca.java       # Hija de Animal, implementa Movible
│               ├── Caballo.java    # Hija de Animal, implementa Movible
│               └── Main.java       # Punto de entrada y demostración de polimorfismo
└── README.md
```

## ⚙️ Requisitos

- **JDK 11 o superior** (se recomienda JDK 17+).
- Un IDE (IntelliJ IDEA, Eclipse, NetBeans, VS Code) **o** una terminal con `javac` y `java`.
- Git (para clonar el repositorio).

Para verificar tu instalación de Java:

```bash
java -version
javac -version
```

---

## ▶️ Instrucciones para ejecutar

### 1. Clonar el repositorio

```bash
git clone https://github.com/Andre1012/mundo-animal.git
cd MundoAnimal
```

### 2. Abrir el proyecto desde un IDE

1. Abre el IDE y selecciona **Abrir proyecto** (o *Import project*) apuntando a la carpeta `MundoAnimal`.
2. Verifica que la carpeta `src` esté marcada como *Source Root*.
3. Abre `Main.java` y ejecútalo (**Run**).

---

## 🖥️ Ejemplo de salida

```
Animal { Nombre: Giuseppe, Edad: 2 }
Giuseppe maulla
Giuseppe se mueve con sigilo y salta con precision

Animal { Nombre: Bolt, Edad: 3 }
Bolt ladra
Bolt corre alegremente a gran velocidad
```

---

## 🧪 Pruebas realizadas

- [x] Se imprimen los nombres y edades correctos de cada animal.
- [x] Cada animal emite su sonido propio.
- [x] Cada animal muestra su forma de desplazarse.
- [x] El proyecto compila sin errores.
- [x] No se usa `if/else` para decidir qué sonido emite cada animal.


## 💭 Preguntas de reflexión

### 1. ¿Qué se reutiliza al heredar de Animal?

Se reutilizan los **atributos** (`nombre` y `edad`), el **constructor** (a través de `super`) y el método `mostrarInformacion()`. Así, `Perro`, `Gato`, `Vaca` y `Caballo` no repiten ese código: solo agregan lo que los hace diferentes (su sonido y su movimiento).

### 2. ¿Qué hace `super(nombre, edad)`?

Invoca el **constructor de la clase padre** (`Animal`) desde la clase hija, pasándole el nombre y la edad.

### 3. ¿Para qué sirve `@Override`?

Es una anotación que indica que un método **sobrescribe** uno de la clase padre o implementa uno de una interfaz.

### 4. ¿Por qué el mismo método `hacerSonido()` produce resultados distintos?

Por el **polimorfismo**. Aunque la variable sea de tipo `Animal`, Java decide en **tiempo de ejecución** qué versión del método ejecutar según el **objeto real** al que apunta la referencia. Si es un `Perro`, ejecuta la implementación de `Perro`; si es un `Gato`, la de `Gato`; y así sucesivamente. Por eso no se necesita `if/else`.

### 5. ¿Cuál es la diferencia entre una clase abstracta y una interfaz?

| Aspecto | Clase abstracta (`Animal`) | Interfaz (`Movible`) |
| --- | --- | --- |
| Palabra clave | `extends` | `implements` |
| Herencia | Una clase solo puede extender **una** clase | Una clase puede implementar **varias** interfaces |
| Contenido | Puede tener atributos, constructores, métodos concretos y abstractos | Define principalmente un **contrato** de métodos (sin estado) |
| Relación | Representa lo que el objeto **es** (un Perro *es un* Animal) | Representa lo que el objeto **puede hacer** (un Perro *puede* moverse) |

---

## 🔗 Repositorio

https://github.com/Andre1012/mundo-animal.git

---

