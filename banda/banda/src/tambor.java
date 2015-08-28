
public class tambor extends percusion{
    
    public tambor(){
        super();
        nota="si";        
    }
    
    @Override
    protected void tocar(){
        System.out.println("El instrumento de tipo "+tipo+" Tambor toco la nota "+nota);
    }
    
}
