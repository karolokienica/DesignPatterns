interface DBConnectionInterface{
    public int connect();
}

class MySqlConnection implements DBConnectionInterface{
    @Override
    public int connect() {
        return 1;
    }
}

public class PasswordReminder {
    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnetion){
        this.dbConnection = dbConnetion;
    }
}