package core;

public class Materiels {
    private String name;
    private String type;
    private Human owner;

    public Materiels(String name, String type, Human owner) {
        this.name = name;
        this.type = type;
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Human getUser() {
        return owner;
    }

    public void setUser(Human user) {
        this.owner = user;
    }

    public Materiels(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Materiels{" +
                "Nom du Materiel='" + name + '\'' +
                ", Type='" + type + '\'' +
                ", Nom du Proprietaire='" + owner.getFname()+" "+owner.getLname() + '\'' +
                '}';
    }
}
