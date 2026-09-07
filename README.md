# ms-notificaciones

Microservicio de Notificaciones — Biblioteca Digital EDUCA+
Asignatura: Java: Diseño y Construcción de Soluciones Nativas en Nube

## Propósito general
Enviar notificaciones por correo a los usuarios sobre vencimientos de préstamos y otros eventos importantes.

## Funciones clave
- Recibir eventos de vencimiento 
- enviar correos de notificación 
- guardar un historial de los mensajes enviados.

## Interacciones con otros microservicios
Recibe eventos de ms-prestamos mediante un Event Bus o cola y utiliza un servicio externo para enviar los correos.

## Justificación del aislamiento
Depende de un servicio externo que podría fallar o retrasarse, por lo que aislarlo evita afectar al resto del sistema y permite reemplazarlo o escalarlo de forma independiente.

## Tecnología
- Java 17 + Spring Boot (Spring Web)
- Maven
- Comunicación: Event Bus / Cola de mensajes (consumidor de eventos
  desde ms-prestamos)
- Servicio externo: proveedor de correo (SMTP / SendGrid)
- Base de datos: opcional, solo para historial/log de notificaciones enviadas
- Patrón aplicado: Circuit Breaker (evita fallas en cascada si el
  proveedor de correo no responde)
