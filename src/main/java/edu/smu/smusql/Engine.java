package edu.smu.smusql;

public class Engine {
    
    public String executeSQL(String query) {
        String[] tokens = query.trim().split("\\s+");
        String command = tokens[0].toUpperCase();

        switch (command) {
            case "CREATE":
                return create(tokens);
            case "INSERT":
                return insert(tokens);
            case "SELECT":
                return select(tokens);
            case "UPDATE":
                return update(tokens);
            case "DELETE":
                return delete(tokens);
            default:
                return "ERROR: Unknown command";
        }
    }

    public String insert(String[] tokens) {
        //TODO
        return "not implemented";
    }
    public String delete(String[] tokens) {
        //TODO
        return "not implemented";
    }

    public String select(String[] tokens) {
        //TODO
        return "not implemented";
    }
    public String update(String[] tokens) {
        //TODO
        return "not implemented";
    }
    public String create(String[] tokens) {
        if (!tokens[1].equalsIgnoreCase("TABLE")) {
            return "ERROR: Invalid CREATE TABLE syntax";
        }
        

        return "not implemented";
    }

}
