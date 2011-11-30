/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package git.training;

/**
 *
 * @author fayimora
 */
public class Mesfin {
    private int age;
    private String city;
    
    public Mesfin()
    {
        age = 20;
        city = "London";
    }
    
    public int getAge()
    {
        return age;
    }
    public String getCity()
    {
        return city;
    }
    
    public String tellJoke()
    {
        return "Did you fell from heaven, because you look like you've landed on your face.";
    }
}
