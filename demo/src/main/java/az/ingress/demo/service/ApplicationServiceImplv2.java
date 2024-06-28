package az.ingress.demo.service;

import az.ingress.demo.controller.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
//@Primary
public class ApplicationServiceImplv2 implements ApplicationService {


    @Override
    public Application get(Long id){
        log.info("Application service v2 get method is working.");
        Application a = Application.getInstance();
        if(a.getId()==id){
            return a;
        } else {
            System.out.println("Such user does not exist.");
            return null;
        }
    }

    @Override
    public Application create(Application application){
        log.info("Application service v2 create method is working.");
        Application a = Application.getInstance();
        if(a.getId()==application.getId()) {
            System.out.println("Such user already exists.");
            return null;
        }
        else {
            a.setId(application.getId());
            a.setAge(application.getAge());
            a.setEmail(application.getEmail());
            a.setUserName(application.getUserName());
            return a;
        }
    }

    @Override
    public Application update(Application application){
        log.info("Application service v2 update method is working.");
        Application a = Application.getInstance();
        if(a.getId()==application.getId()) {
            a.setId(application.getId());
            a.setAge(application.getAge());
            a.setEmail(application.getEmail());
            a.setUserName(application.getUserName());
            return a;
        }
        else {
            System.out.println("Such user does not exist.");
            return null;
        }
    }

    @Override
    public void delete(Long id){
        log.info("Application service v2 delete method is working.");
        Application a = Application.getInstance();
        if(a.getId()==id){
            System.out.println("Deleting a student with id = " + a.getId());;
        } else {
            System.out.println("Such user does not exist.");
        }
    }
}
