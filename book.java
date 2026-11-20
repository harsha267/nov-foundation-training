import java.util.*;
class book{
    int id;
    String name;
    String address;
    public book(int id, String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "address='" + address + '\'' +
                '}';
    }
}