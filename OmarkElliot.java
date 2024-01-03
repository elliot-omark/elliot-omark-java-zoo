
/**
 * a giraffe is Elliot omarks Animal
 * 
 * @author Mr. Jaffe
 * @version 1.0 2017-07-14
 */
public class OmarkElliot extends Animal
{
    public OmarkElliot() {
        super("Elliot Omark", "yellow", 4);
    }

    public String getType() {
        return "Giraffe";
    }

    public String speak(){
        return "grunt";
    }

    public String getDisposition(){
        return "happy";
    }

    public String getName() {
        return "Mable";
    }
}