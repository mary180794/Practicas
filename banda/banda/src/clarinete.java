
public class clarinete  extends viento{
    
    public clarinete(){
        super();
        nota="mi";        
    }
    
    @Override
    protected void tocar(){
        System.out.println("El instrumento de tipo "+tipo+" Clarinete toco la nota "+nota);
    }
    
}
