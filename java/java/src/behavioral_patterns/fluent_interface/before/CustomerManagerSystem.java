package behavioral_patterns.fluent_interface.before;

class Customer {
    private Integer id;
    private String name;
    private String title;
    private String website;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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
        customer.setId(14);
        customer.setName("Puck");
        customer.setTitle("Web developer");
        customer.setWebsite("https://blog.puckwang.com");

        System.out.print(customer);
    }
}
