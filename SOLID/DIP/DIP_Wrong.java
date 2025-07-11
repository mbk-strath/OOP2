// High-level module depends directly on concrete class
class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

class ServiceBad {
    private final MySQLDatabase db = new MySQLDatabase(); // Tight coupling

    public void persist(String data) {
        db.save(data);
    }
}

public class DIP_Wrong {
    public static void main(String[] args) {
        ServiceBad service = new ServiceBad();
        service.persist("Invoice Data");
    }
}
