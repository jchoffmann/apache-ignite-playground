import org.apache.ignite.Ignition;

public class StartNode {
    public static void main(String[] args) {
        Ignition.start("example-ignite.xml");
    }
}