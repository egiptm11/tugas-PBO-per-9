public class MainConstructor {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setNama("Andi Herlambang");
        m.setGajiPokok(5000000);
        m.setTunjangan(2500000);
        m.cetakInfo();
        System.out.println("--------------------------------");
        Programmer p = new Programmer();
        p.setNama("Riko");
        p.setGajiPokok(6000000);
        p.setBonus(5000000);
        p.cetakInfo();
        System.out.println("--------------------------------");
        Programmer programmer = new Programmer();
        p.setNama("Dina");
        p.setGajiPokok(6000000);
        p.setBonus(3000000);
        p.cetakInfo();
    }
}