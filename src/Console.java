import java.util.ArrayList;

abstract class Console implements ConsoleSpecs{

    private String name;

    public Console(String name) {
        this.name = name;
    }


    public static void getConsoles(ArrayList<Console> consoles){

        for (Console b : consoles) {
            System.out.println(b.getName());
        }
    }

    public void designConsole(){
        System.out.println("Design van elke console is anders");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void ps4Specs() {
        System.out.println("Specs ps4: " + "\n" + "Gpu: " + "x86-64 AMD “Jaguar”, 8 cores" + "\n" + "Cpu: " + "1,84 TFLOPS, AMD Radeon™-gebaseerde graphics engine" + "\n" + "Memory: " + "GDDR5 8 GB" + "\n" + "Storage: " + "500 GB, 1 TB");
    }

    @Override
    public void xboxSpecs() {
        System.out.println("Specs xbox: " + "\n" + "Gpu: " + "x86-64 AMD “Jaguar”, 8 cores" + "\n" + "Cpu: " + "1,84 TFLOPS, AMD Radeon™-gebaseerde graphics engine" + "\n" + "Memory: " + "GDDR5 8 GB" + "\n" + "Storage: " + "500 GB, 1 TB");
    }

    @Override
    public void pcSpecs() {
        System.out.println("Specs pc: " + "\n" + "Gpu: " + "x86-64 AMD “Jaguar”, 8 cores" + "\n" + "Cpu: " + "1,84 TFLOPS, AMD Radeon™-gebaseerde graphics engine" + "\n" + "Memory: " + "GDDR5 8 GB" + "\n" + "Storage: " + "500 GB, 1 TB");
    }

    @Override
    public void nintendoSpecs() {
        System.out.println("Specs nintendo: " + "\n" + "Gpu: " + "x86-64 AMD “Jaguar”, 8 cores" + "\n" + "Cpu: " + "1,84 TFLOPS, AMD Radeon™-gebaseerde graphics engine" + "\n" + "Memory: " + "GDDR5 8 GB" + "\n" + "Storage: " + "500 GB, 1 TB");
    }
}
