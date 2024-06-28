package az.ingress.demo.controller;


import az.ingress.demo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app/v2")
public class ApplicationControllerv2 {

    private final ApplicationService applicationService;

    public ApplicationControllerv2(@Qualifier("applicationServiceImplv2") ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/{id}")
    public Application get(@PathVariable Long id){
        return applicationService.get(id);
    }

    @PostMapping
    public Application create(@RequestBody Application application){
        return applicationService.create(application);
    }

    @PutMapping
    public Application update(@RequestBody Application application){
        return applicationService.update(application);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        applicationService.delete(id);
    }
}
