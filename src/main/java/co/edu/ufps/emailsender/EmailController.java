package co.edu.ufps.emailsender;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) {
        System.out.println("Datos recibidos: " + emailRequest);

        // Simular el envío de email con un retraso
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Simular éxito
        return ResponseEntity.ok("Email enviado con éxito");
    }
}

