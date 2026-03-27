package persona;
public class Persona 
{
    public String Nombre;
    public int Edad;
    
    
    public void Saludar()
    {
        System.out.println("Hola soy " + Nombre + " y tengo " + Edad + "años.");
    }
    
    
    public static void main(String[] args) 
    {
      Persona p1 =new Persona();
      Persona p2 =new Persona();
      Persona p3 =new Persona();
      
      p1.Nombre = "Santiago";
      p1.Edad = 17;
      p2.Nombre = "Cristiano";
      p2.Edad = 42;
      p3.Nombre = "Messi";
      p3.Edad = 38;
      
      
      p1.Saludar();
      p2.Saludar();
      p3.Saludar();
    }
    
}
