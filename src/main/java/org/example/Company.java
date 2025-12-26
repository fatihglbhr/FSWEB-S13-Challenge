package org.example;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name,double giro, String[] developerNames){
        this.id = id;
        this.name = name;
        if(giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index > developerNames.length-1 || index < 0) {
            System.out.println("Enter a valid index");
        } else if (developerNames[index] != null) {
            System.out.println("This index is already filled");
        } else {
            developerNames[index] = name;
        }
    }
    public long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void setGiro(double giro) {
        if(giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }
}


