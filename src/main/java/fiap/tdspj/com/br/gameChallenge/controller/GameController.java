package fiap.tdspj.com.br.gameChallenge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@org.springframework.web.bind.annotation.RestController
public class GameController {
    private static final List<String> store = new ArrayList<>();
    @GetMappin("/")
    public String home(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        model.addAttribute("itens", List.of("Relatório", "Métricas", "Exportação"));
        return "dashbord";
    }
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("loginMessage", "Bem-vindo!");
        return "login";
    }
    @GetMapping("/do-something")
    public String doSomething(Model model) {
        store.add("Novo registro " + LocalDateTime.now());
        model.addAttribute("message", "Feito com sucesso!");
        model.addAttribute("itens", new ArrayList<>(store));
        model.addAttribute("now", LocalDateTime.now());
        model.addAttribute("pageTitle", "Dashboard");
        return "dashboard";
    }
}
