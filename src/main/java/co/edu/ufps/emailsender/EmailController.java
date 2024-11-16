package co.edu.ufps.emailsender;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class EmailController {

    @GetMapping("/send")
    public ResponseEntity<String> handleGet() {
        return ResponseEntity.ok("Este endpoint espera una solicitud POST con un cuerpo JSON.");
    }

    @PostMapping("/send") 
    public ResponseEntity<String>sendEmail(@RequestBody EmailRequest emailRequest) { 
    	System.out.println("Datos recibidos: " + emailRequest); // Asegúrate de imprimir los datos recibidos 
    	return ResponseEntity.ok("Email enviado con éxito"); 
    	}
}
