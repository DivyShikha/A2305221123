package q1;
package com.q1.AverageController;

import com.q1.AverageResponse;
import com.q1.AverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/number")
public class AverageController {

    @Autowired
    private AverageService averageService;

    @PostMapping("/{numberId}")
    public AverageResponse addNumber(@PathVariable int numberId) {
        return averageService.addNumber(numberId);
    }
}


