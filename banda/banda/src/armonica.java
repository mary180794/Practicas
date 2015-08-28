
public class armonica extends viento{
    
    public armonica(){
        super();        
        nota="re";
    }
    
    @Override
    protected void tocar(){
        System.out.println("El instrumento de tipo "+tipo+" Armónica toco la nota "+nota);
    }
}
