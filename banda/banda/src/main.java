
public class main {
    public static void main(String []args){
        instrumento []banda=new instrumento[9];
        banda[0]=new armonica();
        banda[1]=new bajo();
        banda[2]=new bombo();
        banda[3]=new clarinete();
        banda[4]=new flauta();
        banda[5]=new guitarra();
        banda[6]=new platillos();
        banda[7]=new tambor();
        banda[8]=new violin();
        for(int i=0;i<banda.length;i++){
            banda[i].tocar();
        }
        
    }
}
