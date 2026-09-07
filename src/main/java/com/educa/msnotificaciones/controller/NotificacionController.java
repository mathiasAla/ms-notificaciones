package com.educa.msnotificaciones.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notificaciones")
public class NotificacionController {

    @PostMapping("/enviar")
    public String enviarNotificacion(@RequestBody String notificacion) {
        return "Notificacion enviada correctamente";
    }

    @GetMapping("/historial")
    public String historial() {
        return "Historial de notificaciones enviadas";
    }
}
