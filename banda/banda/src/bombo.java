
public class bombo  extends percusion{
    
    public bombo(){
        super();
        nota="re";        
    }
    
    @Override
    protected void tocar(){
        System.out.println("El instrumento de tipo "+tipo+" Bombo toco la nota "+nota);
    }
    
}
