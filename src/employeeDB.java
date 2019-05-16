class Employee {
    int emp_code;
    String emp_name;
    String emp_address;
    int emp_phone;

    float da = 0.1f;
    float hra = 0.2f;

    public Employee() {
        this.emp_code = 0;
        this.emp_name = "John Doe";
        this.emp_address = "96214 Annette Radial Apt. 54";
        this.emp_phone = 123456789;
    }

    public Employee(int emp_code, String emp_name, String emp_address, int emp_phone) {
        this.emp_code = emp_code;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_phone = emp_phone;
    }

    void showEmployee() {
        System.out.println("Employee Code: " + this.emp_code + " Name: " + this.emp_name + " Address: " + this.emp_address + " Phone: " + this.emp_phone);
    }

    float calculateSalary(float basic) {
        return basic + basic * this.da + basic * this.hra;
    }
}

class Teaching extends Employee {
    String subject;
    String designation;

    public Teaching(int emp_code, String emp_name, String emp_address, int emp_phone, String subject, String designation) {
        super(emp_code, emp_name, emp_address, emp_phone);
        this.subject = subject;
        this.designation = designation;
    }
}

class Office extends Employee {
    String designation;

    public Office(int emp_code, String emp_name, String emp_address, int emp_phone, String designation) {
        super(emp_code, emp_name, emp_address, emp_phone);
        this.designation = designation;
    }
}

class faculty extends Teaching {
    float basic;

    public faculty(int emp_code, String emp_name, String emp_address, int emp_phone, String subject, String designation, float basic) {
        super(emp_code, emp_name, emp_address, emp_phone, subject, designation);
        this.basic = basic;
    }
}

class technical extends Teaching {
    float basic;

    public technical(int emp_code, String emp_name, String emp_address, int emp_phone, String subject, String designation, float basic) {
        super(emp_code, emp_name, emp_address, emp_phone, subject, designation);
        this.basic = basic;
    }
}

class administrative extends Office {
    float basic;

    public administrative(int emp_code, String emp_name, String emp_address, int emp_phone, String designation, float basic) {
        super(emp_code, emp_name, emp_address, emp_phone, designation);
        this.basic = basic;
    }
}

class accounts extends Office {
    float basic;

    public accounts(int emp_code, String emp_name, String emp_address, int emp_phone, String designation, float basic) {
        super(emp_code, emp_name, emp_address, emp_phone, designation);
        this.basic = basic;
    }
}

public class employeeDB {
    public static void main(String[] args) {
        faculty f1 = new faculty(13345, "Anand Bone", "9705 Blue Spring St., Prattville, AL 36067", 87284713, "Mathematics", "Assistant Professor", 25371.5f);
        f1.showEmployee();
        System.out.println("Salary Statement - ");
        System.out.println("Basic = " + f1.basic + "\nDA = " + f1.basic * f1.da + "\nHRA = " + f1.basic * f1.hra + "\nNet Salary = " + f1.calculateSalary(f1.basic));
    }
}
