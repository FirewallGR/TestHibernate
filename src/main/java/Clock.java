import jakarta.persistence.*;

@Entity
@Table(name = "clocks")
public class Clock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mark;
    private int cost;
    private Boolean isTyped;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Boolean isTyped() {
        return isTyped;
    }

    public void setTyped(Boolean typed) {
        isTyped = typed;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + mark + " " + cost + " " + isTyped;
    }
}
