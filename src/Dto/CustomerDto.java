package Dto;

public class CustomerDto {
    private int id;
    private String fullName;
   
    public CustomerDto(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}

