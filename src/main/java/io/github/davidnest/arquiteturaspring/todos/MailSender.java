package io.github.davidnest.arquiteturaspring.todos;


import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void send(String to, String subject, String body) {
        System.out.println("Enviando email para: " + to);
        System.out.println("Assunto: " + subject);
        System.out.println("Corpo: " + body);
    }
}
