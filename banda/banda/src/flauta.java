
public class flauta extends viento{
    
    public flauta(){
        super();
        nota="do";        
    }
    
    @Override
    protected void tocar(){
        System.out.println("El instrumento de tipo "+tipo+" Flauta toco la nota "+nota);
    }
}
