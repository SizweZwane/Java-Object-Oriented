package composition;

/**
 * Created by HP on 2016/12/07.
 */
public class Composition {

    public static void main(String[] args) {

    }
}

class Cellphone{

    Network network;

    public Cellphone(Network network) {
        this.network = network;
    }
}

class Network{

}