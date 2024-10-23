package br.com.fiap.twoespwx.libunclealegnment.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.twoespwx.libunclealegnment.api.input.DistanceInput;
import br.com.fiap.twoespwx.libunclealegnment.service.DistanceService;


@RestController
@RequestMapping("/v1/alignment")
public class AlignmentController {

    private DistanceService distanceService;
    
    public AlignmentController(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

    @GetMapping("/")
    public String home() {
        return "/v1/alignment/home";
    }

    @PostMapping("/distance")
    public Double distance(@RequestBody DistanceInput input) {
        Double result = distanceService.calculate(input);
        return result;
    }
    
}
