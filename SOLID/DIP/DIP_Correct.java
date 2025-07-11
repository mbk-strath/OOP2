// High-level module depends on abstraction
interface Database {
    void save(String data);
}

// Low-level module implements the abstraction
class SQLDatabase implements Database {
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

// Depends on interface, not implementation
class Service {
    private final Database db;

    public Service(Database db) {
        this.db = db;
    }

    public void persist(String data) {
        db.save(data);
    }
}

public class DIP_Correct {
    public static void main(String[] args) {
        Database db = new SQLDatabase();
        Service service = new Service(db);
        service.persist("Invoice Data");
    }
}
