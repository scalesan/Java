class Machine{
    private String name;
    private int code;
    public Machine(){
        this("Tasha", 20);
        System.out.println("Constructor running!");
    }

    public Machine(String name){
        this(name,0);
        System.out.println("Second Constructor Running!");
        this.name = name;
    }

    public Machine(String name, int code){
        System.out.println("Third Constructor Running!");
        this.name = name;
        this.code = code;
        // this.code = code;
    }

	public String start() {
		return null;
	}

	public void stop() {
	}
}

public class MachineApp{
    public static void main(String[] args){
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Bertie");
        Machine machine3 = new Machine("Wright", 20);
    }
}