package in.abdulmajid.EmailSendDemo.Controller;

import in.abdulmajid.EmailSendDemo.Model.MailStructure;
import in.abdulmajid.EmailSendDemo.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//restcont
@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    private MailService mailService;
   @RequestMapping("/send/{mail}")
    public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure)
   {
     mailService.sendEmail(mail, mailStructure);
       return "Mail send succfully";
   }
}
