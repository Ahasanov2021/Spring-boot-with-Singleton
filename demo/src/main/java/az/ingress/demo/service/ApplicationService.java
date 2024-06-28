package az.ingress.demo.service;

import az.ingress.demo.controller.Application;

public interface ApplicationService {
    Application get(Long id);

    Application create(Application application);

    Application update(Application application);

    void delete(Long id);
}
