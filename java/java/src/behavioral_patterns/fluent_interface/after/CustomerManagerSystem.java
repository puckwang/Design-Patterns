package behavioral_patterns.fluent_interface.after;

class Customer {
    private Integer id;
    private String name;
    private String title;
    private String website;

    public Customer setId(Integer id) {
        this.id = id;
        return this;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public Customer setTitle(String title) {
        this.title = title;
        return this;
    }

    public Customer setWebsite(String website) {
        this.website = website;
        return this;
    }

    @Override
    public String toString() {
        return "Customer {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}

public class CustomerManagerSystem {
    public static void main(String args[]) {
        Customer customer = new Customer();
        customer.setId(14)
                .setName("Puck")
                .setTitle("Web developer")
                .setWebsite("https://blog.puckwang.com");

        System.out.print(customer);
    }
}
