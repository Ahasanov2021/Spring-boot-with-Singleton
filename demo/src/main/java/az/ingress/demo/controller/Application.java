package az.ingress.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class Application {

    Long id;
    String userName;
    String email;
    Integer age;

    private static Application instance;

    private Application()
    {

    }

    synchronized public static Application getInstance()
    {
        if (instance == null)
        {
            instance = new Application();
        }
        return instance;
    }
}
