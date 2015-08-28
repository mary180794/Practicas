
public class violin  extends cuerda{
    
    public violin(){
        super();
        nota="fa";        
    }
    
    @Override
    protected void tocar(){
        System.out.println("El instrumento de tipo "+tipo+" Violin toco la nota "+nota);
    }
}
