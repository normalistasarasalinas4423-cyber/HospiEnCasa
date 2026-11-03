# Hospiencasa - Módulo web de citas veterinarias

**Evidencia:** GA7-220501096-AA2-EV02  
**Aprendiz:** Shara Daniela Salinas  
**Programa:** Análisis y Desarrollo de Software - SENA  
**Ficha:** 3336047

## Descripción
Módulo académico para registrar y consultar citas veterinarias. Incluye formulario HTML, servlet con métodos `doGet()` y `doPost()`, páginas JSP y estilos CSS.

## Tecnologías
- Java 17
- Jakarta Servlet 6.0
- JSP
- HTML5 y CSS3
- Maven
- Apache Tomcat 10.1 o superior
- Git y GitHub

## Ejecución
1. Instalar JDK 17, Maven y Apache Tomcat 10.1.
2. Abrir la carpeta del proyecto en un IDE como Eclipse o IntelliJ IDEA.
3. Ejecutar `mvn clean package`.
4. Copiar `target/hospiencasa.war` a la carpeta `webapps` de Tomcat.
5. Iniciar Tomcat y abrir `http://localhost:8080/hospiencasa/`.

## Pruebas realizadas
1. Abrir la página y comprobar que se muestra el formulario.
2. Enviar el formulario vacío: el sistema debe mostrar validación.
3. Registrar una cita con todos los campos: debe aparecer el mensaje de confirmación.
4. Verificar que la cita aparezca en la tabla.
5. Actualizar la página mediante GET y comprobar que se muestra el listado.

## Funcionamiento técnico
- `GET /citas`: consulta las citas y envía la información a la vista JSP.
- `POST /citas`: recibe y valida los datos del formulario y registra la cita.
- `Cita`: clase modelo que representa una cita.
- `CitaRepository`: almacena temporalmente las citas en memoria.

**Nota:** esta versión académica guarda los datos en memoria; al reiniciar el servidor, las citas se pierden. No representa todavía una conexión a base de datos.

## Repositorio GitHub
Pegar aquí el enlace real del repositorio público creado por la aprendiz:
`https://github.com/USUARIO/REPOSITORIO`
