package az.vgrch.practice.factory;

public abstract class Computer {

    public abstract String getRAM();
    public abstract String getCPU();
    public abstract String getHDD();

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("{");
        sb.append("RAM = " + this.getRAM());
        sb.append("CPU = " + this.getCPU());
        sb.append("HDD = " + this.getHDD());
        sb.append('}');
        return sb.toString();
    }
}
