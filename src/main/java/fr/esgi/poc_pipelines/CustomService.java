package fr.esgi.poc_pipelines;


/**
 * Custom class with a method test which return "test"
 */
public class CustomService {
    /**
     * it is a test
     * @param name : it is the name
     * @return test
     */
    public String test(String name) {
        System.out.println(name);
        return "test";
    }

    public String toto(String name) {
        System.out.println(name);
        return "toto";
    }
}
