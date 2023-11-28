import java.util.Random;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LabAssignment11 {
    public static void main(String[] args) {
        LabAssignment11 lab = new LabAssignment11();
        LabAssignment11.Account userAccount = lab.new Account(1122, 20000.00, 4.5);
        LabAssignment11.Fan fan = lab.new Fan(3, 3, true, 10, "blue");
    }

    public class Account {
        private int id;
        private double balance;
        private double annualInterestRate;
        private LocalDate dateCreated;

        public Account() {
            this.id = 0;
            this.balance = 0;
            this.annualInterestRate = 0;
            this.dateCreated = LocalDate.now();
        }

        public Account(int id, double balance, double annualInterestRate) {
            this.id = id;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
            this.dateCreated = LocalDate.now();
        }

        public void CreateAccount() {
            Random randint = new Random();
            this.id = randint.nextInt(10);
            this.balance = 0;
            this.annualInterestRate = 0;
            this.dateCreated = LocalDate.now();
        }

        public int getId() {
            return id;
        }

        public double[] getAccountInfo() {
            double[] accountInformation = { id, balance, annualInterestRate };
            return accountInformation;
        }

        public LocalDate getDateCreated() {
            return dateCreated;
        }

        public double getMonthlyInterestRate() {
            return annualInterestRate / 12;
        }

        public double getMonthlyInterest() {
            return balance * getMonthlyInterestRate();
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

        public void deposit(double amount) {
            balance += amount;
        }
    }

    public class Fan {
        public int setting;
        private int speed;
        private boolean state;
        private double radius;
        private String color;

        public Fan() {
            this.setting = 1;
            this.speed = setting;
            this.radius = 5;
            this.color = "blue";
        }

        public Fan(int setting, int speed, boolean state, double radius, String color) {
            this.setting = setting;
            this.speed = speed;
            this.state = state;
            this.radius = radius;
            this.color = color;
        }

        public String toString() {
            String description;
            String stringSpeed = "";
            if (state == false) {
                description = String.format("The fan with the radius of %.2f and is the color %s is currently off",
                        radius, color);
            } else {
                switch (speed) {
                    case 1:
                        stringSpeed = "SLOW";
                        break;
                    case 2:
                        stringSpeed = "MEDIUM";
                        break;
                    case 3:
                        stringSpeed = "FAST";
                        break;
                    default:
                        break;
                }
                description = String.format(
                        "The fan with the radius of %.2f and is the color %s is currently on running at %s", radius,
                        color, stringSpeed);
            }
            return description;
        }
    }
}
