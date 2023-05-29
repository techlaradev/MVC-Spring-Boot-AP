package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Carro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/carros")
public class CarroController {

    public List<Carro> carros = new ArrayList<Carro>();

    public CarroController() {
        carros.add(new Carro("11223", "Duster", 30000, 15000));
        carros.add(new Carro("44556", "Ford KA", 45000, 21000));
        carros.add(new Carro("65890", "Palio", 27000, 12000));
        carros.add(new Carro("89002", "Opala", 90000, 50000));
    }

    @GetMapping
    public String getCarros(Model model) {
        model.addAttribute("carros", carros);
        return "carros";
    }
}