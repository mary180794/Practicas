
public class guitarra  extends cuerda{
    
    public guitarra(){
        super();
        nota="sol";        
    }
    
    @Override
    protected void tocar(){
        System.out.println("El instrumento de tipo "+tipo+" Guitarra toco la nota "+nota);
    }
    
}
