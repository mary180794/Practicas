
public class platillos  extends percusion{
    
    public platillos(){
        super();
        nota="do";        
    }
    
    @Override
    protected void tocar(){
        System.out.println("El instrumento de tipo "+tipo+" Platillo toco la nota "+nota);
    }
    
}
