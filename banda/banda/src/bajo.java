
public class bajo  extends cuerda{
    
    public bajo(){
        super();
        nota="la";        
    }
    
    @Override
    protected void tocar(){
        System.out.println("El instrumento de tipo "+tipo+" bajo toco la nota "+nota);
    }
    
}
